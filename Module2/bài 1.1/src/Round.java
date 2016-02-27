
public class Round {

	private double Edge;
	public Round() {
		this.Edge = 0.0;
	}

	public double getEdge() {
		return Edge;
	}

	public void setEdge(double edge) {
		Edge = edge;
	}
	
	public double Circumference() {
		return this.Edge * 4;
		
	}
	public double Area() {
		return this.Edge * this.Edge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
