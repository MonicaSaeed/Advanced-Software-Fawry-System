package com.Advanced.Software.Fawry.System.FawrySystem.Model.PaymentModel;

public class PaymentInfo {
			private float amount;
			private String directory;
			private String serviceName;
			private String paymentMethod;
			private String creditCardNum;
			
			public PaymentInfo() {}
			public PaymentInfo(float amount, String directory,String serviceName, String paymentMethod,String creditCardNum)
			{
				 this.setAmount(amount);
				 this.setDirectory(directory);
				 this.setServiceName(serviceName);
				 this.setPaymentMethod(paymentMethod);
				 this.setCreditCardNum(creditCardNum);
			}
			
			public PaymentInfo(float amount, String directory,String serviceName, String paymentMethod)
			{
				 this.setAmount(amount);
				 this.setDirectory(directory);
				 this.setServiceName(serviceName);
				 this.setPaymentMethod(paymentMethod);
				 
			}
			public float getAmount() {
				return amount;
			}
			public void setAmount(float amount) {
				this.amount = amount;
			}
			public String getDirectory() {
				return directory;
			}
			public void setDirectory(String directory) {
				this.directory = directory;
			}
			public String getServiceName() {
				return serviceName;
			}
			public void setServiceName(String serviceName) {
				this.serviceName = serviceName;
			}
			public String getPaymentMethod() {
				return paymentMethod;
			}
			public void setPaymentMethod(String paymentMethod) {
				this.paymentMethod = paymentMethod;
			}
			public String getCreditCardNum() {
				return creditCardNum;
			}
			public void setCreditCardNum(String creditCardNum) {
				this.creditCardNum = creditCardNum;
			}
			
			
}

 