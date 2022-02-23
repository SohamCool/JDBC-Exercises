import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

//Write a Java program  to insert a record with values taken from user into the table countries against each columns using prepared statement. We can use a string array to store our own values.
public class Exercise7 {
	public static int getData(String[] s) {
		int r = 0;
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement pt = con.prepareStatement("insert into countries(country_id,country_name,region_id,region_name) values(?,?,?,?)");
			pt.setInt(1, Integer.parseInt(s[0]));
			pt.setString(2, s[1]);
			pt.setInt(3, Integer.parseInt(s[2]));
			pt.setString(4, s[3]);
			r = pt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result=0;
		System.out.println("Enter Country id: ");
		int cid = sc.nextInt();
		System.out.println("Enter Country Name: ");
		String cname = sc.next();
		System.out.println("Enter Region id: ");
		int rid = sc.nextInt();
		System.out.println("Enter Region Name: ");
		String rname = sc.next();
		String[] arr = new String[] {Integer.toString(cid),cname,Integer.toString(rid),rname};
		result =getData(arr);;
		if(result>0) 
			System.out.println("Data is Added to the database.");
		else
			System.out.println("Data is not added to the database.");
	}

}
