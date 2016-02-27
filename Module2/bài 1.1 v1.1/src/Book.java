import java.util.Date;

public abstract class Book {
	
	private String ID;
	private String Name;
	private Date ImportDay;
	private long Price;
	private short Amount;
	private String Publisher;
	public String getID() {
		return ID;
	}

	public String getName() {
		return Name;
	}

	public Date getImportDay() {
		return ImportDay;
	}

	public long getPrice() {
		return Price;
	}

	public short getAmount() {
		return Amount;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setImportDay(Date importDay) {
		ImportDay = importDay;
	}

	public void setPrice(long price) {
		Price = price;
	}

	public void setAmount(short amount) {
		Amount = amount;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public Book() {
		this.ID = "";
		this.Name = "";
		this.Amount = 0;
		this.ImportDay = new Date();
		this.Price = 0;
		this.Publisher = "";
	}
	abstract public long Cost();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
