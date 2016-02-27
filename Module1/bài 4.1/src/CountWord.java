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
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

public class CountWord extends JFrame {

	private JPanel contentPane;
	private JTextField txtFileName;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CountWord frame = new CountWord();
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
	public CountWord() {
		setTitle("Đếm số từ trong tập tin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Đếm số từ trong tập tin");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblTitle.setBounds(49, 11, 348, 24);
		contentPane.add(lblTitle);
		
		JLabel lblSelect = new JLabel("Chọn tập tin");
		lblSelect.setBounds(10, 62, 93, 20);
		contentPane.add(lblSelect);
		
		JLabel lblText = new JLabel("Nội dung");
		lblText.setBounds(10, 93, 93, 20);
		contentPane.add(lblText);
		
		JLabel lblResult = new JLabel("Số từ");
		lblResult.setBounds(10, 241, 93, 20);
		contentPane.add(lblResult);
		
		txtFileName = new JTextField();
		txtFileName.setBounds(149, 62, 193, 20);
		contentPane.add(txtFileName);
		txtFileName.setColumns(10);
		
		JTextArea txtText = new JTextArea();
		txtText.setEditable(false);
		txtText.setBounds(149, 93, 275, 133);
		contentPane.add(txtText);
		
		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setBounds(149, 241, 275, 20);
		contentPane.add(txtResult);
		txtResult.setColumns(10);
		
		JButton btnSelectFile = new JButton("...");
		btnSelectFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser("C:/");
				int value = fileChooser.showOpenDialog(null);
				if (value == JFileChooser.APPROVE_OPTION) {
					java.io.File f = fileChooser.getSelectedFile();
					
					txtFileName.setText(f.getAbsolutePath());
				}
			}
		});
		btnSelectFile.setBounds(345, 61, 79, 23);
		contentPane.add(btnSelectFile);
		
		JButton btnReadFile = new JButton("Đọc tập tin");
		btnReadFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String path = txtFileName.getText();
				try {
					File f = new File (path);
					FileReader fin = new FileReader(f);
					char[] Re = new char[(int)f.length()];
					fin.read(Re);	
					String S = String.valueOf(Re);
					fin.close();
					txtText.setText(S);
				} catch (Exception e) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(null,"error");
				} 
			}	
		});
		btnReadFile.setBounds(147, 273, 89, 23);
		contentPane.add(btnReadFile);
		
		JButton btnCount = new JButton("Đếm số từ");
		btnCount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Str[] = txtText.getText().split("[\\s\\.\\,\\:\\;\\/\\|\\\\]+" );	//[] => chấp nhận 1 trong các ký tự xuất hiện
				if (Str != null) {
					txtResult.setText(Integer.toString(Str.length)); 
				}
				else txtResult.setText("0");
			}
		});
		btnCount.setBounds(298, 273, 89, 23);
		contentPane.add(btnCount);
	}
}
