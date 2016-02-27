import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.xml.sax.SAXException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

public class FrmAddContact extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtEmail;
	private JTextField txtPhone;
	private JTextField txtImage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmAddContact frame = new FrmAddContact();
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
	public FrmAddContact() {
		setTitle("Thêm liên lạc");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtEmail.setText("");
				txtImage.setText("");
				txtName.setText("");
				txtPhone.setText("");
			}
		});
		mntmNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		menuBar.add(mntmNew);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 25, 80, 20);
		contentPane.add(lblName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 73, 80, 20);
		contentPane.add(lblEmail);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(10, 114, 80, 20);
		contentPane.add(lblPhone);
		
		JLabel lblImage = new JLabel("Image");
		lblImage.setBounds(10, 156, 80, 20);
		contentPane.add(lblImage);
		
		txtName = new JTextField();
		txtName.setBounds(112, 25, 284, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(112, 73, 284, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setBounds(112, 114, 284, 20);
		contentPane.add(txtPhone);
		txtPhone.setColumns(10);
		
		txtImage = new JTextField();
		txtImage.setBounds(113, 156, 177, 20);
		contentPane.add(txtImage);
		txtImage.setColumns(10);
		
		JButton btnSelect = new JButton("...");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser fileChooser = new JFileChooser();
				int value = fileChooser.showOpenDialog(null);
				if (value == JFileChooser.APPROVE_OPTION) {
					File f = fileChooser.getSelectedFile();
					txtImage.setText(f.getAbsolutePath());
				}
			}
		});
		btnSelect.setBounds(307, 155, 89, 23);
		contentPane.add(btnSelect);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Person P = new Person();
				P.setName(txtName.getText());
				P.setEmail(txtEmail.getText());
				P.setPhone(txtPhone.getText());
				P.setImage(txtImage.getText());
				String path = ".\\src\\" + P.getName() + ".xml";
				try {
					if (P.writeFile(path)) {
						JOptionPane.showMessageDialog(null, "Added!");
					}
					else {
						JOptionPane.showMessageDialog(null, "Error!");
					}
				} catch (SAXException | IOException | ParserConfigurationException
						| TransformerFactoryConfigurationError | TransformerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnAdd.setBounds(181, 206, 89, 23);
		contentPane.add(btnAdd);
	}
}
