import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class BookTicket extends JFrame {

	private JPanel contentPane;
	private JTextField txtSeat;
	private JTextField txtName;
	
	/**
	 * Method
	 * 
	 */
	
	private String []listFilm(String path) {
		File myFile = new File(path);
		String s;
		try {
			s = ReadOrWriteFile.readTXT(myFile);
			String []temps = s.split("\n");
			
			return temps;
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookTicket frame = new BookTicket();
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
	public BookTicket() {
		setTitle("Book");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSeat = new JLabel("Seat");
		lblSeat.setHorizontalAlignment(SwingConstants.LEFT);
		lblSeat.setBounds(23, 25, 73, 20);
		contentPane.add(lblSeat);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(23, 56, 73, 20);
		contentPane.add(lblName);
		
		JLabel lblFilm = new JLabel("Film");
		lblFilm.setBounds(23, 94, 73, 20);
		contentPane.add(lblFilm);
		
		txtSeat = new JTextField();
		txtSeat.setBounds(139, 25, 209, 20);
		contentPane.add(txtSeat);
		txtSeat.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(139, 56, 209, 20);
		contentPane.add(txtName);
		txtName.setColumns(10); 
		
		JComboBox BoxList = new JComboBox();
		BoxList.setModel(null);
		BoxList.setEditable(true);
		String []List = listFilm("");
		ImageRender imageRender = new ImageRender(List);
		BoxList.setRenderer(imageRender);
		
		
		
		BoxList.setBounds(139, 94, 209, 20);
		contentPane.add(BoxList);
	}
}
