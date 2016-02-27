import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImageBut extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImageBut frame = new ImageBut();
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
	public ImageBut() {
		setTitle("Image View");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb = new JLabel("");
		lb.setBounds(168, 11, 220, 239);
		contentPane.add(lb);
		
		JButton btnDoraemon = new JButton("");
		btnDoraemon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb.setIcon( new ImageIcon("./src/Doraemon.jpg"));
			}
		});
		btnDoraemon.setIcon(new ImageIcon("./src/icon-Doraemon.jpg"));
		btnDoraemon.setBounds(10, 11, 65, 65);
		contentPane.add(btnDoraemon);
		
		JButton btnNobita = new JButton("");
		btnNobita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb.setIcon(new ImageIcon("./src/Nobita.jpg"));
			}
		});
		btnNobita.setIcon(new ImageIcon("./src/icon-Nobita.jpg"));
		btnNobita.setBounds(10, 87, 65, 65);
		contentPane.add(btnNobita);
		
		JButton btnXuka = new JButton("");
		btnXuka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lb.setIcon(new ImageIcon("./src/Xuka.jpg"));
			}
		});
		btnXuka.setIcon(new ImageIcon("./src/icon-Xuka.jpg"));
		btnXuka.setBounds(10, 163, 65, 65);
		contentPane.add(btnXuka);
	}

}
