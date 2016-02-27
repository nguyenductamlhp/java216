package Data;

import java.util.Calendar;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Person {

	
	/**
	 * 
	 */
	private String ID;
	private String Name;
	private boolean isMale;
	private String Birth;
	private long Salary;
	public String getID() {
		return ID;
	}

	public String getName() {
		return Name;
	}

	

	public String getBirth() {
		return Birth;
	}

	public long getSalary() {
		return Salary;
	}

	public String getAddress() {
		return Address;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public void setName(String name) {
		Name = name;
	}


	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public void setBirth(String birth) {
		Birth = birth;
	}

	public void setSalary(long salary) {
		Salary = salary;
	}

	public void setAddress(String address) {
		Address = address;
	}

	private String Address;
	
	/**
	 * 
	 */
	public Person() {
		this.ID = "";
		this.Name = "";
		this.isMale = true;		
		this.Birth = "";
		this.Salary = 1000000;
		this.Address = "";
	}
	
	public void setInfo(Node node) {
		if (node.getNodeName().equals("person")) {
			NodeList list = node.getChildNodes();
			
			for (int i = 0; i < list.getLength(); i++) {
				if (list.item(i).getNodeName().equals("id")) {
					this.setID(list.item(i).getTextContent());
				}
				if (list.item(i).getNodeName().equals("name")) {
					this.setName(list.item(i).getTextContent());
				}
				if (list.item(i).getNodeName().equals("sex")) {
					if (list.item(i).getTextContent().equals("Nam")) {
						this.setMale(true);
					}
					else this.setMale(false);								
				}
				if (list.item(i).getNodeName().equals("birth")) {
					this.setBirth(list.item(i).getTextContent());
				}
				if (list.item(i).getNodeName().equals("salary")) {
					this.setSalary(Long.parseLong(list.item(i).getTextContent()));
				}
				if (list.item(i).getNodeName().equals("address")) {
					this.setAddress(list.item(i).getTextContent());
				}
			}		
						
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
