import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DocumentFilter;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class HinhTron2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtRadius;
	private JTextField txtCircumference;
	private JTextField txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HinhTron2 frame = new HinhTron2();
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
	public HinhTron2() {
		setTitle("Hình Tròn");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Tính chu vi và diện tích hình tròn");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(126, 11, 188, 28);
		contentPane.add(lblTitle);
		
		JLabel lblRadius = new JLabel("Bán kính");
		lblRadius.setHorizontalAlignment(SwingConstants.CENTER);
		lblRadius.setBounds(10, 53, 60, 22);
		contentPane.add(lblRadius);
		
		JLabel lblCircumference = new JLabel("Chu vi");
		lblCircumference.setHorizontalAlignment(SwingConstants.CENTER);
		lblCircumference.setBounds(10, 100, 60, 22);
		contentPane.add(lblCircumference);
		
		JLabel lblArea = new JLabel("Diện tích");
		lblArea.setHorizontalAlignment(SwingConstants.CENTER);
		lblArea.setBounds(10, 160, 60, 22);
		contentPane.add(lblArea);
		
		txtRadius = new JTextField();		
		contentPane.add(txtRadius);
		txtRadius.setColumns(10);
		
		txtCircumference = new JTextField();
		txtCircumference.setEditable(false);
		txtCircumference.setBounds(136, 101, 178, 20);
		contentPane.add(txtCircumference);
		txtCircumference.setColumns(10);
		
		txtArea = new JTextField();
		txtArea.setEditable(false);
		txtArea.setBounds(136, 161, 178, 20);
		contentPane.add(txtArea);
		txtArea.setColumns(10);
		
		JButton btnCalc = new JButton("Tính");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnCalc.setBounds(160, 227, 89, 23);
		contentPane.add(btnCalc);
	}
}
