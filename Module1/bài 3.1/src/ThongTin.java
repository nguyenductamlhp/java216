import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThongTin extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtImage;
	private JTextField txtShowName;
	private JTextField txtShowPhone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongTin frame = new ThongTin();
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
	public ThongTin() {
		setTitle("Th\u00F4ng tin li\u00EAn h\u1EC7");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Thông tin liên hệ");
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(10, 11, 190, 20);
		contentPane.add(lblTitle);
		
		JLabel lblName = new JLabel("Họ tên");
		lblName.setBounds(10, 52, 100, 20);
		contentPane.add(lblName);
		
		JLabel lblPhone = new JLabel("Điện thoại di động");
		lblPhone.setBounds(10, 93, 100, 20);
		contentPane.add(lblPhone);
		
		JLabel lblImage = new JLabel("Hình ảnh");
		lblImage.setBounds(10, 141, 100, 20);
		contentPane.add(lblImage);
		
		JLabel lblShowName = new JLabel("Họ tên");
		lblShowName.setBounds(10, 282, 100, 20);
		contentPane.add(lblShowName);
		
		JLabel lblShowPhone = new JLabel("Điện thoại di động");
		lblShowPhone.setBounds(10, 333, 100, 20);
		contentPane.add(lblShowPhone);
		
		JLabel lblShowImage = new JLabel("Hình ảnh");
		lblShowImage.setBounds(10, 386, 100, 20);
		contentPane.add(lblShowImage);
		
		txtName = new JTextField();
		txtName.setBounds(150, 52, 150, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(150, 93, 150, 20);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		txtImage = new JTextField();
		txtImage.setBounds(150, 141, 150, 20);
		contentPane.add(txtImage);
		txtImage.setColumns(10);
		
		txtShowName = new JTextField();
		txtShowName.setEditable(false);
		txtShowName.setBounds(150, 282, 150, 20);
		contentPane.add(txtShowName);
		txtShowName.setColumns(10);
		
		txtShowPhone = new JTextField();
		txtShowPhone.setEditable(false);
		txtShowPhone.setBounds(150, 333, 150, 20);
		contentPane.add(txtShowPhone);
		txtShowPhone.setColumns(10);
		
		JLabel Image = new JLabel("");
		Image.setBounds(150, 389, 150, 122);
		contentPane.add(Image);
		
		JButton btnShow = new JButton("Hiển thị");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name, phone, image;
				name = txtName.getText().trim();
				phone = txtPhone.getText().trim();
				image = txtImage.getText().trim();
				
				txtShowName.setText(name);
				txtShowPhone.setText(phone);
				Image.setIcon(new ImageIcon(image));
			}
		});
		btnShow.setBounds(154, 209, 89, 23);
		contentPane.add(btnShow);
	}
}
