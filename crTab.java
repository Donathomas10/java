package JDBCpgms;
import java.sql.*;
public class crTab {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//create connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			Statement stmt = con.createStatement();
			//execute stmt
			ResultSet rs = stmt.executeQuery("select * from project");
			while(rs.next())
			{
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(1));
			}
		}catch(Exception e) {System.out.println(e);}

	}

}
