import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.table.TableModel;

public class ListBook {

	private Vector<Book> list;
	private String Host;
	private String Password;
	
	private static String url = "jdbc:mysql://localhost:3306/" + "DBName";
//	private static String 
	
	public ListBook() {
		// TODO Auto-generated constructor stub
		list = new Vector<Book>(); 
	}

	public Connection connect() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, Host, Password);
		return con;
	}
	
	public ResultSet resultSet(String table) throws ClassNotFoundException, SQLException {
		Connection con = this.connect();
		Statement statement = con.createStatement();
		
		String selectQuery = "select * from " + table + ",";
		ResultSet re = statement.executeQuery(selectQuery);
		con.close();
		return re;
	}
	
	public void readData() {
		try {
			Connection con = this.connect();
			ResultSet re = this.resultSet("bookDB");
			while (re.next()) {
				Book B = new Book();
				B.readData(re);
				this.list.addElement(B);
			}
			
			con.close();
		} catch (ClassNotFoundException e) {
			
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public TableModel tableModel() {
		TableModel tb = null;
		return tb;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
