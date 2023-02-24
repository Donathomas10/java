package JDBCpgms;
import java.sql.*;
public class test2 {

	public static void main(String[] args) {
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from test where tid='t02'");
		ResultSetMetaData rm = rs.getMetaData();
		for (int i = 1 ; i<=rm.getColumnCount(); i++)
		{
			System.out.println(rm.getColumnName(i) +" ");
			
		}
		System.out.println();
		System.out.println("---------");
		
		while(rs.next())
		{
			for (int j = 1 ; j<=rm.getColumnCount(); j++)
			{
				System.out.println(rm.getColumnName(j) +" ");
			}System.out.println();
		}
		con.close();
		


		}
		catch(SQLException se){System.out.println(se);}
		catch(Exception e) {System.out.println(e);}

	}

}
