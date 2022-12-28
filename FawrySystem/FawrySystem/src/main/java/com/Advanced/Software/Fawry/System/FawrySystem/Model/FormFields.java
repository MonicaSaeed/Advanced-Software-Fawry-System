package com.Advanced.Software.Fawry.System.FawrySystem.Model;

import java.util.Vector;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class FormFields {
	 protected String fieldType;
	 protected String fieldName;
	 protected int optionsNo;
	 protected Vector<String> stringArray;
	public FormFields(String fieldType,String fieldName)
	{
		this.fieldType=fieldType;
		this.fieldName=fieldName;
		
		
	}
	public FormFields(String fieldType,String fieldName, int fieldsInMenue,Vector<String> stringArray)
	{
		this.fieldType=fieldType;
		this.fieldName=fieldName;
		this.optionsNo=fieldsInMenue;
		this.stringArray=stringArray;
		
		
	}
	public FormFields(){}
	//public int fieldsInMenue;
	//public void showFields();
	//public void setFields();
	public String getFieldType() {
		return this.fieldType;
	}
	public String getFieldName() {
		return this.fieldName;
	}
	public int getOptionsNo() {
		return this.optionsNo;
	}
	public Vector<String> getStringArray() {
		return this.stringArray;
	}
}
