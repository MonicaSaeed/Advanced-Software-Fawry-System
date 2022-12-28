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
	public int optionsNo;//number of drop down items
	public String textInMenue;
	public Vector<String> stringArray;//array of drop down items
	
	public DropDown(String fName, int fieldsInMenue,Vector<String> stringArray ) 
	{
		this.fieldType="dropdown";
		this.fieldName= fName;
		this.optionsNo=fieldsInMenue;
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
}
