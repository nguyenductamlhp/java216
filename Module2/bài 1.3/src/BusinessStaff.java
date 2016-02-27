
public class BusinessStaff extends Staff{

	private long Bonus = 1000000;
	public BusinessStaff() {
		this.setCoefficient(1.3);
	}
	
	public String returnSalary() {
		long R = (long) (this.getSalary() * this.getCoefficient() + this.Bonus);
		return Double.toString(R);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
