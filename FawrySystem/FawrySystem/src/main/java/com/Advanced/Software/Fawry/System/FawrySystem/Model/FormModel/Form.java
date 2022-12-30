package com.Advanced.Software.Fawry.System.FawrySystem.Model.FormModel;

import java.util.Vector;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Form {
	private int numberOfFields ;
	private Vector<FormFields> vec ;//= new Vector<>();
	
//	public Form(int numberOfFields)
//	{
//		this.numberOfFields=numberOfFields;
//	}
	
	public Form(int numberOfFields,Vector<FormFields> vec)
	{
		this.numberOfFields=numberOfFields;
		this.vec=vec;
	}

	
	
	public int getNumberOfFields()
	{
		return this.numberOfFields;
	}
	public Vector<FormFields> getVec()
	{
		return this.vec;
	}
	

}
