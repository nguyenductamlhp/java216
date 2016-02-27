import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ThongTin2 extends JFrame {

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
					ThongTin2 frame = new ThongTin2();
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
	public ThongTin2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 632);
		setTitle("Thông tin liên hệ");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Thông tin liên hệ");
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTitle.setBounds(0, 11, 226, 20);
		contentPane.add(lblTitle);
		
		JLabel lblName = new JLabel("Họ tên");
		lblName.setBounds(0, 42, 100, 20);
		contentPane.add(lblName);
		
		JLabel lblPhone = new JLabel("ĐTDĐ");
		lblPhone.setBounds(0, 74, 100, 20);
		contentPane.add(lblPhone);
		
		JLabel lblImage = new JLabel("Hình ảnh");
		lblImage.setBounds(0, 105, 100, 20);
		contentPane.add(lblImage);
		
		JLabel lblShowName = new JLabel("Họ tên");
		lblShowName.setBounds(0, 197, 100, 20);
		contentPane.add(lblShowName);
		
		JLabel lblNewLabel = new JLabel("ĐTDĐ");
		lblNewLabel.setBounds(0, 228, 100, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblShowImage = new JLabel("Hình ảnh");
		lblShowImage.setBounds(0, 259, 100, 20);
		contentPane.add(lblShowImage);
		
		txtName = new JTextField();
		txtName.setBounds(140, 42, 200, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(140, 74, 200, 20);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		txtImage = new JTextField();
		txtImage.setEditable(false);
		txtImage.setBounds(140, 105, 200, 20);
		contentPane.add(txtImage);
		txtImage.setColumns(10);
		
		txtShowName = new JTextField();
		txtShowName.setEditable(false);
		txtShowName.setBounds(140, 197, 200, 20);
		contentPane.add(txtShowName);
		txtShowName.setColumns(10);
		
		txtShowPhone = new JTextField();
		txtShowPhone.setEditable(false);
		txtShowPhone.setBounds(140, 228, 200, 20);
		contentPane.add(txtShowPhone);
		txtShowPhone.setColumns(10);
		
		JLabel Image = new JLabel("");
		Image.setToolTipText("My Image");
		Image.setBounds(90, 262, 300, 301);
		contentPane.add(Image);
		
		JButton btnShow = new JButton("Hiển thị");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name, numPhone, pathImage;
				name = txtName.getText().trim();
				numPhone = txtPhone.getText().trim();
				pathImage = txtImage.getText();
				
				txtShowName.setText(name);
				txtShowPhone.setText(numPhone);
				Image.setIcon(new ImageIcon(pathImage));
				
				
				
			}
		});
		btnShow.setBounds(184, 148, 89, 23);
		contentPane.add(btnShow);
		
		JButton btnBrowser = new JButton("...");
		btnBrowser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser JFC = new JFileChooser();
				int ReValue = JFC.showOpenDialog(null);
				if (ReValue == JFileChooser.APPROVE_OPTION) {
					java.io.File f = JFC.getSelectedFile();
					txtImage.setText(f.getAbsolutePath());
				}
			}
		});
		btnBrowser.setBounds(345, 104, 79, 23);
		contentPane.add(btnBrowser);
	}

}
