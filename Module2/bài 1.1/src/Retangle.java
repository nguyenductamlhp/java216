public class Retangle {

	private  double a, b;
	public Retangle() {
		a = 0.0;
		b = 0.0;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public void setA(double a) {
		this.a = a;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double Circumference() {
		return (this.a + this.b) * 2;
	}
	public double Area() {
		return this.a * this.b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
