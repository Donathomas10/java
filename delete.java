package JDBCpgms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class delete {

	public static void main(String[] args) {
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
		Statement stmt=con.createStatement();
		String q=("delete from the test where tid='t03'");
		stmt.executeUpdate(q); 
		System.out.println("value deleted");
		con.close();
		}catch(Exception e) {System.out.println(e);}


	}

}
