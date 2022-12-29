package com.Advanced.Software.Fawry.System.FawrySystem.Model;

import java.util.Vector;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
//@NoArgsConstructor

public class DropDown implements FormFields {
	protected String fieldType;
	protected String fieldName;
	private int optionsNo;//number of drop down items
	private Vector<String> stringArray;//array of drop down items
	private String choice;
	
	
	public DropDown(String fName, int fieldsInMenue,Vector<String> stringArray ) 
	{
		this.fieldType="dropdown";
		this.fieldName= fName;
		this.optionsNo=fieldsInMenue;
		this.stringArray=stringArray;

	} 
	
	public DropDown(String fName,Vector<String> stringArray ) 
	{
		this.fieldType="dropdown";
		this.fieldName= fName;
		this.stringArray=stringArray;

	} 
	
	public DropDown(){
		this.fieldType="dropdown";
	} 

	public DropDown(String fName) {
		this.fieldType="dropdown";
		this.fieldName= fName;
	} 
	public Vector<String> getStringArray() {
		return this.stringArray;
	}


	@Override
	public String getFieldType() {
		return this.fieldType;
	}

	@Override
	public String getFieldName() {
		return this.fieldName;
	}

	@Override
	public void setField(String text) {
		int indx=Integer.parseInt(text);
		this.choice=stringArray.get(indx-1);
	}

	@Override
	public String getFinalValue() {
		return this.choice;
	} 
}
