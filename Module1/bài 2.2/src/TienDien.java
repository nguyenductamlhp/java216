import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TienDien extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldChisocu;
	private JTextField textFieldChisomoi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TienDien frame = new TienDien();
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
	public TienDien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Tính tiền điện");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Tính tiền điện theo chỉ số đồng hồ");
		lblTitle.setBounds(83, 0, 225, 20);
		contentPane.add(lblTitle);
		
		JLabel lblChisocu = new JLabel("Chỉ số cũ");
		lblChisocu.setBounds(10, 46, 110, 20);
		contentPane.add(lblChisocu);
		
		JLabel lblChisomoi = new JLabel("Chỉ số mới");
		lblChisomoi.setBounds(10, 86, 110, 20);
		contentPane.add(lblChisomoi);
		
		JLabel lblTongsodien = new JLabel("Tổng số điện");
		lblTongsodien.setBounds(10, 160, 110, 20);
		contentPane.add(lblTongsodien);
		
		JLabel lblThanhtien = new JLabel("Thành tiền");
		lblThanhtien.setBounds(10, 201, 110, 20);
		contentPane.add(lblThanhtien);
		
		JLabel lblKqthanhtien = new JLabel("");
		lblKqthanhtien.setBounds(154, 201, 210, 20);
		contentPane.add(lblKqthanhtien);
		
		JLabel lblKqtongsodien = new JLabel("");
		lblKqtongsodien.setBounds(154, 157, 210, 20);
		contentPane.add(lblKqtongsodien);
		
		JLabel lblVnd = new JLabel("VND");
		lblVnd.setBounds(374, 198, 46, 20);
		contentPane.add(lblVnd);
		
		textFieldChisocu = new JTextField();
		textFieldChisocu.setBounds(130, 46, 210, 20);
		contentPane.add(textFieldChisocu);
		textFieldChisocu.setColumns(10);
		
		textFieldChisomoi = new JTextField();
		textFieldChisomoi.setBounds(130, 86, 210, 20);
		contentPane.add(textFieldChisomoi);
		textFieldChisomoi.setColumns(10);
		
		JLabel lblError = new JLabel("");
		lblError.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblError.setBounds(130, 232, 178, 29);
		contentPane.add(lblError);
		
		JButton btnTinh = new JButton("Tính");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int Socu, Somoi, TongSo;
				long Tien = 0;
				try {
					Socu = Integer.parseInt(textFieldChisocu.getText());
					Somoi = Integer.parseInt(textFieldChisomoi.getText());
					TongSo = Math.abs(Somoi - Socu);
					if (Socu > Somoi) {
						Tien = (Long) null;
					}
					else if (TongSo <= 50 && TongSo >= 0) {
						Tien = TongSo * 500;
					}
					else if (TongSo > 50 && TongSo <= 100) {
						Tien = TongSo * 1000;						
					}
					else if (TongSo > 100 && TongSo <= 200) {
						Tien = TongSo * 2000;
					}
					else if (TongSo > 200 && TongSo <= 300) {
						Tien = TongSo * 2500;
					}
					else if (TongSo >300) {
						Tien = TongSo * 4000;
					}
					
					lblKqtongsodien.setText(Integer.toString(TongSo));
					lblKqthanhtien.setText(Long.toString(Tien));
				} catch (Exception e2) {
						lblKqthanhtien.setText("");
						lblKqtongsodien.setText("");
						lblError.setText("ERROR");
					
				}
			}
		});
		btnTinh.setBounds(181, 123, 89, 23);
		contentPane.add(btnTinh);
		
		
	}

}
