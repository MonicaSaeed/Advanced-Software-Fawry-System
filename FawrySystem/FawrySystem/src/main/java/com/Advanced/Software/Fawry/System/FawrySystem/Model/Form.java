package com.Advanced.Software.Fawry.System.FawrySystem.Model;

import java.util.Vector;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
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
		for(int i=0;i<vec.size();i++)
		{
			if(vec.get(i).getFieldType().equals("text"))
			{
				Text newField= new Text(vec.get(i).getFieldName());
				vec.set(i,newField);
			}
			else if(vec.get(i).getFieldType().equals("dropdown"))
			{
				DropDown newField= new DropDown(vec.get(i).getFieldName());
				vec.set(i,newField);
			}
		}
	}
	
	

	

}
