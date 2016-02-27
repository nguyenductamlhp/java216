
public class Point {

	private double x, y;
	
	public Point(double x, double y) {
		// 
	}

	public double getDiatance(Point P) {
		double result = Math.sqrt((x - P.x)*(x - P.x) - (y - P.y)*(y - P.y));
		return result;
	}
}
