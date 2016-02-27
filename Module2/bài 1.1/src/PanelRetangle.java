import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelRetangle extends JPanel {
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtcircumference;
	private JTextField txtArea;
	
	
	/**
	 * Create the panel.
	 */
	public PanelRetangle() {
		setLayout(null);
		
		JLabel lblA = new JLabel("Cạnh a");
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBounds(40, 40, 80, 20);
		add(lblA);
		
		JLabel lblB = new JLabel("Cạnh b");
		lblB.setHorizontalAlignment(SwingConstants.CENTER);
		lblB.setBounds(40, 90, 80, 20);
		add(lblB);
		
		JLabel lblCircumference = new JLabel("Chu vi");
		lblCircumference.setHorizontalAlignment(SwingConstants.CENTER);
		lblCircumference.setBounds(40, 140, 80, 20);
		add(lblCircumference);
		
		JLabel lblArea = new JLabel("Diện tích");
		lblArea.setHorizontalAlignment(SwingConstants.CENTER);
		lblArea.setBounds(40, 180, 80, 20);
		add(lblArea);
		
		txtA = new JTextField();
		txtA.setBounds(150, 40, 220, 20);
		add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(150, 90, 220, 20);
		add(txtB);
		txtB.setColumns(10);
		
		txtcircumference = new JTextField();
		txtcircumference.setEditable(false);
		txtcircumference.setBounds(150, 140, 220, 20);
		add(txtcircumference);
		txtcircumference.setColumns(10);
		
		txtArea = new JTextField();
		txtArea.setEditable(false);
		txtArea.setBounds(150, 180, 220, 20);
		add(txtArea);
		txtArea.setColumns(10);
		
		JButton btnCalc = new JButton("Tính");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Retangle R = new Retangle();
				if (Shape.isNumber(txtA.getText())) {
					R.setA(Double.parseDouble(txtA.getText()));
				}
				if (Shape.isNumber(txtB.getText())) {
					R.setB(Double.parseDouble(txtB.getText()));
				}				
				txtcircumference.setText(Double.toString(R.Circumference()));
				txtArea.setText(Double.toString(R.Area()));
			}
		});
		btnCalc.setBounds(194, 243, 89, 23);
		add(btnCalc);

	}
}
