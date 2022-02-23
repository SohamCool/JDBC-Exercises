import java.sql.Connection;
import java.sql.Statement;

//Write a Java program to  alter table countries including columns country_id,country_name and region_id  to add a column region_id .
public class Exercise6 {
	public static void main(String[] args) {
		int s = 0;
		try {
			Connection con = DBConnection.getCon();
			Statement st = con.createStatement();
			s = st.executeUpdate("alter table countries ADD region_name varchar(20)");
		} catch (Exception e) {
			System.out.println(e);
		}
		if(s>0)
			System.out.println("Added column to the table countries");
		else
			System.out.println("Failed to add column in the table countries");
	}
}
