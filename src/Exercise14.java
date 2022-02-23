
public class Exercise14 {
	String query="SELECT DISTINCT salary \r\n"
			+ "FROM employees a \r\n"
			+ "WHERE 3 >= (SELECT COUNT(DISTINCT salary) \r\n"
			+ "FROM employees b \r\n"
			+ "WHERE b.salary >= a.salary) \r\n"
			+ "ORDER BY a.salary DESC;";
}
