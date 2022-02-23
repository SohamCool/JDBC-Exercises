// Write a JAVA program to insert 5 records in BANK table with column ("AccountNo","AccountBal")  using prepared statement.
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exercise2 {

	public static int insertRecord(int id, String name, int accno, int accbal) {
		int b = 0;
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement pt = con.prepareStatement("insert into BANK(ID,Name,AccountNo,AccountBal) values(?,?,?,?)");
			pt.setInt(1, id);
			pt.setString(2, name);
			pt.setInt(3, accno);
			pt.setInt(4, accbal);
			b = pt.executeUpdate();
			con.close();
			pt.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id,accno,accbal,s = 0;
		String name;
		System.out.println("How many records do you want to insert: ");
		int n = sc.nextInt();
		while(n>0) {
			System.out.println("Enter id: ");
			id=sc.nextInt();
			System.out.println("Enter Name: ");
			name=sc.next();
			System.out.println("Enter Account No: ");
			accno=sc.nextInt();
			System.out.println("Enter Account Balance: ");
			accbal=sc.nextInt();
			 s = insertRecord(id,name,accno,accbal);
			n--;
		}
		if(s!=0)
			System.out.println("data ADded successfully");
		else
			System.out.println("unable to add data");
	}
	
}
