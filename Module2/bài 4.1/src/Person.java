import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Person {

	public String getName() {
		return Name;
	}

	public String getEmail() {
		return Email;
	}

	public String getPhone() {
		return Phone;
	}

	public String getImage() {
		return Image;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public void setImage(String image) {
		Image = image;
	}
	private String Name;
	private String Email;
	private String Phone;
	private String Image; 
	public Person() {
		this.Name = "";
		this.Email = "";
		this.Phone = "";
		this.Image = "";
	}

	public void setInfo(Node node) {
		NodeList list = node.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			switch (list.item(i).getNodeName()) {
			case "Name":
				this.Name = list.item(i).getNodeValue();
				this.Email = list.item(i).getNodeValue();
				this.Phone = list.item(i).getNodeValue();
				this.Image = list.item(i).getNodeValue();
			}
		}
	}
	public boolean writeFile(String path) throws SAXException, IOException, ParserConfigurationException, TransformerFactoryConfigurationError, TransformerException {
		
		File f = new File(path);
		if (f.createNewFile()) {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder build = factory.newDocumentBuilder();
			Document doc = build.newDocument();
			
			
			Element person = doc.createElement("person");
			doc.appendChild(person);
			
			Node Name = doc.createElement("Name");
			Name.setTextContent(this.Name);
			Node Email = doc.createElement("Email");
			Email.setTextContent(this.Email);
			Node Phone = doc.createElement("Phone");
			Phone.setTextContent(this.Phone);
			Node Image = doc.createElement("Image");
			Image.setTextContent(this.Image);
			
			person.appendChild(Name);
			person.appendChild(Email);
			person.appendChild(Phone);
			person.appendChild(Image);
			
			Transformer tr = TransformerFactory.newInstance().newTransformer();
			DOMSource src = new DOMSource(doc);
			StreamResult re = new StreamResult(f);
			
			tr.transform(src, re);
			
			
			return true;
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
