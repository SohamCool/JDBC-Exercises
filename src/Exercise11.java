
public class Exercise11 {
	String query="SELECT customer.cust_name AS \"Customer\",\r\n"
			+ "customer.grade AS \"Grade\",orders.ord_no AS \"Order No.\"\r\n"
			+ "FROM orders, salesman, customer\r\n"
			+ "WHERE orders.customer_id = customer.customer_id\r\n"
			+ "AND orders.salesman_id = salesman.salesman_id\r\n"
			+ "AND salesman.city IS NOT NULL\r\n"
			+ "AND customer.grade IS NOT NULL;";
}
