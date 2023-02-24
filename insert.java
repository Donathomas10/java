package JDBCpgms;

import java.sql.*;

public class insert {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			Statement stmt=con.createStatement();
			String q=("update test set tid='t33' where tid='t03'");
			stmt.executeUpdate(q); 
			System.out.println("value updated");
			con.close();
		}catch(SQLException se) {System.out.println(se);}
		catch(Exception e) {System.out.println(e);}
		
     }

}





