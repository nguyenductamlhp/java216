import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class BMI extends JFrame {

	private JPanel contentPane;
	private JTextField txtHeight;
	private JTextField txtWeight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BMI frame = new BMI();
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
	public BMI() {
		setTitle("Calculate BMI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 287, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYourHeight = new JLabel("Your Height (m)");
		lblYourHeight.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblYourHeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourHeight.setBounds(10, 11, 110, 30);
		contentPane.add(lblYourHeight);
		
		JLabel lblYourWeight = new JLabel("Your Weight (kg)");
		lblYourWeight.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblYourWeight.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourWeight.setBounds(10, 62, 110, 30);
		contentPane.add(lblYourWeight);
		
		txtHeight = new JTextField();
		txtHeight.setBounds(130, 16, 86, 20);
		contentPane.add(txtHeight);
		txtHeight.setColumns(10);
		
		txtWeight = new JTextField();
		txtWeight.setBounds(130, 67, 86, 20);
		contentPane.add(txtWeight);
		txtWeight.setColumns(10);
		
		JLabel lblImage = new JLabel("");
		lblImage.setBounds(10, 171, 99, 79);
		lblImage.setIcon(new ImageIcon("./src/img/bmi.png"));
		contentPane.add(lblImage);
		
		JLabel lblRe = new JLabel();
		lblRe.setOpaque(true);
		lblRe.setBackground(Color.GREEN);
		lblRe.setHorizontalAlignment(SwingConstants.CENTER);
		lblRe.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblRe.setBounds(149, 171, 86, 36);
		contentPane.add(lblRe);
		
		JButton btnBmi = new JButton("BMI");
		btnBmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double h, w, BMI;
					h = Double.parseDouble(txtHeight.getText());
					w = Double.parseDouble(txtWeight.getText());
					BMI = Math.round(w / (h * h) * 1000) / 1000.0;
					
					lblRe.setText(Double.toString(BMI));
				} catch (Exception e2) {
					txtHeight.setText("");
					txtWeight.setText("");
				}
			}
		});
		btnBmi.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBmi.setBounds(20, 99, 215, 61);
		contentPane.add(btnBmi);
	}

}
