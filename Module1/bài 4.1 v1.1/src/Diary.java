import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;

public class Diary extends JFrame {
	File DFile;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diary frame = new Diary();
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
	public Diary() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("./src/schedule.jpg"));
		setTitle("Mini Diary");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtTerm = new JTextArea();
		txtTerm.setBounds(89, 31, 335, 189);
		contentPane.add(txtTerm);
		
		JButton btnNew = new JButton("");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtTerm.setText("");
			}
		});
		btnNew.setIcon(new ImageIcon("./src/new.png"));
		btnNew.setBounds(10, 32, 50, 50);
		contentPane.add(btnNew);
		
		JButton btnOpen = new JButton("");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser("C:/");
				int value = fileChooser.showOpenDialog(null);
				if (value == JFileChooser.APPROVE_OPTION) {
					DFile = fileChooser.getSelectedFile();
					
				}
			}
		});
		btnOpen.setIcon(new ImageIcon("./src/open.png"));
		btnOpen.setBounds(10, 101, 50, 50);
		contentPane.add(btnOpen);
		
		JButton btnSave = new JButton("");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChooser = new JFileChooser("C:/");
				int value = fileChooser.showSaveDialog(null);
				if (value == JFileChooser.APPROVE_OPTION) {
					try {
						PrintWriter pw= new PrintWriter(new FileOutputStream(DFile.getAbsolutePath()));
						pw.print(txtTerm);
						pw.close();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnSave.setIcon(new ImageIcon("./src/save.png"));
		btnSave.setBounds(10, 178, 50, 50);
		contentPane.add(btnSave);
	}
}
