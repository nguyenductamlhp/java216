import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Book {
	
	private String ID;
	private String Name;
	private String Author;
	private String Publisher;
	private String Price;
	
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/book";
	private static final String JDBC_DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static final String JDBC_USERNAME = "root";
	private static final String JDBC_PASSWORD = "1009f35kt7";
	
	private Connection connect() throws SQLException, ClassNotFoundException{
		Class.forName(JDBC_DRIVER_CLASS);
		Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
		return conn;
	}
	
	public boolean checkLogin(String username, String password) throws SQLException, ClassNotFoundException{
		Connection conn = this.connect();
		Statement statement = conn.createStatement();
		String sql = "SELECT * FROM tbl_user where username='" + username + "'";
		ResultSet rs = statement.executeQuery(sql);
		while(rs.next()){
			String dbPassword = rs.getString("password");
			if(password.equals(dbPassword)){
				return true;
			}
			break;
		}
		conn.close();
		return false;
	}

	
	public Book() {
		ID = "";
		Name = "";
		Author = "";
		Publisher = "";
		Price = "";
	}

	public String getID() {
		return ID;
	}

	public String getName() {
		return Name;
	}

	public String getAuthor() {
		return Author;
	}

	public String getPublisher() {
		return Publisher;
	}

	public String getPrice() {
		return Price;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String toInsertQuery(String tableName) {
		String S = "insert into " + tableName + " values ( ";
		S.concat(ID + " ");
		S.concat(Name + " ");
		S.concat(Author + " ");
		S.concat(Publisher + " ");
		S.concat(Price + " ");
		
		return S;

	}
	
	public void addToDB() throws ClassNotFoundException, SQLException {
		Connection conn = this.connect();
		String sql = "INSERT INTO bookDB(ID, name, author, publisher, price) values(?, ?, ?, ?, ?)";
		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setString(1, ID);
		statement.setString(2, Name);
		statement.setString(3, Author);
		statement.setString(4, Publisher);
		statement.setString(5, Price);
		
		statement.executeUpdate();
		conn.close();
	}
}
