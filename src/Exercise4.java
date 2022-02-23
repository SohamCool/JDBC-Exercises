//Write a JAVA program to get  connection object using hostname , user,password stored in external properties file. 
import java.sql.Connection;

public class Exercise4 {
	public static void main(String[] args) {
		try {
			Connection con = DBConnection.getCon();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
