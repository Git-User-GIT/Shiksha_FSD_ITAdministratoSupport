package com.greatLearning.main;
import java.util.Scanner;
import com.greatLearning.model.Credentials;
import com.greatLearning.model.Employee;

public class DriverClass {


	public static void main(String[] args) {
		Employee emp= new Employee("Shiksha", "Gupta");
		Credentials cred=new Credentials();
		
		System.out.println("Please enter the department from the following :");
		System.out.println("1.Admin");
		System.out.println("2.Technical");
		System.out.println("3.Human Resourse");
		System.out.println("4.Legal");
		
		Scanner sc=new Scanner(System.in);
		String dep=sc.next();
		String pass =null;
		String emailAdd = null;
				
		  switch (dep) {
		  
	        case "Admin":
	        	emailAdd = cred.generateEmail(emp.getFirstName(),emp.getLastName(),"admin");
	        	pass= cred.generatePassword();
	        	
	            break;
	 
	        
	        case "Technical":
	       // 	dep = 
	        	pass= cred.generatePassword();
	        	emailAdd=(cred.generateEmail(emp.getFirstName(),emp.getLastName(),"tech"));
	        
	            break;
	 
	            
	        case "Human Resource":
	        emailAdd = cred.generateEmail(emp.getFirstName(),emp.getLastName(),"hr");
	        	pass= cred.generatePassword();
	        	
	        	
	            break;
	 
	           
	        case "Legal":
//	        	dep = "legal.company.com";
	        	pass= cred.generatePassword();
	        	emailAdd=cred.generateEmail(emp.getFirstName(),emp.getLastName(),"legal");
	        
	            break;
		  }
	       
	 emp.setEmail(emailAdd);
	 emp.setPassword(pass);
	 cred.show(emp);
	 
}}
