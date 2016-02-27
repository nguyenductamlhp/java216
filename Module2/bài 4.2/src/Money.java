
public class Money {

	private String ID;
	private String Name;
	private double BuyRate;
	private double SaleRate;
	
	/**
	 * Constructor
	 */
	public Money() {
		this.ID = "";
		this.Name = "";
		this.BuyRate = 1.0;
		this.SaleRate = 1.0;
	}
	public String getID() {
		return ID;
	}
	public String getName() {
		return Name;
	}
	public double getBuyRate() {
		return BuyRate;
	}
	public double getSaleRate() {
		return SaleRate;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setBuyRate(double buyRate) {
		BuyRate = buyRate;
	}
	public void setSaleRate(double saleRate) {
		SaleRate = saleRate;
	}
	public Money(String S) {
		
	}
	

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
