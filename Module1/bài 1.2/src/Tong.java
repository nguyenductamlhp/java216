import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Tong extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tong frame = new Tong();
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
	public Tong() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Tổng 2 số nguyên");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTngS = new JLabel("Tính tổng 2 số nguyên");
		lblTngS.setBounds(144, 11, 133, 25);
		contentPane.add(lblTngS);
		
		JLabel lblSo1 = new JLabel("Số nguyên thứ nhất");
		lblSo1.setBounds(24, 66, 120, 25);
		contentPane.add(lblSo1);
		
		JLabel lblSo2 = new JLabel("Số nguyên thứ hai");
		lblSo2.setBounds(24, 117, 120, 25);
		contentPane.add(lblSo2);
		
		JLabel lblKtQu = new JLabel("Kết quả");
		lblKtQu.setBounds(24, 209, 46, 14);
		contentPane.add(lblKtQu);
		
		JLabel label = new JLabel("");
		label.setBounds(203, 209, 46, 14);
		contentPane.add(label);
		
		textField1 = new JTextField();
		textField1.setBounds(239, 63, 86, 20);
		contentPane.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(239, 114, 86, 20);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		JButton buttonTong = new JButton("Tổng");
		buttonTong.setBounds(170, 163, 89, 23);
		buttonTong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int So1, So2, KQ;				
					
				try {
					So1 = Integer.parseInt(textField1.getText());
					So2 = Integer.parseInt(textField2.getText());
					KQ = So1 + So2;
					String KQua = Integer.toString(KQ);
					label.setText(KQua);
				} catch (Exception e) {
					label.setText("Error!");
				}
				
			}
		});
		contentPane.add(buttonTong);
		
		
		
	}

}
