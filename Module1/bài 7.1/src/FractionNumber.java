
public class FractionNumber {

	private int Numerator;
	private int Denomirator;
	
	//
	private int GreatestDivisor(int a, int b) {
		int r = 1;
		for (int i = 2; i <= a; i++) {
			if (a % i == 0 && b % i == 0) {
				r = i;
			}
		}
		return r;
	}
	
	//constructor
	public FractionNumber() {
		Numerator = 0;
		Denomirator = 1;
	}
	public FractionNumber(int a, int b) {
		if (b != 0) {
			Numerator = a;
			Denomirator = b;
		}
		else {
			Numerator = 0;
			Denomirator = 1;
		}
	}
	
	//
	public boolean isExist() {
		if (Denomirator != 0) {
			return true;
		}
		else return false;
	}
	public FractionNumber Reduce() {		
		if (isExist()) {
			int divisor = GreatestDivisor(Numerator, Denomirator);
			Numerator = Numerator / divisor;
			Denomirator = Denomirator / divisor;
		}
		return this;
	}
	public String toString() {
		String S =  Integer.toString(Numerator) + "/" + Integer.toString(Denomirator);
		return S;
	}
	
	//construct operator
	public FractionNumber plus(FractionNumber F) {
		FractionNumber R = new FractionNumber();
		R.Denomirator = this.Denomirator * F.Denomirator;
		R.Numerator = this.Numerator * F.Denomirator + this.Denomirator * F.Numerator;
		R.Reduce();
		return R;
	}
	public FractionNumber subtract(FractionNumber F) {
		FractionNumber R = new FractionNumber();
		R.Denomirator = this.Denomirator * F.Denomirator;
		R.Numerator = this.Numerator * F.Denomirator - this.Denomirator * F.Numerator;
		R.Reduce();
		return R;
	}
	public FractionNumber multiple(FractionNumber F) {
		FractionNumber R = new FractionNumber();
		R.Denomirator = this.Denomirator * F.Denomirator;
		R.Numerator = this.Numerator * F.Numerator;
		R.Reduce();
		return R;
	}
	public FractionNumber divide(FractionNumber F) {
		FractionNumber R = new FractionNumber();
		R.Denomirator = this.Denomirator * F.Numerator;
		R.Numerator = this.Numerator * F.Denomirator;
		R.Reduce();
		return R;
	}
}
