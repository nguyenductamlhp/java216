
public class Circle extends Shape {

	final double Pi = 3.14;
	double Radius;
	
	public Circle() {
		super();
		this.Name = "Hình Tròn";
		this.Radius = 0.0;
	}

	public double getRadius() {
		return Radius;
	}

	public void setRadius(double radius) {
		Radius = radius;
	}
	
	public double Circumference() {
		return this.Radius * 2 * Pi;
	}
	public double Area() {
		return this.Radius * this.Radius * this.Pi;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
