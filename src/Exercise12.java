
public class Exercise12 {
	String query="SELECT customer.cust_name AS \"Customer\",\r\n"
			+ "customer.city AS \"City\",\r\n"
			+ "salesman.name AS \"Salesman\",\r\n"
			+ "salesman.commission\r\n"
			+ "FROM customer,salesman\r\n"
			+ "WHERE customer.salesman_id = salesman.salesman_id\r\n"
			+ "AND salesman.commission\r\n"
			+ "BETWEEN .12 AND .14;";
}
