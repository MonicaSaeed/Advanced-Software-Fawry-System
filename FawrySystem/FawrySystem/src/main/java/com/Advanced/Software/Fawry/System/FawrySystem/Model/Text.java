package com.Advanced.Software.Fawry.System.FawrySystem.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Text extends FormFields {
	public String text; //string for the text field

	public Text (String fName) {
		super("text", fName);

	} 
	public Text () {super.fieldType="text";} 


}
