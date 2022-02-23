
public class Exercise10 {
	 String query="SELECT orders.ord_no, customer.cust_name\r\n"
	 		+ "FROM orders, customer\r\n"
	 		+ "WHERE orders.customer_id = customer.customer_id;";
}
