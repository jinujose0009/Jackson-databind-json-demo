package com.jinu.maven;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try{
			//create object mapper
			ObjectMapper mapper=new ObjectMapper();
			//read json file and map/convert to java pojo from sample-lite.json
			Student thestudent=mapper.readValue(new File("data/sample-full.json"), Student.class);
			//print fist name and lastname
			System.out.println("First Name:"+thestudent.getFirstName());
			System.out.println("Last Name:"+thestudent.getLastName());
			
			//Print address details
			System.out.println("Address :" +thestudent.getAddress().getCity());
			System.out.println("Address :" +thestudent.getAddress().getCountry());
			System.out.println("Address :" +thestudent.getAddress().getState());
			System.out.println("Address :" +thestudent.getAddress().getStreet());
			System.out.println("Address :" +thestudent.getAddress().getZip());
			
			//Print languages
			
			for(String lang:thestudent.getLanguages()){
				System.out.println(lang);
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
