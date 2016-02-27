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

public class TimChuoi extends JFrame {

	private JPanel contentPane;
	private JTextField txtChuoi1;
	private JTextField txtChuoi2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimChuoi frame = new TimChuoi();
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
	public TimChuoi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		setTitle("Tìm kiếm chuỗi");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Tìm kiếm chuỗi");
		lblTitle.setBounds(138, 0, 70, 23);
		contentPane.add(lblTitle);
		
		JLabel lblNhapchuoi = new JLabel("Nhập chuỗi 1");
		lblNhapchuoi.setBounds(10, 51, 85, 23);
		contentPane.add(lblNhapchuoi);
		
		JLabel lblNhapchuoi_1 = new JLabel("Nhập chuỗi 2");
		lblNhapchuoi_1.setBounds(10, 103, 85, 23);
		contentPane.add(lblNhapchuoi_1);
		
		JLabel lblKetqua = new JLabel("Kết quả");
		lblKetqua.setBounds(10, 198, 85, 23);
		contentPane.add(lblKetqua);
		
		JLabel lblShowketqua = new JLabel();
		lblShowketqua.setBounds(162, 198, 162, 23);
		contentPane.add(lblShowketqua);
		
		txtChuoi1 = new JTextField();
		txtChuoi1.setText("");
		txtChuoi1.setBounds(138, 52, 197, 20);
		contentPane.add(txtChuoi1);
		txtChuoi1.setColumns(10);
		
		txtChuoi2 = new JTextField();
		txtChuoi2.setText("");
		txtChuoi2.setBounds(138, 104, 197, 20);
		contentPane.add(txtChuoi2);
		txtChuoi2.setColumns(10);

		
		JButton btnTimkiem = new JButton("Tìm Kiếm ");
		btnTimkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String S1;
				String S2 = "";
				try {
					S1 = txtChuoi1.getText();
					S2 = txtChuoi2.getText();
					
					int pos = S1.indexOf(S2);
					System.out.println(pos);
					lblShowketqua.setText(Integer.toString(pos));
				} catch (Exception e) {
					// TODO: handle exception
				}
				
			}
		});
		btnTimkiem.setBounds(178, 148, 110, 23);
		contentPane.add(btnTimkiem);
		
			}

}
