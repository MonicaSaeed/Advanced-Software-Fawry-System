package system;

import java.util.Scanner;

public class Text implements FormFields {
	public String text; //string for the text field
	public String fieldName;
	Scanner scanInput = new Scanner(System.in);

	
	@Override
	public String getText() {
	    return this.text;
	  }
	  
	@Override
	public String getfieldName() {
		return this.fieldName;
	}
	  
	public void setfieldName(String fN) {
		this.fieldName = fN;
	}
	  
	public Text (String fName) {
		this.fieldName=fName;

	} 
	
	@Override
	public void showFields() {
		System.out.print(this.fieldName);
	}
	
	@Override
	public void setFields() {
		String t;
		System.out.print("enter the text: ");
		t=scanInput.next();
		this.text = t;
	}

}
