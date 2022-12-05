package system;

import java.util.Scanner;
import java.util.Vector;

public class DropDown implements FormFields {
	
	public int fieldsInMenue;
	public String textInMenue;
	private String[] stringArray; // array of fields inside the menu
	//private Vector<String> stringArray;
	Scanner scanInput = new Scanner(System.in);
	public String fieldName;
	private String choosenOption;
	
	
	@Override
	public String getfieldName() {
	    return fieldName;
	}
	public void setfieldName(String fN) {
	    this.fieldName = fN;
	}


	public DropDown(String fName) 
	{
		this.fieldName=fName;
		System.out.print(" Enter number of fields in DropDown menue ");
		
		fieldsInMenue =scanInput.nextInt();
		
		stringArray = new String[fieldsInMenue]; 

		for(int i=0;i<fieldsInMenue ;i++)
		{ 		
			textInMenue =scanInput.next();
			stringArray[i]= textInMenue;  ///enter data to array 
		}

	} 
	
	@Override
	public void showFields() {
		
		System.out.print(this.fieldName);

		for(int i=0;i<fieldsInMenue ;i++)
		{ 		
			System.out.print(stringArray[i]); ///print data of the menu 
		}
	
	}
	@Override
	public void setFields() 
	{
		int index;
		System.out.print("Enter the number of your choice: ");
		index=scanInput.nextInt();
		if(index>=stringArray.length)
		{
			return;
		}
		this.choosenOption=stringArray[index];
	}
	@Override
	public String getText() {
		// TODO Auto-generated method stub
		
		
		return this.choosenOption;
	}
	

}