import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;

//Write a JAVA program to update the Bank table with column ("AccountNo","AccountBal") using resultset object.
public class Exercise1 {
	public static boolean updateBankTable(int accNo, int accBal, int id) {
		boolean b = false;
		try {
		Connection con = DBConnection.getCon();
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = st.executeQuery("select * from BANK");
		while(rs.next()) {
			if(rs.getInt(1) == id) {
			rs.updateInt("AccountNo", accNo);
			rs.updateInt("AccountBal", accBal);
			rs.updateRow();
			b = true;
			}
		}
		con.close();
		st.close();
		rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return b;
	}
	public static void main(String[] args) {
		boolean b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an id to update data: ");
		int id = sc.nextInt();
		System.out.println("New Account No: ");
		int accNo = sc.nextInt();
		System.out.println("New Account Bal: ");
		int accBal = sc.nextInt();
		b = updateBankTable(accNo,accBal,id);
		if (b = true)
			System.out.println("Updated Data Successfully");
		else
			System.out.println("Unable to update data");
	}
}
