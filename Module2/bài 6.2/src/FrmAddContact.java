import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;
import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class FrmAddContact extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtImage;

	class AddImagePath implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JFileChooser fileChooser = new JFileChooser();
			int value = fileChooser.showOpenDialog(null);
			if (value == JFileChooser.APPROVE_OPTION) {
				File f = fileChooser.getSelectedFile();
				txtImage.setText(f.getAbsolutePath());
			}
			
		}
		
	}
	
	class AddContact implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String bdName = "contact";
			try {
				
				String name = txtName.getText().trim();
				String phone = txtPhone.getText().trim();
				String image = txtImage.getText().trim();
				
				Class.forName ("com.mysql.jdbc.Driver").newInstance ();
				String url = "jdbc:mysql://127.0.0.1:3306/contact";
				Connection con = DriverManager.getConnection(url, "root", "1009f35kt7");
				Statement statement  = con.createStatement();
				//System.out.println("connected");
				
				String sql = "insert into contact values";
				java.sql.PreparedStatement preState = con.prepareStatement(sql);
				preState.setString(1, name);
				preState.setString(2, phone);
				preState.setString(3, image);
				statement.executeUpdate(sql);
				
				con.close();
				
			} catch (ClassNotFoundException | SQLException | InstantiationException | IllegalAccessException e1) {
				e1.printStackTrace();
			}
			

		}
		
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAddContact frame = new FrmAddContact();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmAddContact() {
		setTitle("Thêm liên hệ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Họ Tên");
		lblName.setBounds(30, 30, 80, 20);
		contentPane.add(lblName);
		
		JLabel lblPhone = new JLabel("ĐTDĐ");
		lblPhone.setBounds(30, 90, 80, 20);
		contentPane.add(lblPhone);
		
		JLabel lblImage = new JLabel("Hình ảnh");
		lblImage.setBounds(30, 150, 80, 20);
		contentPane.add(lblImage);
		
		txtName = new JTextField();
		txtName.setBounds(125, 30, 299, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(120, 90, 304, 20);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		txtImage = new JTextField();
		txtImage.setBounds(120, 150, 210, 20);
		contentPane.add(txtImage);
		txtImage.setColumns(10);
		
		JButton btnImage = new JButton("...");
		btnImage.addActionListener(new AddImagePath());
		btnImage.setBounds(335, 149, 89, 23);
		contentPane.add(btnImage);
		
		JButton btnAdd = new JButton("Thêm");
		btnAdd.addActionListener(new AddContact());
		btnAdd.setBounds(179, 203, 89, 23);
		contentPane.add(btnAdd);
	}
}
