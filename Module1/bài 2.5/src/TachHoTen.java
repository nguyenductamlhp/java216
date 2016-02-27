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

public class TachHoTen extends JFrame {

	private JPanel contentPane;
	private JTextField txtHoten;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TachHoTen frame = new TachHoTen();
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
	public TachHoTen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Tách chuỗi họ tên");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTachhoten = new JLabel("Tách họ tên");
		lblTachhoten.setBounds(119, 11, 158, 21);
		contentPane.add(lblTachhoten);
		
		JLabel lblNhaphoten = new JLabel("Nhập họ tên");
		lblNhaphoten.setBounds(10, 53, 89, 21);
		contentPane.add(lblNhaphoten);
		
		txtHoten = new JTextField();
		txtHoten.setText("");
		txtHoten.setBounds(141, 53, 151, 20);
		contentPane.add(txtHoten);
		txtHoten.setColumns(10);
		
		JLabel lblHo = new JLabel("Họ");
		lblHo.setBounds(53, 148, 46, 21);
		contentPane.add(lblHo);
		
		JLabel lblTen = new JLabel("Tên");
		lblTen.setBounds(53, 184, 46, 21);
		contentPane.add(lblTen);
		
		JLabel lblShowho = new JLabel("");
		lblShowho.setBounds(141, 148, 151, 21);
		contentPane.add(lblShowho);
		
		JLabel lblShowten = new JLabel("");
		lblShowten.setBounds(141, 184, 151, 21);
		contentPane.add(lblShowten);

		
		JButton btnTach = new JButton("Tách");
		btnTach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Ho, Ten, HoTen;
				HoTen = txtHoten.getText();
				Ho = HoTen.substring(0, HoTen.lastIndexOf(" "));
				Ten = HoTen.substring(HoTen.lastIndexOf(" "), HoTen.length());
				
				lblShowho.setText(Ho);
				lblShowten.setText(Ten);
			}
		});
		btnTach.setBounds(141, 103, 89, 23);
		contentPane.add(btnTach);
		
			}
}
