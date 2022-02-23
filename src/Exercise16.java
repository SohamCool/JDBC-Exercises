
public class Exercise16 {
	String query="SELECT DISTINCT salary \r\n"
			+ "FROM employees e1 \r\n"
			+ "WHERE 4 = (SELECT COUNT(DISTINCT salary) \r\n"
			+ "FROM employees  e2 \r\n"
			+ "WHERE e2.salary <= e1.salary);";
}
