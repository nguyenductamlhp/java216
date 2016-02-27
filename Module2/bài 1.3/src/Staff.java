
public class Staff {

	private long Salary;
	private double Coefficient; 
	public Staff() {
		this.Salary = 5000000;
		this.Coefficient = 1.0;
	}

	public double getCoefficient() {
		return Coefficient;
	}

	public void setCoefficient(double coefficient) {
		Coefficient = coefficient;
	}

	public long getSalary() {
		return Salary;
	}

	public void setSalary(long salary) {
		Salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
