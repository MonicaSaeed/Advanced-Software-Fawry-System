package com.Advanced.Software.Fawry.System.FawrySystem.Model;

import java.util.Vector;

public class DropDown extends FormFields {
	public int fieldsInMenue;//number of drop down items
	public String textInMenue;
	private Vector<String> stringArray;//array of drop down items
	public String fieldName;
	//private String choosenOption;
	
	public DropDown(String fName, int fieldsInMenue,Vector<String> stringArray ) 
	{
		this.fieldName=fName;
		this.stringArray=stringArray;
		this.fieldType="dropdown";

	} 
	
	public DropDown(){this.fieldType="dropdown";} 
	
	@Override
	public String getfieldName() {
		// TODO Auto-generated method stub
		return this.fieldName;
	}
	@Override
	public void setfieldName(String fN) {
	    this.fieldName = fN;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

}
