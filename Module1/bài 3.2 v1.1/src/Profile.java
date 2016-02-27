import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;

public class Profile extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTextField txtCardNumber;
	private JButton btnChoosePicture;
	private JButton btnSave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Profile frame = new Profile();
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
	public Profile() {
		setTitle("My profile");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAvatar = new JLabel("");
		lblAvatar.setBounds(10, 22, 125, 128);
		contentPane.add(lblAvatar);
		
		txtName = new JTextField();
		txtName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				txtName.setText("");
			}
		});
		txtName.setText("Name");
		txtName.setBounds(227, 22, 197, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(227, 64, 197, 20);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(227, 111, 197, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtCardNumber = new JTextField();
		txtCardNumber.setBounds(227, 159, 197, 20);
		contentPane.add(txtCardNumber);
		txtCardNumber.setColumns(10);
		
		btnChoosePicture = new JButton("Choose Picture");
		btnChoosePicture.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser("C://");
				int value = fileChooser.showOpenDialog(null);				
				if (value == fileChooser.APPROVE_OPTION) {
					java.io.File f = fileChooser.getSelectedFile();
					lblAvatar.setIcon(new ImageIcon(f.getAbsolutePath()));
				}
			}
		});
		btnChoosePicture.setBounds(21, 176, 157, 23);
		contentPane.add(btnChoosePicture);
		
		btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Message M = new Message();
				M.setVisible(true);
				
			}
		});
		btnSave.setBounds(190, 209, 125, 41);
		contentPane.add(btnSave);
	}
}
