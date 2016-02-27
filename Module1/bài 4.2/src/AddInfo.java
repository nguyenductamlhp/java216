import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.awt.event.ActionEvent;

public class AddInfo extends JFrame {

	/*
	 * private method
	 */
	private Person[] loadInfo(File f) {
		Person[] P = new Person[0];
		try {			
			BufferedReader fread = new BufferedReader(new FileReader(f.getAbsolutePath()));
			String S;
			int i = 0;
			while (fread.readLine() != null) {
				S = fread.readLine();
				P[i].addInfo(S);
				i++;
			}
		} catch (Exception e){
			
		}
		return P;
	}
	private void saveInfo(File f, Person P) {
		try {
			FileWriter fwrite = new FileWriter(f);
			fwrite.write(P.Name + ", " + P.NumPhone + ", " + P.Image);
			fwrite.flush();
			fwrite.close();
		} catch (Exception e) {
			
		}
		
	}
	/*
	 * 
	 */
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
					AddInfo frame = new AddInfo();
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
	public AddInfo() {
		setTitle("Thêm thông tin liên hệ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Thông tin liên hệ");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTitle.setBounds(76, 11, 257, 25);
		contentPane.add(lblTitle);
		
		JLabel lblName = new JLabel("Họ tên");
		lblName.setBounds(10, 56, 100, 20);
		contentPane.add(lblName);
		
		JLabel lblPhone = new JLabel("ĐTDĐ");
		lblPhone.setBounds(10, 97, 100, 20);
		contentPane.add(lblPhone);
		
		JLabel lblImage = new JLabel("Hình ảnh");
		lblImage.setBounds(10, 145, 100, 20);
		contentPane.add(lblImage);
		
		txtName = new JTextField();
		txtName.setBounds(138, 56, 269, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(138, 97, 269, 20);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		txtImage = new JTextField();
		txtImage.setBounds(138, 145, 212, 20);
		contentPane.add(txtImage);
		txtImage.setColumns(10);
		
		JButton btnImage = new JButton("...");
		btnImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser("C:/");
				int value = fileChooser.showOpenDialog(null);
				if (value == JFileChooser.APPROVE_OPTION) {
					java.io.File f = fileChooser.getSelectedFile();
					txtImage.setText(f.getAbsolutePath());
				}
			}
		});
		btnImage.setBounds(360, 144, 47, 23);
		contentPane.add(btnImage);
		
		JButton btnAdd = new JButton("Thêm");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
						
				Person p = new Person();
				p.Name = txtName.getText();
				p.NumPhone = txtName.getText();
				p.Image = txtImage.getText();
				
				File f = new File("./src/info.txt");
				saveInfo(f, p);
				JOptionPane.showMessageDialog(null, "Add information!");
			}
		});
		btnAdd.setBounds(214, 203, 89, 23);
		contentPane.add(btnAdd);
	}
}
