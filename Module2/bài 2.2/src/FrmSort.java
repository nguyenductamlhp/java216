import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class FrmSort extends JFrame {

	private JPanel contentPane;
	private JTextArea txtrArray;
	private JTextArea txtResult;
	private JComboBox cbxType;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmSort frame = new FrmSort();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private class SortAction<T> implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Vector<T>  list = new Vector<T>();
			list.elementAt(0).getClass().isInstance(arg0);
			String s = new String();
			String s1 = new String();
			s.compareTo(s1);
			String[] Si = txtrArray.getText().split("[\\ \\,]+");  
			for (int i = 0; i < Si.length; i++) {
				list.addElement((T) Si[i]);
			}
			switch (cbxType.getSelectedItem().toString()) {
			case "Số nguyên":
				break;
			case "Số thực":
				break;
			case "Chuỗi:":
				break;
			}
			for (int i = 0; i < list.size(); i++) {
				for (int j = i + 1; j < list.size(); j++) {
					if (list.elementAt(i).equals(list.elementAt(j))) {
						Object T  = list.elementAt(i);
						list.elementAt(i) = list.
						
					}
				}
			}
		}
		
	}
	/**
	 * Create the frame.
	 */
	public FrmSort() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 344);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblType = new JLabel("Loại");
		lblType.setBounds(20, 20, 80, 20);
		contentPane.add(lblType);
		
		cbxType = new JComboBox();
		cbxType.setModel(new DefaultComboBoxModel(new String[] {"Số nguyên", "Số thực", "Chuỗi"}));
		cbxType.setBounds(120, 20, 269, 20);
		contentPane.add(cbxType);
		
		JLabel lblArray = new JLabel("Mảng");
		lblArray.setBounds(20, 72, 80, 20);
		contentPane.add(lblArray);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(120, 70, 269, 69);
		contentPane.add(scrollPane);
		
		txtrArray = new JTextArea();
		scrollPane.setViewportView(txtrArray);
		
		JLabel lblResult = new JLabel("Kết quả");
		lblResult.setBounds(20, 199, 80, 20);
		contentPane.add(lblResult);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(120, 197, 269, 80);
		contentPane.add(scrollPane_1);
		
		txtResult = new JTextArea();
		scrollPane_1.setViewportView(txtResult);
		
		JButton btnSort = new JButton("Sort");
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnSort.setBounds(205, 158, 89, 23);
		contentPane.add(btnSort);
	}
}
