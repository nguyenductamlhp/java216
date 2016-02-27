package Data;

import java.io.IOException;
import java.util.Vector;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.sun.org.apache.xml.internal.serializer.ElemDesc;

public class Group {

	private String GroupName;
	private Vector<Person> list = new Vector<Person>();
	
	public Group() {
		
	}
	
	public void setGroup(Node node) {
		if (node.getNodeName().equals("group")) {
			NodeList list = node.getChildNodes();
			
			for (int i = 0; i < list.getLength(); i++) {
				
			}
		}
	}

	public static void main(String[] args) throws SAXException, IOException, ParserConfigurationException {
		
	}
}
