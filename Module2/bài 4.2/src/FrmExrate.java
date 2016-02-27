import java.awt.EventQueue;
import java.io.IOException;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class FrmExrate extends JFrame {

	private JPanel contentPane;
	private JTextField txtInput;
	private JTextField txtBuy;
	private JTextField txtSale;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmExrate frame = new FrmExrate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws SAXException 
	 * @throws ParserConfigurationException 
	 */
	public FrmExrate() throws ParserConfigurationException, SAXException, IOException {
		ListMoney list = new ListMoney();
		list.readFile("./src/ExrateXML.xml");
		
		
		setTitle("Tỉ giá");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 400, 255);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(list.toTableModel());
		scrollPane.setViewportView(table);
		
		JLabel lblInput = new JLabel("Nhập số tiền");
		lblInput.setHorizontalAlignment(SwingConstants.CENTER);
		lblInput.setBounds(10, 301, 80, 20);
		contentPane.add(lblInput);
		
		JLabel lblType = new JLabel("Loại ngoại tệ");
		lblType.setHorizontalAlignment(SwingConstants.CENTER);
		lblType.setBounds(10, 340, 80, 20);
		contentPane.add(lblType);
		
		JLabel lblCost = new JLabel("Thành tiền");
		lblCost.setHorizontalAlignment(SwingConstants.CENTER);
		lblCost.setBounds(10, 370, 80, 20);
		contentPane.add(lblCost);
		
		JLabel lblBuy = new JLabel("Mua");
		lblBuy.setBounds(94, 370, 40, 20);
		contentPane.add(lblBuy);
		
		JLabel lblSale = new JLabel("Bán");
		lblSale.setBounds(94, 400, 40, 20);
		contentPane.add(lblSale);
		
		txtInput = new JTextField();
		txtInput.setBounds(140, 300, 200, 20);
		txtInput.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {
                    e.consume();
                }
                if (txtInput.getText().length() >= 8) {
                	e.consume();
                }
            }
        });
		contentPane.add(txtInput);
		txtInput.setColumns(10);
		
		JComboBox cbxType = new JComboBox();
		cbxType.setModel(new DefaultComboBoxModel(list.listID()));
		cbxType.setBounds(140, 340, 200, 20);
		
		contentPane.add(cbxType);
		
		txtBuy = new JTextField();
		txtBuy.setEditable(false);
		txtBuy.setBounds(140, 370, 200, 20);
		contentPane.add(txtBuy);
		txtBuy.setColumns(10);
		
		txtSale = new JTextField();
		txtSale.setEditable(false);
		txtSale.setBounds(140, 401, 200, 20);
		contentPane.add(txtSale);
		txtSale.setColumns(10);
		
		JButton btnCalc = new JButton("Tính");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Buy presentMoney = list.findPos(cbxType.getSelectedItem().toString());
				if (txtInput.getText().equals("")) {
					txtInput.setText("0");
				}
				int input = Integer.parseInt(txtInput.getText());
				double buy = input * presentMoney.getBuyRate();
				buy = Math.round(buy * 100.0) / 100.0;
				DecimalFormat df = new DecimalFormat("###.##");
				String txtbuy = df.format(buy);
				
				double sale = input * presentMoney.getSaleRate();
				sale = Math.round(sale * 100.0) / 100.0;
				DecimalFormat df1 = new DecimalFormat("###.##");
				String txtsale = df1.format(buy);
				txtBuy.setText(txtbuy);
				txtSale.setText(txtsale);
			}
		});
		btnCalc.setBounds(160, 430, 89, 23);
		contentPane.add(btnCalc);
	}
}
