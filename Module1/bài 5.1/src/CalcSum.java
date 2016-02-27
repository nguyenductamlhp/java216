import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class CalcSum extends JFrame {

	private JPanel contentPane;
	private JTextField txtInput;
	private JTextField txtSum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcSum frame = new CalcSum();
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
	public CalcSum() {
		setTitle("Tính tổng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("Tính tổng phần tử trong mảng");
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(22, 11, 361, 25);
		contentPane.add(lblTitle);
		
		JLabel lblInput = new JLabel("Nhập n");
		lblInput.setBounds(22, 64, 50, 20);
		contentPane.add(lblInput);
		
		txtInput = new JTextField();
		txtInput.setDocument(new DigitDocument());
		txtInput.setBounds(115, 64, 86, 20);
		contentPane.add(txtInput);
		txtInput.setColumns(10);
		
		JLabel lblArray = new JLabel("Mảng");
		lblArray.setBounds(22, 111, 50, 20);
		contentPane.add(lblArray);
		
		JTextArea txtArray = new JTextArea();
		txtArray.setLineWrap(true);
		txtArray.setWrapStyleWord(true);
		txtArray.setBounds(115, 109, 268, 77);
		contentPane.add(txtArray);
		
		txtSum = new JTextField();
		txtSum.setEditable(false);
		txtSum.setBounds(115, 211, 86, 20);
		contentPane.add(txtSum);
		txtSum.setColumns(10);
		
		JButton btnCalc = new JButton("Tính");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n = Integer.parseInt(txtInput.getText());
				int []Arr = new int[n];
				int Sum = 0;
				String S = "";
				Random r = new Random();
				for (int i = 0; i < n; i++) {
					Arr[i] = r.nextInt(100);
					Sum = Sum + Arr[i];
					if (i > 0 && i % 10 == 0) {
						S = S + "\n" + Integer.toString(Arr[i]);
					}
					else {
						S = S + " " + Integer.toString(Arr[i]);
					}
					
				}
				txtSum.setText(Integer.toString(Sum));
				txtArray.setText(S);
			}
		});
		btnCalc.setBounds(10, 210, 89, 23);
		contentPane.add(btnCalc);
	}
}
