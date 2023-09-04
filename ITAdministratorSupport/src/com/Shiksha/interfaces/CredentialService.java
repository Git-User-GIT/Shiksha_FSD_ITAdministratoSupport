package com.Shiksha.interfaces;

import java.util.Random;

import com.greatLearning.model.Employee;

public interface CredentialService {
	
	public String generatePassword( );
	public String generateEmail(String firstname, String lastName , String department);
	//public void show();
	void show(Employee empp);
	
	
	
		
	}


