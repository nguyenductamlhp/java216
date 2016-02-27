
public class Person {

	/**
	 * Variable
	 */
	private String Names;
	private String PhoneNum;
	private String Birth;
	private String Email;
	private String Image;
	
	/**
	 * Constructor
	 */
	public Person() {
		this.Names = "";
		this.PhoneNum = "000000000";
		this.Birth = "1/1/1995";
		this.Email = "";
		this.Image = "";
	}
	
	/**
	 * Getter
	 * @return
	 */
	public String getName() {
		return Names;
	}

	public String getPhoneNum() {
		return PhoneNum;
	}

	public String getBirth() {
		return Birth;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	public String getEmail() {
		return Email;
	}
	
	/**
	 * Setter
	 * @param name
	 */
	public void setName(String name) {
		Names = name;
	}

	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}

	public void setBirth(String birth) {
		Birth = birth;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * 
	 */
	private boolean isPhoneNumber(String S) {
		if ( S.length() > 9) {
			for (int i = 0; i < S.length(); i++) {
				if (!Character.isDigit(S.charAt(i))) {
					return false; 
				}
			}
			return true;
		}
		else {
			return false;
		}
	}
	public void addData(String S) {
		String []R = new String[5];
		R = S.split("[\\,]+");
		this.Names = R[0];
		if (isPhoneNumber(R[1])) {
			this.PhoneNum = R[1];
		}
		this.Birth = R[2];
		this.Email = R[3];
		this.Image = R[4];
	}

}
