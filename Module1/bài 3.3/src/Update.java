import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Update extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtReName;
	private JTextField txtRePhone;
	private JTextField txtReImage;
	private JFormattedTextField txtTry;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update frame = new Update();
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
	public Update() {
		setTitle("Thông tin liên hệ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Họ tên");
		lblName.setBounds(10, 11, 110, 20);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(135, 11, 200, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JButton btnFind = new JButton("Tìm kiếm");
		btnFind.setBounds(135, 58, 89, 23);
		contentPane.add(btnFind);
		
		JLabel lblReName = new JLabel("Họ tên");
		lblReName.setBounds(10, 108, 110, 20);
		contentPane.add(lblReName);
		
		JLabel lblRePhone = new JLabel("ĐTDĐ");
		lblRePhone.setBounds(10, 156, 110, 20);
		contentPane.add(lblRePhone);
		
		JLabel lblReImage = new JLabel("Hình ảnh");
		lblReImage.setBounds(10, 195, 110, 20);
		contentPane.add(lblReImage);
		
		txtReName = new JTextField();
		txtReName.setBounds(135, 108, 200, 20);
		contentPane.add(txtReName);
		txtReName.setColumns(10);
		
		txtRePhone = new JTextField();
		txtRePhone.setBounds(135, 156, 200, 20);
		contentPane.add(txtRePhone);
		txtRePhone.setColumns(10);
		
		txtReImage = new JTextField();
		txtReImage.setBounds(135, 195, 150, 20);
		contentPane.add(txtReImage);
		txtReImage.setColumns(10);
		
		JFormattedTextField txtTry = new JFormattedTextField(JFormattedTextField.COMMIT_OR_REVERT);
		txtTry.setText("");
		txtTry.setBounds(135, 40, 200, 20);
		contentPane.add(txtTry);
		
		JButton btnSelectImage = new JButton("...");
		btnSelectImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				int returnValue = fileChooser.showOpenDialog(null);
				if (returnValue == fileChooser.APPROVE_OPTION) {
					java.io.File f = fileChooser.getSelectedFile();
					txtReImage.setText(f.getAbsolutePath());
				}
			}
		});
		btnSelectImage.setBounds(295, 194, 40, 23);
		contentPane.add(btnSelectImage);
		
		JButton btnAdd = new JButton("Thêm");
		btnAdd.setBounds(166, 226, 89, 23);
		contentPane.add(btnAdd);
	}
}
