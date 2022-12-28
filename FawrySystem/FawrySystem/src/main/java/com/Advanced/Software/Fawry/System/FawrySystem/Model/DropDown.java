package com.Advanced.Software.Fawry.System.FawrySystem.Model;

import java.util.Vector;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor

public class DropDown extends FormFields {
	public int optionsNo;//number of drop down items
	public String textInMenue;
	public Vector<String> stringArray;//array of drop down items
	
	public DropDown(String fName, int fieldsInMenue,Vector<String> stringArray ) 
	{
		super("dropdown", fName);
		this.optionsNo=fieldsInMenue;
		this.stringArray=stringArray;

	} 
	
	public DropDown(){super.fieldType="dropdown";} 
	public DropDown(String fName){super("dropdown",fName);} 
	

}
