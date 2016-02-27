import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Zodiac extends JFrame {

	private JPanel contentPane;
	private JTextField txtYear;
	
	
	
	//
	public String calcCan(int year) {
		String Re = "";
		int iCan = Math.abs(year % 10);
		switch(iCan) {
		case 0:
			Re = "Canh";
			break;
		case 1:
			Re = "Tân";
			break;
		case 2:
			Re = "Nhâm";
			break;
		case 3:
			Re = "Quý";
			break;
		case 4:
			Re = "Giáp";
			break;
		case 5:
			Re = "Ất";
			break;
		case 6:
			Re = "Bính";
			break;
		case 7:
			Re = "Đinh";
			break;
		case 8:
			Re = "Mậu";
			break;
		case 9:
			Re = "Kỷ";
			break;
		default:
			Re = "ERROR";
			break;
		}
		return Re;
	}
	
	public String calcChi(int year) {
		String Re = "";
		int iChi = Math.abs(year % 12);
		switch(iChi) {
		case 0:
			Re = "Thân";
			break;
		case 1:
			Re = "Dậu";
			break;
		case 2:
			Re = "Tuất";
			break;
		case 3:
			Re = "Hợi";
			break;
		case 4:
			Re = "Tí";
			break;
		case 5:
			Re = "Sửu";
			break;
		case 6:
			Re = "Dần";
			break;
		case 7:
			Re = "Mão";
			break;
		case 8:
			Re = "Thìn";
			break;
		case 9:
			Re = "Tị";
			break;
		case 10:
			Re = "Ngọ";
			break;
		case 11:
			Re = "Mùi";
			break;
		default:
			Re = "ERROR";
			break;
		}
		return Re;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zodiac frame = new Zodiac();
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
	public Zodiac() {
		setTitle("Zodiac");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYear = new JLabel("Year of birth");
		lblYear.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblYear.setBounds(32, 34, 114, 27);
		contentPane.add(lblYear);
		
		txtYear = new JTextField();
		txtYear.setBounds(167, 37, 86, 20);
		contentPane.add(txtYear);
		txtYear.setColumns(10);

		JLabel lblImage = new JLabel("");
		lblImage.setLabelFor(lblImage);
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setBounds(167, 106, 86, 74);
		contentPane.add(lblImage);
		
		JLabel lblCan = new JLabel("");
		lblCan.setBounds(138, 211, 46, 27);
		contentPane.add(lblCan);
		
		JLabel lblChi = new JLabel("");
		lblChi.setBounds(207, 211, 67, 27);
		contentPane.add(lblChi);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					lblCan.setText(calcCan(Integer.parseInt(txtYear.getText())));
					lblChi.setText(calcChi(Integer.parseInt(txtYear.getText())));
					String path = "./src/img/" + calcChi(Integer.parseInt(txtYear.getText())) + ".jpg";
					lblImage.setIcon(new ImageIcon(path));
					lblImage.setText(path);
				} catch (Exception e) {
					txtYear.setText("");
				}
				
			}
		});
		btnOK.setBounds(65, 68, 331, 23);
		contentPane.add(btnOK);
	}

}
