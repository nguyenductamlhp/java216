import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TinhTien extends JFrame {

	private JPanel contentPane;
	private JTextField tFieldSL;
	private JTextField tFGia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TinhTien frame = new TinhTien();
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
	public TinhTien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Tính giá trị hóa đơn");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Tính giá trị hóa đơn");
		lblTitle.setBounds(139, 11, 108, 29);
		contentPane.add(lblTitle);
		
		JLabel lblSL = new JLabel("Số lượng");
		lblSL.setBounds(43, 66, 77, 29);
		contentPane.add(lblSL);
		
		JLabel lblnGia = new JLabel("Đơn giá");
		lblnGia.setBounds(43, 124, 77, 29);
		contentPane.add(lblnGia);
		
		JLabel lblThanhtien1 = new JLabel("Thành tiền");
		lblThanhtien1.setBounds(43, 203, 64, 23);
		contentPane.add(lblThanhtien1);
		
		JLabel lblThanhtien2 = new JLabel("");
		lblThanhtien2.setBounds(160, 203, 158, 23);
		contentPane.add(lblThanhtien2);
		
		tFieldSL = new JTextField();
		tFieldSL.setBounds(160, 70, 158, 20);
		contentPane.add(tFieldSL);
		tFieldSL.setColumns(10);
		
		tFGia = new JTextField();
		tFGia.setBounds(160, 128, 158, 20);
		contentPane.add(tFGia);
		tFGia.setColumns(10);
		
		JLabel lblVnd = new JLabel("VND");
		lblVnd.setBounds(328, 124, 46, 27);
		contentPane.add(lblVnd);
		
		JLabel lblVnd_1 = new JLabel("VND");
		lblVnd_1.setBounds(328, 205, 46, 18);
		contentPane.add(lblVnd_1);
		
		JButton btnTinh = new JButton("Tính tiền");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int SL, Gia;
				long Tien;
				
				try {
					SL = Integer.parseInt(tFieldSL.getText());
					Gia = Integer.parseInt(tFGia.getText());
					Tien = SL * Gia;
					
					lblThanhtien2.setText(Long.toString(Tien));
				} catch (Exception e) {
					lblThanhtien2.setText("ERROR!");
				}
				
				
			}
		});
		btnTinh.setBounds(188, 169, 89, 23);
		contentPane.add(btnTinh);
		
		
	}

}
