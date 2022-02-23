
public class Exercise8 {
String query="SELECT customer.cust_name,\r\n"
		+ "salesman.name, salesman.city\r\n"
		+ "FROM salesman, customer\r\n"
		+ "WHERE salesman.city = customer.city;";
}
