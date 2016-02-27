import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.DropMode;
import java.awt.Color;

public class Love extends JFrame {

	private JPanel contentPane;
	private JTextField txtName1;
	private JTextField txtName2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Love frame = new Love();
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
	public Love() {
		setTitle("Love level");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBG = new JLabel("");
		lblBG.setIcon(new ImageIcon("C:\\Users\\NguyenDuc\\Desktop\\BT_LTV_JAVA\\img\\love.jpg"));
		lblBG.setHorizontalAlignment(SwingConstants.CENTER);
		lblBG.setBounds(0, 0, 434, 261);
		contentPane.add(lblBG);
		
		JLabel lblTitle = new JLabel("Enter name");
		lblTitle.setBounds(0, 0, 110, 26);
		contentPane.add(lblTitle);
		
		txtName1 = new JTextField();

		txtName1.setBounds(24, 53, 136, 20);
		contentPane.add(txtName1);
		txtName1.setColumns(10);
		
		txtName2 = new JTextField();
		txtName2.setBounds(252, 53, 136, 20);
		contentPane.add(txtName2);
		txtName2.setColumns(10);
		
		JLabel lblRe = new JLabel("New label");
		
		lblRe.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblRe.setBounds(181, 108, 67, 58);
		contentPane.add(lblRe);
		
		JButton btnCompute = new JButton("Compute");
		btnCompute.setBackground(Color.RED);
		btnCompute.setBounds(181, 227, 89, 23);
		contentPane.add(btnCompute);
	}

}
