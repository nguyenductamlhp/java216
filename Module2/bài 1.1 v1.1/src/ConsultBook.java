
public class ConsultBook extends Book{

	private int Tax;
	public int getTax() {
		return Tax;
	}

	public void setTax(int tax) {
		if (tax >= 1 && tax <= 100) {
			Tax = tax;
		}		
	}

	public ConsultBook() {
		this.Tax = 1;
	}
	
	@Override
	public long Cost() {
		return this.getPrice() * this.getAmount() + this.getPrice() * this.getAmount() * this.Tax / 100; 
	}

	public static void main(String[] args) {
		

	}

}
