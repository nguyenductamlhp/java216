
public class StringInstrument extends MusicalInstrument {

	int AmountString;
	public StringInstrument() {
		
	}

	public StringInstrument(int numString, String Name, String Image) {
		super(Name, Image);
		this.AmountString = numString;
	}

	@Override
	public String Play() {
		
		return this.getName() + "c�" + this.AmountString + "d�y";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
