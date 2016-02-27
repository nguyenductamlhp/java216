import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ListMoney {

	private Vector<Buy> list;
	
	/**
	 * Costructor
	 */
	public ListMoney() {
		this.list = new Vector<Buy>();
	}

	/**
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 * 
	 */
	public void readFile(String path) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(new File(path));
		
		Element root = document.getDocumentElement();
		NodeList nodeList = root.getChildNodes();
		NamedNodeMap nnm;
		
		
		for (int i = 0; i < nodeList.getLength(); i++) {
			Buy M = new Buy();
			
			if (nodeList.item(i).getNodeName().equals("Exrate")) {
				nnm = nodeList.item(i).getAttributes();
				//if (nnm.)
				M.setID(nnm.getNamedItem("CurrencyCode").getNodeValue());
				M.setName(nnm.getNamedItem("CurrencyName").getNodeValue());
				M.setBuyRate(Double.parseDouble(nnm.getNamedItem("Buy").getNodeValue()));
				M.setSaleRate(Double.parseDouble(nnm.getNamedItem("Sell").getNodeValue()));
				
				this.list.addElement(M);
			}
			
		}
		
	}
	public TableModel toTableModel() {
		
		String[] s = new String[] { "Mã", "Tên ngoại tệ", "Giá mua", "Giá bán" };
		
		String[][] S = new String[list.size()][4];
		
		for (int i = 0; i < list.size(); i++) {
			S[i][0] = list.elementAt(i).getID();
			S[i][1] = list.elementAt(i).getName();
			S[i][2] = Double.toString(list.elementAt(i).getBuyRate());
			S[i][3] = Double.toString(list.elementAt(i).getSaleRate());
			//tableModel.setValueAt(list.elementAt(i).getID(), i, 1);
			//tableModel.setValueAt(list.elementAt(i).getName(), i, 1);
//			tableModel.setValueAt(list.elementAt(i).getBuyRate(), i, 1);
			//tableModel.setValueAt(list.elementAt(i).getSaleRate(), i, 1);
		}
		DefaultTableModel tableModel = new DefaultTableModel( 
			S,
			s
		);
		
		
		return tableModel;
	}
	public String[] listID() {
		String[] S = new String[this.list.size()];
		for (int i = 0; i < this.list.size(); i++) {
			S[i] = list.elementAt(i).getID();
		}
		return S;
	}
	public Buy findPos(String s) {
		for (int i = 0; i < this.list.size(); i++) {
			if (s.equals(this.list.elementAt(i).getID())) {
				return this.list.elementAt(i);
			}
		}
		return null;
	}
	/**
	 * 
	 * @param args
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
	
		//readFile("./src/ExrateXML.xml");
	}

}
