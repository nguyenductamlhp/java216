import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InHello extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InHello frame = new InHello();
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
	public InHello() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHello = new JButton("Hello");
		btnHello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("**    **  ******  **      **         ****  ");
				System.out.println("**    **  **      **      **       **    **");
				System.out.println("**    **  **      **      **       **    **");
				System.out.println("********  ******  **      **       **    **");
				System.out.println("********  ******  **      **       **    **");
				System.out.println("**    **  **      **      **       **    **");
				System.out.println("**    **  **      ******  *****    **    **");
				System.out.println("**    **  ******  ******  *****      ****   ");
			}
		});
		btnHello.setFont(new Font("Times New Roman", Font.BOLD, 60));
		btnHello.setBounds(115, 63, 218, 130);
		contentPane.add(btnHello);
	}

}
