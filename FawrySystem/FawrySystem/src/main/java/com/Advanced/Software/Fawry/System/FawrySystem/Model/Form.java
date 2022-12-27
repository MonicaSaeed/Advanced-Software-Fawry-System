package com.Advanced.Software.Fawry.System.FawrySystem.Model;

import java.util.Vector;

public class Form {
	public int numberOfFields ;
	public Vector<FormFields> vec ;//= new Vector<>();
	
	public Form(int numberOfFields)
	{
		this.numberOfFields=numberOfFields;
	}
	
	public Form(int numberOfFields,Vector<FormFields> vec)
	{
		this.numberOfFields=numberOfFields;
		this.vec=vec;
	}
	
	public Form(){}
	
	public void setNumberOfFields(int numberOfFields)
	{
	    this.numberOfFields = numberOfFields ;
	}

	public int getNumberOfFields()
	{
		return numberOfFields;
	}
	

}
