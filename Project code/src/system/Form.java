package system;

import java.util.Scanner;
import java.util.Vector;

public class Form {
	public int numberOfFields ;
	public static Vector<FormFields> vec = new Vector<>();
	
	public void setNumberOfFields(int numberOfFields) {
	    this.numberOfFields = numberOfFields ;
	}
	 public int getNumberOfFields() {
		    return numberOfFields;
	}
	public Vector<FormFields> getFormFields(){
		 return vec ;
	}
	// public void setVec(FormFields vec){
	//	 this.vec= vec;
	 //}
	 
	public void createForm(int numberOfFields) 
	{
	    //Form F= new Form() ;

		for(int i=0;i<=numberOfFields ;i++)
		{  
			int choice ;
			System.out.print(" choose field type if \n DropDown-> 1 \n text->2");
			Scanner scanInput = new Scanner(System.in);
			choice =scanInput.nextInt();
			if (choice==1) {
				DropDown D =new DropDown(); 
				vec.add(D);

			}
			else if (choice==2) {
				vec.add(new Text());
			}			
	    }
	}
}
