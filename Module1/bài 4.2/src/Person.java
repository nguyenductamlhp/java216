import java.io.*;
public class Person {

	public String Name;
	public String NumPhone;
	public String Image;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
	private boolean isDigitString(String S) {
		for (int i = 0; i < S.length(); i++) {
			if (!Character.isDigit(S.charAt(i))) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public void addInfo(String S) {
		String []Re = S.split(",");
		Name = Re[0];
		if (isDigitString(Re[1])){
			NumPhone = Re[1];
		} else NumPhone = "00000000000";
		Image = Re[2];
	}
	public static void main(String []a) {
		
	}
}
