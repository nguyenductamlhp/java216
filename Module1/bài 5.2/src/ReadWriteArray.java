import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class ReadWriteArray extends JFrame {

	private JPanel contentPane;
	private JTextField txtSelect;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReadWriteArray frame = new ReadWriteArray();
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
	public ReadWriteArray() {
		setTitle("Đọc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Đọc ghi tập tin chứa mảng");
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(68, 11, 276, 23);
		contentPane.add(lblTitle);
		
		JLabel lblSelect = new JLabel("Chọn tập tin");
		lblSelect.setBounds(10, 61, 60, 20);
		contentPane.add(lblSelect);
		
		txtSelect = new JTextField();
		txtSelect.setBounds(136, 61, 205, 20);
		contentPane.add(txtSelect);
		txtSelect.setColumns(10);
		
		JButton btnSelect = new JButton("...");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser("C:/");
				int value = fileChooser.showOpenDialog(null);
				if (value == JFileChooser.APPROVE_OPTION) {
					txtSelect.setText(fileChooser.getSelectedFile().getAbsolutePath());
				}
			}
		});
		btnSelect.setBounds(351, 60, 60, 23);
		contentPane.add(btnSelect);
		
		JLabel lblArray = new JLabel("Mảng");
		lblArray.setBounds(10, 107, 60, 20);
		contentPane.add(lblArray);
		
		JTextArea txtArray = new JTextArea();
		txtArray.setBounds(136, 105, 275, 102);
		contentPane.add(txtArray);
		
		JButton btnShow = new JButton("Hiển thị");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BufferedReader bufRead = new BufferedReader(new FileReader(txtSelect.getText()));
					String S = "";
					try {
						while (bufRead.readLine() != null) {
							S = S + bufRead.readLine();
						}						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
					S.trim();
					txtArray.setText(S);
					String sArr[] = S.split("[\\s\\.\\,\\/\\|\\\\]+");
					
					
					JOptionPane.showMessageDialog(null, "mảng có " + Integer.toString(sArr.length) + "phần tử!");
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e1.getMessage());
					
				}
			}
		});
		btnShow.setBounds(136, 227, 89, 23);
		contentPane.add(btnShow);
		
		JButton btnWrite = new JButton("Ghi");
		btnWrite.setBounds(273, 227, 89, 23);
		contentPane.add(btnWrite);
	}

}
