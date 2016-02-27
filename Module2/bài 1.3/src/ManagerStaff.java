
public class ManagerStaff extends Staff{

	
	public ManagerStaff() {
		this.setCoefficient(2.0);
	}

	public String returnSalary() {
		long R = (long) (this.getSalary() * this.getCoefficient());
		R = (long) (R + R / 10);
		return Double.toString(R);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
