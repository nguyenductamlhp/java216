import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

public class FrmShape extends JFrame {

	private JPanel contentPane;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmShape frame = new FrmShape();
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
	public FrmShape() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabShape = new JTabbedPane(JTabbedPane.TOP);
		tabShape.setSelectedIndex(-1);
		tabShape.setBounds(10, 11, 434, 316);
		PanelRetangle pRetangle = new PanelRetangle();
		PanelRound pRound = new PanelRound();
		PanelCircle pCircle = new PanelCircle();
		tabShape.add("Hình Chữ Nhật", pRetangle);
		tabShape.add("Hình Vuông", pRound);
		tabShape.add("Hình tròn", pCircle);
		contentPane.add(tabShape);
	}
}
