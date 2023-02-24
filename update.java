package JDBCpgms;


import java.sql.*;

public class update {

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
		}catch(Exception e) {System.out.println(e);}

	}

}
