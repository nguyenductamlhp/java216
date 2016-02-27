import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmAddBook extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtAuthor;
	private JTextField txtPublisher;
	private JTextField txtPrice;

	class AddBookAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			try {
				Book book = new Book();
				book.setID(txtID.getText());
				book.setName(txtName.getText());
				book.setAuthor(txtAuthor.getText());
				book.setPublisher(txtPublisher.getText());
				book.setPrice(txtPrice.getText());
				
				book.addToDB();
				
				
				JOptionPane.showMessageDialog(null, "Added!");
			} catch (Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Not Added!");
			}
		}
		
	}
	
	class NewAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			txtID.setText("");
			txtName.setText("");
			txtAuthor.setText("");
			txtPublisher.setText("");
			txtPrice.setText("");
		}
		
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAddBook frame = new FrmAddBook();
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
	public FrmAddBook() {
		setTitle("Thêm sách");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblID = new JLabel("ID");
		lblID.setBounds(10, 10, 80, 20);
		contentPane.add(lblID);
		
		JLabel lblName = new JLabel("Tên sách");
		lblName.setBounds(10, 50, 80, 20);
		contentPane.add(lblName);
		
		JLabel lblPublisher = new JLabel("NXB");
		lblPublisher.setBounds(10, 147, 80, 20);
		contentPane.add(lblPublisher);
		
		JLabel lblPrice = new JLabel("Giá bìa");
		lblPrice.setBounds(10, 189, 80, 20);
		contentPane.add(lblPrice);
		
		JLabel lblAuthor = new JLabel("Tác giả");
		lblAuthor.setBounds(10, 100, 80, 20);
		contentPane.add(lblAuthor);
		
		txtID = new JTextField();
		txtID.setBounds(122, 10, 386, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(122, 50, 386, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAuthor = new JTextField();
		txtAuthor.setBounds(122, 100, 386, 20);
		contentPane.add(txtAuthor);
		txtAuthor.setColumns(10);
		
		txtPublisher = new JTextField();
		txtPublisher.setText("");
		txtPublisher.setBounds(122, 147, 386, 20);
		contentPane.add(txtPublisher);
		txtPublisher.setColumns(10);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(122, 189, 386, 20);
		contentPane.add(txtPrice);
		txtPrice.setColumns(10);
		
		JButton btnAdd = new JButton("Thêm sách mới");
		btnAdd.addActionListener(new AddBookAction());
		btnAdd.setBounds(134, 243, 125, 23);
		contentPane.add(btnAdd);
		
		JButton btnNew = new JButton("Tiếp tục");
		btnNew.addActionListener(new NewAction());
		btnNew.setBounds(328, 243, 89, 23);
		contentPane.add(btnNew);
	}
}
