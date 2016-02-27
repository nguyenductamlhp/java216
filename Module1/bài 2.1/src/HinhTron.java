import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class HinhTron extends JFrame {

	private JPanel contentPane;
	private JTextField txtBk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HinhTron frame = new HinhTron();
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
	public HinhTron() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Hình tròn");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Tính chu vi và diện tích hình tròn");
		lblTitle.setBounds(73, 11, 275, 30);
		contentPane.add(lblTitle);
		
		JLabel lblBankinh = new JLabel("Bán kính");
		lblBankinh.setBounds(10, 64, 62, 21);
		contentPane.add(lblBankinh);
		
		JLabel lblChuvi = new JLabel("Chu Vi");
		lblChuvi.setBounds(10, 156, 62, 21);
		contentPane.add(lblChuvi);
		
		JLabel lblDientich = new JLabel("Diên tích");
		lblDientich.setBounds(10, 203, 62, 21);
		contentPane.add(lblDientich);
		
		JLabel lblKqchuvi = new JLabel("");
		lblKqchuvi.setBounds(132, 156, 141, 21);
		contentPane.add(lblKqchuvi);
		
		JLabel lblKqdientich = new JLabel("");
		lblKqdientich.setBounds(132, 203, 141, 21);
		contentPane.add(lblKqdientich);
		
		txtBk = new JTextField();
		txtBk.setText("");
		txtBk.setBounds(132, 64, 182, 20);
		contentPane.add(txtBk);
		txtBk.setColumns(10);
		
		JLabel lblError = new JLabel("");
		lblError.setForeground(Color.RED);
		lblError.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblError.setBackground(Color.BLACK);
		lblError.setBounds(132, 235, 160, 26);
		contentPane.add(lblError);
		
		JButton btnTinh = new JButton("Tinh");
		btnTinh.setText("Tính");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double R = 0;
				final double Pi = 3.14;
				
				try {
					R = Double.parseDouble(txtBk.getText());
					double C = (double) Math.round(Pi * 2 * R * 1000) / 1000;
					double S = (double) Math.round(Pi * R * R * 1000) / 1000;
					
					lblKqchuvi.setText(Double.toString(C));
					lblKqdientich.setText(Double.toString(S));
					lblError.setText("");
					
				} catch (Exception e2) {
					lblKqchuvi.setText("");
					lblKqdientich.setText("");
					
					txtBk.setText("");
					//lblError.setText("ERROR!");
					
				}
			}
		});
		btnTinh.setBounds(152, 101, 89, 23);
		contentPane.add(btnTinh);
		
		
	}

}
