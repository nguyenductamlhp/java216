
public class RedShapeDecorater extends ShapeDecorater{
	private Shape shape;

	public RedShapeDecorater() {

	}
	public String draw() {

		return shape.draw() + "viền đỏ";
	}

}
