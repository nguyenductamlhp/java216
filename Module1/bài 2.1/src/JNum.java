import java.awt.TextField;
import javax.swing.*;
public class JNum extends JTextField {
	
	public JNum() {
		super();
		setAction(null);
	}
	public JNum(String S) {
		super(S);
		setAction(null);
	}
	public JNum(int A) {
		super(A);
		setAction(null);
	}
	private void setAction() {
		this.addKeyListener(new MKey(this));
	}
}
