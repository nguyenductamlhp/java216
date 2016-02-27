
public class Person {
	String Name = "";
	String NumPhone = "0000000000";
	String Image = "";
	
	private boolean isPhoneNumber(String S) {
		for (int i = 0; i < S.length(); i++) {
			if (!Character.isDigit(S.charAt(i))) {
				return false;
			}
		}
		if (S.charAt(0) != '0') {
			return false;
		}
		return true;
	}
	public void addInfo(String S) {
		String arr[] = S.split("[\\,]+");
		Name = arr[0];
		if (isPhoneNumber(arr[1])) {
			NumPhone = arr[1];
		}
		Image = arr[2];
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String arr[]) {
		
	}

}
