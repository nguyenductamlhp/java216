import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelCircle extends JPanel {
	private JTextField txtRadius;
	private JTextField txtCircumference;
	private JTextField txtArea;

	/**
	 * Create the panel.
	 */
	public PanelCircle() {
		setLayout(null);
		
		JLabel lblRadius = new JLabel("Bán kính");
		lblRadius.setHorizontalAlignment(SwingConstants.CENTER);
		lblRadius.setBounds(40, 50, 80, 20);
		add(lblRadius);
		
		JLabel lblCircumference = new JLabel("Chu vi");
		lblCircumference.setHorizontalAlignment(SwingConstants.CENTER);
		lblCircumference.setBounds(40, 100, 80, 20);
		add(lblCircumference);
		
		JLabel lblNewLabel = new JLabel("Diện tích");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(40, 160, 80, 20);
		add(lblNewLabel);
		
		txtRadius = new JTextField();
		txtRadius.setBounds(150, 50, 200, 20);
		add(txtRadius);
		txtRadius.setColumns(10);
		
		txtCircumference = new JTextField();
		txtCircumference.setEditable(false);
		txtCircumference.setBounds(150, 100, 200, 20);
		add(txtCircumference);
		txtCircumference.setColumns(10);
		
		txtArea = new JTextField();
		txtArea.setEditable(false);
		txtArea.setBounds(150, 160, 200, 20);
		add(txtArea);
		txtArea.setColumns(10);
		
		JButton btnCalc = new JButton("Tính");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Circle C = new Circle();
				if (Shape.isNumber(txtRadius.getText())) {
					C.setRadius(Double.parseDouble(txtRadius.getText()));
				}
				txtCircumference.setText(Double.toString(C.Circumference()));
				txtArea.setText(Double.toString(C.Area()));
			}
		});
		btnCalc.setBounds(187, 214, 89, 23);
		add(btnCalc);

	}

}
