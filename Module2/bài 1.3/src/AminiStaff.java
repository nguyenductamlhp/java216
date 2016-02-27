
public class AminiStaff extends Staff{

	public AminiStaff() {
		
		this.setCoefficient(1.2);
	}

	public String returnSalary() {
		long R = 0;
		R = (long) (this.getSalary() * this.getCoefficient());
		return Double.toString(R);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
