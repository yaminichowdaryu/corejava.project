package java2mysql;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class airline_reservation {
	
static void select()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlineproject","root","L@kshmi23");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from bookingairline");
			while(rs.next())
			{
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

public void delete() {
    try{ Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlineproject","root","L@kshmi23"); 
    Statement st=con.createStatement(); 
	st.executeUpdate("delete from bookingairline where seatno = 100"); 	
	System.out.println("Ticket deleted Successfully!");
	con.close(); 
	} 
	catch(Exception e)
	{ 
	   System.out.println(e.toString());
	}
	}
public void insert() {
	try{ Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlineproject","root","L@kshmi23"); 
	Statement st=con.createStatement(); 
	st.executeUpdate(("insert into bookingairline values(105,'deepika',22,'chennai','andra pradhesh','2020-06-20')"));
	System.out.println("inserted Successfuly!");
	con.close();
	} 
	catch(Exception e)
	{ 
		System.out.println(e.toString());
	}
}
public void Update() {
	try{ Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlineproject","root","L@kshmi23"); 
	Statement st=con.createStatement(); 
	st.executeUpdate("update bookingairline set destination ='andra pradhesh' where seatno=101");
	System.out.println("updated Successfuly!!");
	con.close();
	} 
	catch(Exception e)
	{ 
		System.out.println(e.toString());
	}
}
	
public static void main(String args[])
{
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("Press");
	System.out.println("1. select");
	System.out.println("2. delete");
    System.out.println("3. insert");
    System.out.println("4. Update");
	int i = sc.nextInt();
	airline_reservation air = new airline_reservation();
	
	switch(i)
	{
	
	case 1:
		air.select();
		break;
		
	case 2:
		air.delete();
		break;
		
	case 3:
		air.insert();
		break;
	case 4:
		air.Update();
		break;
	}
}
}