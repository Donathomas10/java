//insert into test values(?,?)
package JDBCpgms;
import java.sql.*;

public class test {

	public static void main(String[] args) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","mca","mca");
			PreparedStatement pst=con.prepareStatement("insert into test values(?,?)");
			
			
			pst.setString(1,"t04");
			pst.setString(2,"test12");
			int i =pst.executeUpdate();
			System.out.println("records affected"+i);
			con.close();
			
		}catch(SQLException se) {System.out.println(se);}
		catch(Exception e) {System.out.println(e);}
		

	}

}
