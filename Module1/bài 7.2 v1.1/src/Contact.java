import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Contact extends JFrame {

	/**
	 * Variables
	 */
	private JPanel contentPane;

	/**
	 * methods
	 */
	private String[] loadData(String path) throws FileNotFoundException {
		String S = "";
		try {
			BufferedReader buff = new BufferedReader(new FileReader(path));
			String s;
			while ((s = buff.readLine()) != null) {
				S = S + s;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] Re = S.split("[\\n]+");
		return Re;
		
	}
	private Person[] inputData(String[] S) {
		Person[] P = new Person[S.length];
		for (int i = 0; i < S.length; i++) {
			P[i].addData(S[i]);
		}
		return P;
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contact frame = new Contact();
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
	public Contact() {
		
		try {
			String[] S = loadData("./src/data.txt");
			Person[] P = new Person[S.length]; 
			P =	inputData(S);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		setTitle("Contact infomation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelImage = new JPanel();
		panelImage.setBounds(60, 30, 150, 150);
		contentPane.add(panelImage);
		panelImage.setLayout(null);
		
		JLabel lblImage = new JLabel("");
		lblImage.setBounds(0, 0, 150, 150);
		panelImage.add(lblImage);
		
		JPanel panelInfo = new JPanel();
		panelInfo.setBounds(220, 30, 211, 150);
		contentPane.add(panelInfo);
		panelInfo.setLayout(null);
		
		JLabel lblName = new JLabel("");
		lblName.setBounds(0, 0, 211, 20);
		panelInfo.add(lblName);
		
		JLabel lblPhone = new JLabel("");
		lblPhone.setBounds(0, 40, 211, 20);
		panelInfo.add(lblPhone);
		
		JLabel lblBirth = new JLabel("");
		lblBirth.setBounds(0, 80, 211, 20);
		panelInfo.add(lblBirth);
		
		JLabel lblEmail = new JLabel("");
		lblEmail.setBounds(0, 120, 211, 20);
		panelInfo.add(lblEmail);
		
		JButton btnPre = new JButton("");
		btnPre.setBounds(10, 86, 32, 32);
		btnPre.setIcon(new ImageIcon("./src/previousicon.png"));
		contentPane.add(btnPre);
		
		JButton btnNext = new JButton("");
		btnNext.setBounds(441, 86, 32, 32);
		btnNext.setIcon(new ImageIcon("./src/nexticon.png"));
		contentPane.add(btnNext);
	}
	
	
}
