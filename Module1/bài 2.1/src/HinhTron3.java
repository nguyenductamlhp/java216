import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;

public class HinhTron3 extends JFrame {

	private JPanel contentPane;
	private JTextField txtRadius;
	private JTextField txtCircumference;
	private JTextField txtArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HinhTron3 frame = new HinhTron3();
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
	public HinhTron3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtRadius = new JTextField("Bán kính");
		txtRadius.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent arg0) {
			}
			public void inputMethodTextChanged(InputMethodEvent arg0) {
				char c = ' ';
				if (c = )
			}
		});
		txtRadius.setBounds(63, 44, 210, 20);
		contentPane.add(txtRadius);
		txtRadius.setColumns(10);
		
		txtCircumference = new JTextField();
		txtCircumference.setEditable(false);
		txtCircumference.setText("Chu vi");
		txtCircumference.setBounds(63, 110, 210, 20);
		contentPane.add(txtCircumference);
		txtCircumference.setColumns(10);
		
		txtArea = new JTextField();
		txtArea.setEditable(false);
		txtArea.setText("Di\u1EC7n t\u00EDch");
		txtArea.setBounds(63, 175, 210, 20);
		contentPane.add(txtArea);
		txtArea.setColumns(10);
	}
}
