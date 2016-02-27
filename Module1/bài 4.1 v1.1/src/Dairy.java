import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Dairy extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dairy frame = new Dairy();
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
	public Dairy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(112, 11, 320, 251);
		contentPane.add(textArea);
		
		JButton btnNew = new JButton("");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("");
			}
		});
		btnNew.setBounds(10, 11, 48, 48);
		btnNew.setIcon(new ImageIcon("./src/new.png"));
		contentPane.add(btnNew);
		
		JButton btnOpen = new JButton("");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser("C:/");
				int returnValue = fileChooser.showOpenDialog(null);
				if (returnValue == JFileChooser.APPROVE_OPTION) {
					File f = fileChooser.getSelectedFile();
					try {
						FileReader fr = new FileReader(f);
						char []cbuf = new char [(int)f.length()];
						try {
							fr.read(cbuf);
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						textArea.setText(String.valueOf(cbuf));
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, e1.getMessage());
					}
					
					
				}
				
				
				
			}
		});
		btnOpen.setBounds(10, 84, 48, 48);
		btnOpen.setIcon(new ImageIcon("./src/open.png"));
		contentPane.add(btnOpen);
		
		JButton btnSave = new JButton("");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String S = textArea.getText();
				JFileChooser fileChooser = new JFileChooser("C:/");
				int value = fileChooser.showSaveDialog(null);
				if (value == JFileChooser.APPROVE_OPTION) {
					File f = fileChooser.getSelectedFile();
					try {
						BufferedWriter bufWriter = new BufferedWriter(new FileWriter(f));
						bufWriter.write(S);
						bufWriter.flush();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		});
		btnSave.setBounds(10, 172, 48, 48);
		btnSave.setIcon(new ImageIcon("./src/save.png"));
		contentPane.add(btnSave);
	}
}
