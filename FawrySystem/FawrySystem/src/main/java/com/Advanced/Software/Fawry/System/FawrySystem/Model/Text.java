package com.Advanced.Software.Fawry.System.FawrySystem.Model;

public class Text extends FormFields {
	public String text; //string for the text field
	public String fieldName;

	//@Override
//	public void showFields() {
//		// TODO Auto-generated method stub
//
//	}
	public Text (String fName) {
		this.fieldName=fName;
		this.fieldType="text";

	} 
	public Text () {this.fieldType="text";} 
	@Override 
	public void setfieldName(String fN) {
		this.fieldName = fN;
	}

	public void setFields(String text) {
		// TODO Auto-generated method stub
		this.text=text;
	}

	@Override
	public String getfieldName() {
		// TODO Auto-generated method stub
		return this.fieldName;
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return this.text;
	}

	

}
