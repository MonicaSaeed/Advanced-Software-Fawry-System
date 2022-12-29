package com.Advanced.Software.Fawry.System.FawrySystem.Model;

import java.util.Vector;

import com.Advanced.Software.Fawry.System.FawrySystem.BussinessLogic.HandlerBSL;

public abstract class Services {
	protected boolean payByCash;
	protected String serviceName;
	protected HandlerBSL handler;
	protected Form form;
	
	public Services(boolean cash)
	{
		this.payByCash=cash;
	}
	public Form getForm()
	{
		return this.form;
	}
	
	public void setFormData(String val1,String val2)
	{
		this.form.getVec().get(0).setField(val1);
		this.form.getVec().get(1).setField(val2);
		
	}
	public Vector<String> getFormData() {
		Vector<String> ret= new Vector<>();
		ret.add(this.form.getVec().get(0).getFinalValue());
		ret.add(this.form.getVec().get(1).getFinalValue());
		return ret;
	}
	
	public boolean getPayByCashStatus()
	{
		return this.payByCash;
	}
	public String getServiceName()
	{
		return this.serviceName;
	}
}
