import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmShape extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDrawShape = new JLabel("DRAW SHAPE");
		lblDrawShape.setBounds(159, 11, 92, 25);
		contentPane.add(lblDrawShape);
		
		JLabel lblShape = new JLabel("SHAPE");
		lblShape.setBounds(54, 56, 60, 19);
		contentPane.add(lblShape);
		
		JLabel lblBorder = new JLabel("BORDER");
		lblBorder.setBounds(258, 58, 60, 19);
		contentPane.add(lblBorder);
		
		JRadioButton rdbtnCircle = new JRadioButton("Circle");
		rdbtnCircle.setBounds(5, 82, 109, 23);
		contentPane.add(rdbtnCircle);
		
		JRadioButton rdbtnRetangle = new JRadioButton("Retangle");
		rdbtnRetangle.setBounds(5, 135, 109, 23);
		contentPane.add(rdbtnRetangle);
		
		JRadioButton rdbtnReadborder = new JRadioButton("ReadBorder");
		rdbtnReadborder.setBounds(209, 84, 109, 23);
		contentPane.add(rdbtnReadborder);
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnRetangle);
		btnGroup.add(rdbtnCircle);
		
		textField = new JTextField();
		textField.setBounds(54, 219, 301, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnDraw = new JButton("Draw");
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (rdbtnReadborder.isSelected()) {
					Shape shape = new RedShapeDecorater();
					textField.setText(shape.draw());
				}
				else {
					if (rdbtnCircle.isSelected()) {
						Shape shape = new RedShapeDecorater();
						textField.setText(shape.draw());
					}
				}
			}
		});
		btnDraw.setBounds(146, 168, 89, 23);
		contentPane.add(btnDraw);
	}
}
