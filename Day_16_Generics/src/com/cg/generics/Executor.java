package com.cg.generics;

public class Executor {

	public static void main(String[] args) {
		//create a sender to send a string message
		Sender<String>obj=new Sender<>();
		obj.setMessage("generic class demo");
		obj.sendMessage();
		
		//create an email object to be send using sender
		Email em=new Email();
		em.setFrom("as.473@gmail.com");
		em.setTo("ashtu@gmail.com");
		em.setSubject("for application");
		em.setBody("About training and placement");
		System.out.println(em.getBody());
		
		//create a sender to send this email
		Sender<Email>obj1=new Sender<>();
		obj1.setMessage(em);
		obj1.getMessage();
		obj1.sendMessage();
		
	}

}
