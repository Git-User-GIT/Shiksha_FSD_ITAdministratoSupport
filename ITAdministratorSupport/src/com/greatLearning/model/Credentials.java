package com.greatLearning.model;
import java.util.Random;
import com.Shiksha.interfaces.CredentialService;
public class Credentials implements CredentialService {
	
	
	public String generatePassword() {
		String passWord=new String();
		
		String passwordString="ABCDEFGHIJKLMNOPLQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()~=-`0123456789";
	//String number="0123456789";
	//	String specailChar="!@#$%^&*()~=-`";
		
		Random random=new Random();
		for(int len=0;len<=8;len++) {
			int index=random.nextInt(passwordString.length());
		//	passWord.append(passwordString.charAt(index));
			passWord=passWord+passwordString.charAt(index);
			
		}
		return passWord;
		
	}
	public String generateEmail(String firstname, String lastName,String department ) {
		String emailAdd=firstname.toLowerCase()+lastName.toLowerCase()+"@"+department+".company.com";
		
		return emailAdd;
		
	}
	@Override
	public void show(Employee empp) {
		System.out.println("------------Credentials-----------");		
	System.out.println("Email :"+ empp.getEmail());// TODO Auto-generated method stub
		System.out.println("Password :"+ empp.getPassword());
	}
	
	
	
	}
