import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddNew extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddNew frame = new AddNew();
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
	public AddNew() {
		setTitle("Thông tin liên hệ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Thông tin liên hệ");
		lblTitle.setBounds(10, 11, 160, 20);
		contentPane.add(lblTitle);
		
		JLabel lblName = new JLabel("Họ tên");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setBounds(10, 42, 100, 20);
		contentPane.add(lblName);
		
		JLabel lblPhone = new JLabel("ĐTDĐ");
		lblPhone.setBounds(10, 88, 100, 20);
		contentPane.add(lblPhone);
		
		JLabel lblImage = new JLabel("Hình ảnh");
		lblImage.setBounds(10, 142, 100, 20);
		contentPane.add(lblImage);
		
		txtName = new JTextField();
		txtName.setBounds(140, 42, 200, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(140, 88, 200, 20);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		txtImage = new JTextField();
		txtImage.setBounds(140, 142, 150, 20);
		contentPane.add(txtImage);
		txtImage.setColumns(10);
		
		JButton btnBrowser = new JButton("...");
		btnBrowser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				int returnValue = fileChooser.showOpenDialog(null);
				if (returnValue == JFileChooser.APPROVE_OPTION) {
					java.io.File f = fileChooser.getSelectedFile(); 
					txtImage.setText(f.getAbsolutePath());
				}
			}
		});
		btnBrowser.setBounds(297, 141, 45, 23);
		contentPane.add(btnBrowser);
		
		JButton btnAdd = new JButton("Thêm");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnAdd.setBounds(178, 194, 89, 23);
		contentPane.add(btnAdd);
	}

}
