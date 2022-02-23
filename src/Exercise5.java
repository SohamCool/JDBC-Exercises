import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;

//Write a Java program to create  a table  countries including columns country_id,country_name and region_id .
public class Exercise5 {
	public static void main(String[] args) {
		int b = 0;
		String query = "CREATE table countries (" + "country_id int NOT NULL," + "country_name varchar(20),"
				+ "region_id varchar(20))";
		try {
			Connection con = DBConnection.getCon();
			Statement st = con.createStatement();
			b = st.executeUpdate(query);
			con.close();
			st.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		if (b > 0)
			System.out.println("Table Created");
		else
			System.out.println("Table is not Created");
	}
}
