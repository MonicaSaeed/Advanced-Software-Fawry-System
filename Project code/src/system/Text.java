package system;

import java.util.Scanner;

public class Text implements FormFields {
	public String text;
	
	public String getText() {
	    return text;
	  }
	  public void setText(String t) {
	    this.text = t;
	  }
	@Override
	public void createFields() {
	
		Scanner scanInput = new Scanner(System.in);
		text =scanInput.next();
	} 

}
