
abstract public class MusicalInstrument {

	private String Name;
	private String Image;
	abstract public String Play();
	public MusicalInstrument() {
		
	}
	public MusicalInstrument(String Name, String Image) {
		this.Name = Name;
		this.Image = Image;
	}

	public String getName() {
		return Name;
	}
	public String getImage() {
		return Image;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setImage(String image) {
		Image = image;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
