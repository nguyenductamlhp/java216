
public class TechStaff extends Staff{

	private int Num;
	public TechStaff() {
		this.setCoefficient(1.5);
	}

	public int getNum() {
		return Num;
	}

	public void setNum(int num) {
		Num = num;
	}
	
	public String returnSalary() {
		long R = (long) (this.getSalary() * this.getCoefficient() + this.Num * 1000000);
		return Double.toString(R);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
