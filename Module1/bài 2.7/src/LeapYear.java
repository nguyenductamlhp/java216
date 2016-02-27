import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LeapYear extends JFrame {

	private JPanel contentPane;
	private JTextField txtMonth;
	private JTextField txtYear;
	private JTextField txtRe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LeapYear frame = new LeapYear();
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
	public LeapYear() {
		setTitle("T\u00EDnh s\u1ED1 ng\u00E0y trong th\u00E1ng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitle = new JLabel("T\u00EDnh s\u1ED1 ng\u00E0y theo th\u00E1ng v\u00E0 n\u0103m");
		lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(64, 11, 290, 20);
		contentPane.add(lblTitle);
		
		JLabel lblEnterMonth = new JLabel("Nh\u1EADp th\u00E1ng");
		lblEnterMonth.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterMonth.setBounds(10, 59, 115, 20);
		contentPane.add(lblEnterMonth);
		
		JLabel lblEnterYear = new JLabel("Nh\u1EADp n\u0103m");
		lblEnterYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterYear.setBounds(10, 100, 115, 20);
		contentPane.add(lblEnterYear);
		
		txtMonth = new JTextField();
		txtMonth.setBounds(165, 59, 134, 20);
		contentPane.add(txtMonth);
		txtMonth.setColumns(10);
		
		txtYear = new JTextField();
		txtYear.setBounds(165, 100, 134, 20);
		contentPane.add(txtYear);
		txtYear.setColumns(10);
		
		JLabel lblRe = new JLabel("K\u1EBFt Qu\u1EA3");
		lblRe.setHorizontalAlignment(SwingConstants.CENTER);
		lblRe.setBounds(10, 147, 115, 20);
		contentPane.add(lblRe);
		
		txtRe = new JTextField();
		txtRe.setEditable(false);
		txtRe.setBounds(165, 147, 134, 20);
		contentPane.add(txtRe);
		txtRe.setColumns(10);
		
		JButton btnCalc = new JButton("Tính");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int iMonth, iYear;
				String Re = "";
				try {
					iMonth  = Integer.parseInt(txtMonth.getText());
					iYear  = Integer.parseInt(txtYear.getText());
					
					switch (iMonth) {
					case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						Re = "31";
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						Re = "30";
					case 2:
						if (iYear % 4 == 0 && iYear % 100 != 0) {
							Re = "29";
						}
						else Re = "28";
					default:						
						txtRe.setText("");
						txtMonth.setText("");
						txtYear.setText("");
					}
					
					txtRe.setText(Re);
				} catch (Exception e) {
					txtRe.setText("");
					txtMonth.setText("");
					txtYear.setText("");
				}
				
				
			}
		});
		btnCalc.setBounds(182, 207, 89, 23);
		contentPane.add(btnCalc);
	}

}
