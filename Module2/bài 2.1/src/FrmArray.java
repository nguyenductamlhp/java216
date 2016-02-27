import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmArray extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	private class DigitKeyListener implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			
			char ch = e.getKeyChar();
			if ((ch < '0' || ch > '9') && (ch != '\b' && ch != ',') ) {
				e.consume();
			}
		}

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmArray frame = new FrmArray();
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
	public FrmArray() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArray = new JLabel("Nhập mảng");
		lblArray.setBounds(20, 20, 80, 20);
		contentPane.add(lblArray);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(110, 20, 291, 85);
		contentPane.add(scrollPane);
		
		JTextArea txtInput = new JTextArea();
		txtInput.addKeyListener(new DigitKeyListener());
		scrollPane.setViewportView(txtInput);
		
		JLabel lblResult = new JLabel("Kết Quả");
		lblResult.setBounds(20, 148, 80, 20);
		contentPane.add(lblResult);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(110, 146, 291, 85);
		contentPane.add(scrollPane_1);
		
		JTextArea txtOutput = new JTextArea();
		txtOutput.setEditable(false);
		scrollPane_1.setViewportView(txtOutput);
		
		JButton btnSort = new JButton("Sắp xếp");
		btnSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] Str = txtInput.getText().split("[\\,]+");
				System.out.println(Str.length);
				int[] arr = new int[Str.length];
				for (int i = 0; i < arr.length; i++) {
					arr[i] = Integer.parseInt(Str[i]);
				}
				for (int i = 0; i < arr.length; i++) {
					for (int j = i + 1; j < arr.length; j++) {
						if (arr[i] > arr[j]) {
							int t = arr[i];
							arr[i] = arr[j];
							arr[j] = t;
						}
					}
				}
				String S = "";
				for (int i = 0; i < arr.length; i++) {
					Str[i] = Integer.toString(arr[i]);
					S = S.concat(Str[i] + " ");
				}
				txtOutput.setText(S);
			}
		});
		btnSort.setBounds(206, 112, 89, 23);
		contentPane.add(btnSort);
	}
}
