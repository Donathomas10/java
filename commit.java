package JDBCpgms;
import java.io.*;
import java.io.DataInputStream;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class commit {

	public static void main(String[] args) {
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
		con.setAutoCommit(false);
		Statement stmt = con.createStatement();
		stmt.executeUpdate("insert into test values('tt','ttt')");
		
		con.rollback();
		con.close();
		
		}catch(SQLException se) {System.out.println(se);}
		catch(Exception e) {System.out.println(e);}

	}

}
