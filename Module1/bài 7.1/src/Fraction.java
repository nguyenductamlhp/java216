import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class Fraction extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumerator1;
	private JTextField txtDenomirator1;
	private JTextField txtNumerator2;
	private JTextField txtDenomirator2;
	private JTextField txtResult;
	private JComboBox cbxOperator = new JComboBox();

	/**
	 * Launch the application.
	 */
	
	//
	private boolean isNumber(String S) {
		if (!S.isEmpty()) {
			for (int i = 0; i < S.length(); i++) {
				if (!Character.isDigit(S.charAt(i))) {
					return false;
				}
			}
		}
		else {
			return false;
		}
		
		return true;
	}
	
	public String Calc() {
		String S = "";
		try {
			FractionNumber R = new FractionNumber();			
			
			int a1, a2, b1, b2;
			
			a1 = Integer.parseInt(txtNumerator1.getText());
			a2 = Integer.parseInt(txtNumerator2.getText());
			b1 = Integer.parseInt(txtDenomirator1.getText());
			b2 = Integer.parseInt(txtDenomirator2.getText());
			
			FractionNumber F1 = new FractionNumber(a1, b1);
			FractionNumber F2 = new FractionNumber(a2, b2);
			
			String operator = (String) cbxOperator.getSelectedItem();
			switch (operator) {
			case "+":
				R = F1.plus(F2);
				break;
			case "-":
				R = F1.subtract(F2);
				break;
			case "x":
				R = F1.multiple(F2);
				break;
			case ":":
				R = F1.divide(F2);
				break;
			}
			
			S = R.toString();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Please enter number!");
		}
		return S;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fraction frame = new Fraction();
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
	public Fraction() {
		setTitle("Praction");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 327);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOption = new JMenu("Option");
		menuBar.add(mnOption);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mntmNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtNumerator1.setText("");
				txtNumerator2.setText("");
				txtDenomirator1.setText("");
				txtDenomirator2.setText("");
			}
		});
		mnOption.add(mntmNew);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFraction1 = new JLabel("Fraction 1");
		lblFraction1.setHorizontalAlignment(SwingConstants.CENTER);
		lblFraction1.setBounds(64, 11, 80, 20);
		contentPane.add(lblFraction1);
		
		JLabel lblFraction2 = new JLabel("Fraction 2");
		lblFraction2.setHorizontalAlignment(SwingConstants.CENTER);
		lblFraction2.setBounds(265, 14, 80, 20);
		contentPane.add(lblFraction2);
		
		txtNumerator1 = new JTextField();
		txtNumerator1.setBounds(58, 63, 86, 20);
		contentPane.add(txtNumerator1);
		txtNumerator1.setColumns(10);
		
		txtDenomirator1 = new JTextField();
		txtDenomirator1.setBounds(58, 127, 86, 20);
		contentPane.add(txtDenomirator1);
		txtDenomirator1.setColumns(10);
		
		txtNumerator2 = new JTextField();
		txtNumerator2.setBounds(265, 63, 86, 20);
		contentPane.add(txtNumerator2);
		txtNumerator2.setColumns(10);
		
		txtDenomirator2 = new JTextField();
		txtDenomirator2.setBounds(265, 127, 86, 20);
		contentPane.add(txtDenomirator2);
		txtDenomirator2.setColumns(10);		
		
		cbxOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "x", ":"}));
		cbxOperator.setBounds(166, 94, 71, 20);
		contentPane.add(cbxOperator);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(75, 178, 80, 20);
		contentPane.add(lblResult);
		
		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setBounds(222, 178, 86, 20);
		contentPane.add(txtResult);
		txtResult.setColumns(10);			
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					
					if (isNumber(txtNumerator1.getText()) && isNumber(txtDenomirator1.getText()) && 
							isNumber(txtNumerator2.getText()) && isNumber(txtDenomirator2.getText())) {
						txtResult.setText(Calc());						
					}
					else {
						JOptionPane.showMessageDialog(null, "Please enter integer number!");
					}
				} catch (NumberFormatException e) {					
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, "Please enter number");
				}				
			}
		});
		btnCalculate.setBounds(166, 227, 89, 23);
		contentPane.add(btnCalculate);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(45, 101, 108, 1);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(254, 101, 108, 1);
		contentPane.add(separator_1);
	}	
}
