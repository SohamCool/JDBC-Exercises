
public class Exercise17 {
	String query="SELECT employee_id, first_name \r\n"
			+ "FROM employees AS A \r\n"
			+ "WHERE salary > \r\n"
			+ "(SELECT AVG(salary) FROM employees WHERE department_id = A.department_id);";
}
