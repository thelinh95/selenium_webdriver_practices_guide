package com.packt.webdriver.chapter4;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class AddExtensionToProfile {
	public static void main(String... args){
		FirefoxProfile profile = new FirefoxProfile();
		try {
			profile.addExtension(new File("C:\\firebug-1.12.0-fx.xpi"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FirefoxDriver driver = new FirefoxDriver(profile);
		
		
	}

}
