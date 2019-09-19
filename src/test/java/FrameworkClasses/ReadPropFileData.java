package FrameworkClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFileData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 File file = new File("./Resources/Config.properties");
		  
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			Properties prop = new Properties();
			
			//load properties file
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Name of Trainig---->"+prop.getProperty("Training"));
			System.out.println("Batch no is--->"+prop.getProperty("Batch"));
	}

}
