import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmInstrument extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtImage;
	private JTextField txtNum;
	private JTextField txtUse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmInstrument frame = new FrmInstrument();
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
	public FrmInstrument() {
		setTitle("Nhạc cụ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Tên");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(10, 10, 80, 20);
		contentPane.add(lblName);
		
		JLabel lblImage = new JLabel("Tên hình");
		lblImage.setHorizontalAlignment(SwingConstants.CENTER);
		lblImage.setBounds(10, 40, 80, 20);
		contentPane.add(lblImage);
		
		JLabel lblType = new JLabel("Loại");
		lblType.setHorizontalAlignment(SwingConstants.CENTER);
		lblType.setBounds(10, 70, 80, 20);
		contentPane.add(lblType);
		
		JLabel lblNum = new JLabel("Số dây");
		lblNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum.setBounds(10, 100, 80, 20);
		contentPane.add(lblNum);
		
		JLabel lblUse = new JLabel("Sử dụng");
		lblUse.setHorizontalAlignment(SwingConstants.CENTER);
		lblUse.setBounds(10, 130, 80, 20);
		contentPane.add(lblUse);
		
		JLabel lblNewLabel = new JLabel("để chơi");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(247, 130, 80, 20);
		contentPane.add(lblNewLabel);
		
		txtName = new JTextField();
		txtName.setBounds(100, 10, 260, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtImage = new JTextField();
		txtImage.setBounds(100, 40, 260, 20);
		contentPane.add(txtImage);
		txtImage.setColumns(10);
		
		JComboBox cbxType = new JComboBox();
		cbxType.setModel(new DefaultComboBoxModel(new String[] {"Có dây", "Không dây"}));
		cbxType.setBounds(100, 70, 260, 20);
		contentPane.add(cbxType);
		
		txtNum = new JTextField();
		txtNum.setBounds(100, 100, 86, 20);
		contentPane.add(txtNum);
		txtNum.setColumns(10);
		
		txtUse = new JTextField();
		txtUse.setBounds(100, 130, 137, 20);
		contentPane.add(txtUse);
		txtUse.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(337, 128, 249, 107);
		contentPane.add(textArea);
		
		JLabel lblShowImage = new JLabel("");
		lblShowImage.setBounds(398, 13, 188, 97);
		contentPane.add(lblShowImage);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MusicalInstrument instrument;
				switch (cbxType.getSelectedItem().toString()) {
				case "Có dây" :
					instrument = new StringInstrument();
					break;
				case "Không dây" :
					instrument = new NonStringInstrument();
					break;
				}
			}
		});
		btnPlay.setBounds(80, 227, 89, 23);
		contentPane.add(btnPlay);
	}
}
