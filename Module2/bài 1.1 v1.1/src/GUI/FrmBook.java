package GUI;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import java.util.*;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTabbedPane;

public class FrmBook extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtDate;
	private JTextField txtPrice;
	private JTextField txtName;
	private JTextField txtPublisher;
	private JTextField txtAmount;
	private JTextField txtTax;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmBook frame = new FrmBook();
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
	public FrmBook() {
		setTitle("Quản lý sách");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInfo = new JLabel("Thông tin chung");
		lblInfo.setBounds(10, 10, 80, 20);
		contentPane.add(lblInfo);
		
		JLabel lblID = new JLabel("Mã sách");
		lblID.setHorizontalAlignment(SwingConstants.CENTER);
		lblID.setBounds(10, 50, 80, 20);
		contentPane.add(lblID);
		
		txtID = new JTextField();
		txtID.setBounds(100, 50, 105, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		JLabel lblDate = new JLabel("Ngày nhập");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setBounds(10, 80, 80, 20);
		contentPane.add(lblDate);
		
		txtDate = new JTextField();
		txtDate.setBounds(100, 80, 105, 20);
		contentPane.add(txtDate);
		txtDate.setColumns(10);
		
		JLabel lblPrice = new JLabel("Đơn giá");
		lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrice.setBounds(10, 110, 80, 20);
		contentPane.add(lblPrice);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(100, 110, 105, 20);
		contentPane.add(txtPrice);
		txtPrice.setColumns(10);
		
		JLabel lblName = new JLabel("Tên sách");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setBounds(240, 50, 80, 20);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setBounds(350, 50, 365, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblPublisher = new JLabel("Nhà xuất bản");
		lblPublisher.setHorizontalAlignment(SwingConstants.CENTER);
		lblPublisher.setBounds(240, 80, 80, 20);
		contentPane.add(lblPublisher);
		
		txtPublisher = new JTextField();
		txtPublisher.setBounds(350, 80, 365, 20);
		contentPane.add(txtPublisher);
		txtPublisher.setColumns(10);
		
		JLabel lblAmount = new JLabel("Số lượng");
		lblAmount.setHorizontalAlignment(SwingConstants.CENTER);
		lblAmount.setBounds(240, 110, 80, 20);
		contentPane.add(lblAmount);
		
		txtAmount = new JTextField();
		txtAmount.setBounds(350, 110, 365, 20);
		contentPane.add(txtAmount);
		txtAmount.setColumns(10);
		
		ButtonGroup btnGroup = new ButtonGroup();
		
		JRadioButton rdbtnStragyBook = new JRadioButton("Sách giáo khoa");
		rdbtnStragyBook.setBounds(100, 159, 109, 23);
		contentPane.add(rdbtnStragyBook);
		btnGroup.add(rdbtnStragyBook);
		
		JRadioButton rdbtnConsultBook = new JRadioButton("Sách tham khảo");
		rdbtnConsultBook.setBounds(348, 159, 109, 23);
		contentPane.add(rdbtnConsultBook);
		btnGroup.add(rdbtnConsultBook);
		
		JLabel lblStatus = new JLabel("Tình trạng");
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setBounds(10, 190, 80, 20);
		contentPane.add(lblStatus);
		
		JComboBox cbxStatus = new JComboBox();
		cbxStatus.setModel(new DefaultComboBoxModel(new String[] {"Cũ", "Mới"}));
		cbxStatus.setBounds(100, 189, 105, 20);
		contentPane.add(cbxStatus);
		
		JLabel lblTax = new JLabel("Thuế(1-100)");
		lblTax.setHorizontalAlignment(SwingConstants.CENTER);
		lblTax.setBounds(240, 190, 80, 20);
		contentPane.add(lblTax);
		
		txtTax = new JTextField();
		txtTax.setBounds(350, 190, 365, 20);
		contentPane.add(txtTax);
		txtTax.setColumns(10);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 265, 700, 95);
		contentPane.add(tabbedPane);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(20, 233, 695, 5);
		contentPane.add(tabbedPane_1);
	}
}
