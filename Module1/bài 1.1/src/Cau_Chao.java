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

public class Cau_Chao extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cau_Chao frame = new Cau_Chao();
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
	public Cau_Chao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("Xin chào");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbNhapHoTen = new JLabel("New label");
		lbNhapHoTen.setBounds(74, 52, 105, 24);
		contentPane.add(lbNhapHoTen);
		lbNhapHoTen.setText("Nhập họ tên: ");
		
		textField = new JTextField();
		textField.setBounds(189, 54, 164, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(67, 172, 286, 24);
		contentPane.add(label);
		
		JButton button = new JButton("");
		button.setText("Xuất câu chào");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String HoTen = textField.getText();
				label.setText("Chào bạn " + HoTen + ", chào mừng bạn đến với Java");
			}
		});
		button.setBounds(154, 123, 164, 23);
		contentPane.add(button);
	}
}
