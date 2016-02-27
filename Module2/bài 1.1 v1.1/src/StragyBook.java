
public class StragyBook extends Book{

	private boolean isNew;
	public StragyBook() {
		this.isNew = true; 
	}
	@Override
	public long Cost() {
		if (this.isNew) {
			return this.getPrice() * this.getAmount();
		}
		else {
			return this.getPrice() * this.getAmount() / 2;
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
