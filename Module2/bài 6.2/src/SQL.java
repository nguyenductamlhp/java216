import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQL {

	private Connection connection;
	public SQL(String bdName, String root, String pass) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:myspl://127.0.0.1:3306/" + bdName;
		
		try {
			setConnection(DriverManager.getConnection(url, root, pass));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

}
