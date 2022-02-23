//Write a JAVA program to update the records in BANK table using Statement.executeUpdate().
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Exercise3 {
	public static int updateRecord(int id, String name, int accno, int accbal) {
		int b = 0;
		try {
			Connection con = DBConnection.getCon();
			PreparedStatement pt = con.prepareStatement("update BANK set Name=?, AccountNo=?, AccountBal=? where ID=?");
		
			pt.setString(1, name);
			pt.setInt(2, accno);
			pt.setInt(3, accbal);
			pt.setInt(4, id);
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
		int s= 0;
		System.out.println("Enter id to update data: ");
		int id = sc.nextInt();
		System.out.println("New Name: ");
		String name = sc.next();
		System.out.println("New Account No; ");
		int accno = sc.nextInt();
		System.out.println("New Account Balance: ");
		int accbal = sc.nextInt();
		s = updateRecord(id,name,accno,accbal);
		if(s>0)
			System.out.println("udpated Successfully");
		else
			System.out.println("failed to update");
	}

}
