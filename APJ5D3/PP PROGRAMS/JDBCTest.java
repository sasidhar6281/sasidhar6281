//1.Import JDBC package
import java.sql.*;
import oracle.jdbc.driver.OracleDriver;
//import oracle/sql.*;

//2.Load and register the JDBC driver in Driver Manager service
public class JDBCTest
{
	public static void main(String args[])
	{
		
		Connection con = null;
		Statement st=null;
		ResultSet rs = null;
		try
		{
		//Load a driver
		OracleDriver d = new OracleDriver();
		//Register The driver in driver manager service
		DriverManager.registerDriver(d);
	
		//3.Open a connection to the databse software
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username = "system";
		String password = "admin";
		
		con = DriverManager.getConnection(url,username,password);
		
		//4.Create a statement object and prepare a SQl statement
		String query = "select * from Customer_details";
		st = con.createStatement();
		
		//5.Submit and Execute the SQL statement which returns the resultant SQL data
		rs = st.executeQuery(query);

		//6.Process the Resultant data via a ResultSet
		System.out.println("Customer_details");
		while(rs.next())
		{
			System.out.println("customer_name:"+rs.getString(1)+"  customer_mbn:"+rs.getString(2));
		}
		}
		catch(Exception ex)
		{
			System.out.println("Connection was unsuccessful");
		}
		finally
		{
		try{
				st.close();
				rs.close();
				con.close();
			}
			catch(Exception e)
			{
			}
		}

		//7.Handle the Errors


		//8.Close the ResultantSet and Statement object


		//9Close the connection
	}
}
 