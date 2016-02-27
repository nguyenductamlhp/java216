
public class NonStringInstrument extends MusicalInstrument {

	private String Using; 
	public NonStringInstrument() {
		
	}

	public NonStringInstrument(String using, String Name, String Image) {
		super(Name, Image);
		this.Using = using;
	}

	@Override
	public String Play() {
		
		return "Phát ra am thanh sử dung" + this.Using;
	}

	public static void main(String[] args) {
		

	}

}
