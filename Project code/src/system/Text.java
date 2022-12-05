package system;

import java.util.Scanner;

public class Text implements FormFields {
	public String text; //string for the text field
	public String fieldName;
	
	public String getText() {
	    return text;
	  }
	  public void setText(String t) {
	    this.text = t;
	  }
	public String getfieldName() {
		    return fieldName;
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
		
		//Scanner scanInput = new Scanner(System.in);
		//text =scanInput.next();//enter data to text field
		
		//System.out.print(this.text); //print data in text field
	}
	@Override
	public void fillFields() {}

}
