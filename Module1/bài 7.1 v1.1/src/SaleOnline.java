import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class SaleOnline extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaleOnline frame = new SaleOnline();
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
	public SaleOnline() {
		setTitle("Sale online");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBook1 = new JLabel("");
		lblBook1.setBounds(10, 28, 141, 92);
		lblBook1.setIcon(new ImageIcon("./src/ccanxi.jpg"));
		contentPane.add(lblBook1);
		
		JLabel lblBook2 = new JLabel("");
		lblBook2.setBounds(235, 28, 141, 92);
		lblBook2.setIcon(new ImageIcon("./src/vitamin.jpg"));
		contentPane.add(lblBook2);
		
		JLabel lblBook3 = new JLabel("");
		lblBook3.setBounds(10, 146, 141, 92);
		lblBook3.setIcon(new ImageIcon("./src/vitaminad.jpg"));
		contentPane.add(lblBook3);
		
		JLabel lblBook4 = new JLabel("");
		lblBook4.setBounds(235, 146, 141, 92);
		lblBook4.setIcon(new ImageIcon("./src/vitaminc.jpg"));
		contentPane.add(lblBook4);
	}

}
