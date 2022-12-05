package system;

import java.util.Scanner;

public class DropDown implements FormFields {
	
	public int fieldsInMenue;
	String[] stringArray;
	Scanner scanInput = new Scanner(System.in);

	@Override
	public void createFields() 
	{
		System.out.print(" Enter number of fields in DropDown menue ");
		
		fieldsInMenue =scanInput.nextInt();
		stringArray = new String[fieldsInMenue]; 

		for(int i=0;i<=fieldsInMenue ;i++)
		{ 			
			stringArray[i]= "hhhh";  ///enter data to array 
		}

	} 



}