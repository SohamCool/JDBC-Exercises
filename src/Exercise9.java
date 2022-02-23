
public class Exercise9 {
	String query="SELECT customer.cust_name, salesman.name\r\n"
			+ "FROM customer,salesman\r\n"
			+ "WHERE salesman.salesman_id = customer.salesman_id;";
}
