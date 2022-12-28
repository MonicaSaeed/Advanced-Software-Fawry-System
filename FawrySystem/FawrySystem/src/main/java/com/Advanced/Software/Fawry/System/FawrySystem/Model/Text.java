package com.Advanced.Software.Fawry.System.FawrySystem.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Text implements FormFields {
	protected String fieldType;
	protected String fieldName;
	public String text; //string for the text field

	public Text (String fName) {
		this.fieldType="text";
		this.fieldName= fName;
	} 
	public Text () {
		this.fieldType="text";
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
