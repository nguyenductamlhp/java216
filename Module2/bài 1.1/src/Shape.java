
public class Shape {

	String Name;
	public Shape() {
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	/**
	 * 
	 * @param args
	 */
	public static boolean isNumber(String S) {
		for (int i = 0; i < S.length(); i++) {
			if (!(Character.isDigit(S.charAt(i)) || S.charAt(i) == '.')) {				
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
