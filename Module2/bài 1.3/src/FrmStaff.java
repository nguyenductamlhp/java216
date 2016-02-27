import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmStaff extends JFrame {

	private JPanel contentPane;
	private JTextField txtCoefficienet;
	private JTextField txtNum;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmStaff frame = new FrmStaff();
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
	public FrmStaff() {
		setTitle("Tính lương");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblType = new JLabel("Loại NV");
		lblType.setHorizontalAlignment(SwingConstants.CENTER);
		lblType.setBounds(20, 20, 80, 20);
		contentPane.add(lblType);
		
		JLabel lblCoefficient = new JLabel("Hệ số");
		lblCoefficient.setHorizontalAlignment(SwingConstants.CENTER);
		lblCoefficient.setBounds(20, 60, 80, 20);
		contentPane.add(lblCoefficient);
		
		JLabel lblNum = new JLabel("Số dự án");
		lblNum.setEnabled(false);
		lblNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum.setBounds(20, 110, 80, 20);
		contentPane.add(lblNum);
		
		JLabel lblResult = new JLabel("Kết Quả");
		lblResult.setHorizontalAlignment(SwingConstants.CENTER);
		lblResult.setBounds(20, 160, 80, 20);
		contentPane.add(lblResult);
		
		JComboBox cbxType = new JComboBox();
		cbxType.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch (cbxType.getSelectedItem().toString()) {
				case "Hành chánh":
					txtCoefficienet.setText("1.2");
					lblNum.setEnabled(false);
					txtNum.setEnabled(false);
					break;
				case "Kỹ thuật":
					txtCoefficienet.setText("1.5");
					lblNum.setEnabled(true);
					txtNum.setEnabled(true);
					break;
				case "Kinh doanh":
					txtCoefficienet.setText("1.3");
					lblNum.setEnabled(false);
					txtNum.setEnabled(false);
					break;
				case "Lãnh đạo":
					txtCoefficienet.setText("2.0");
					lblNum.setEnabled(false);
					txtNum.setEnabled(false);
					break;

				default:
					break;
				}
				
			}
		});
		cbxType.setModel(new DefaultComboBoxModel(new String[] {"", "Hành chánh", "Kỹ thuật", "Kinh doanh", "Lãnh đạo"}));
		cbxType.setBounds(150, 20, 220, 20);
		contentPane.add(cbxType);
		
		txtCoefficienet = new JTextField();
		txtCoefficienet.setEditable(false);
		txtCoefficienet.setBounds(150, 60, 220, 20);
		contentPane.add(txtCoefficienet);
		txtCoefficienet.setColumns(10);
		
		txtNum = new JTextField();
		txtNum.setEnabled(false);
		txtNum.setBounds(150, 110, 220, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setBounds(150, 160, 220, 20);
		contentPane.add(txtResult);
		txtResult.setColumns(10);
		
		JButton btnCalc = new JButton("Tính");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (cbxType.getSelectedItem().toString()) {
				case "Hành chánh":
					AminiStaff Astaff = new AminiStaff();
					txtResult.setText(Astaff.returnSalary());
					break;
				case "Kỹ thuật":
					txtCoefficienet.setText("1.5");
					lblNum.setEnabled(true);
					txtNum.setEnabled(true);
					TechStaff Tstaff = new TechStaff();
					txtResult.setText(Tstaff.returnSalary());
					break;
				case "Kinh doanh":
					txtCoefficienet.setText("1.3");
					lblNum.setEnabled(false);
					txtNum.setEnabled(false);
					BusinessStaff Bstaff = new BusinessStaff();
					txtResult.setText(Bstaff.returnSalary());
					break;
				case "Lãnh đạo":
					txtCoefficienet.setText("2.0");
					lblNum.setEnabled(false);
					txtNum.setEnabled(false);
					ManagerStaff Mstaff = new ManagerStaff();
					txtResult.setText(Mstaff.returnSalary());
					break;

				default:
					break;
				}

			}
		});
		btnCalc.setBounds(203, 201, 89, 23);
		contentPane.add(btnCalc);
	}
}
