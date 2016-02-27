import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelRound extends JPanel {
	private JTextField txtEdge;
	private JTextField txtCircumference;
	private JTextField txtArea;

	/**
	 * Create the panel.
	 */
	public PanelRound() {
		setLayout(null);
		
		JLabel lblInput = new JLabel("Cạnh");
		lblInput.setHorizontalAlignment(SwingConstants.CENTER);
		lblInput.setBounds(50, 50, 80, 20);
		add(lblInput);
		
		JLabel lblCircumference = new JLabel("chu vi");
		lblCircumference.setHorizontalAlignment(SwingConstants.CENTER);
		lblCircumference.setBounds(60, 120, 80, 20);
		add(lblCircumference);
		
		JLabel lblArea = new JLabel("Diện tích");
		lblArea.setHorizontalAlignment(SwingConstants.CENTER);
		lblArea.setBounds(60, 190, 80, 20);
		add(lblArea);
		
		txtEdge = new JTextField();
		txtEdge.setBounds(170, 50, 230, 20);
		add(txtEdge);
		txtEdge.setColumns(10);
		
		txtCircumference = new JTextField();
		txtCircumference.setEditable(false);
		txtCircumference.setBounds(170, 120, 230, 20);
		add(txtCircumference);
		txtCircumference.setColumns(10);
		
		txtArea = new JTextField();
		txtArea.setEditable(false);
		txtArea.setBounds(170, 190, 230, 20);
		add(txtArea);
		txtArea.setColumns(10);
		
		JButton btnCalc = new JButton("Tính");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Round R = new Round();
				if (Shape.isNumber(txtEdge.getText())) {
					R.setEdge(Double.parseDouble(txtEdge.getText()));
				}
				txtCircumference.setText(Double.toString(R.Circumference()));
				txtArea.setText(Double.toString(R.Area()));
			}
		});
		btnCalc.setBounds(199, 245, 89, 23);
		add(btnCalc);

	}

}
