package Data;

import java.io.IOException;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Company {

	private Vector<Group> Company = new Vector<Group>();
	
	
	public Company() {
		
	}

	public void readFile(String path) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder build = factory.newDocumentBuilder();
		Document doc = build.parse("./src/data.xml");
		
		Element root = doc.getDocumentElement();
		NodeList group = root.getChildNodes();
		NodeList buff;
		
		for (int i = 0; i < group.getLength(); i++) {
			if (group.item(i).getNodeName().equals("group")) {
				buff = group.item(i).getChildNodes();
				for (int j = 0; j < buff.getLength(); j++) {
					if (buff.item(j).getNodeName().equals("GroupName")) {
						this.GroupName = buff.item(j).getTextContent();						
					}
					if (buff.item(j).getNodeName().equals("person")) {
						NodeList person = buff.item(j).getChildNodes();
						
					}
					
				}
			}
	}	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
