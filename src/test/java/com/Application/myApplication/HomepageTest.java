package com.Application.myApplication;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;



public class HomepageTest extends BasePage {
	HomepageObject hp;
	BasePage bp;
	int random=new Random().nextInt(50000);
	String email=("sghjkk"+random + "@gmail.com");
	

	public HomepageTest() {
		hp = new HomepageObject();
		bp = new BasePage();
	}
	
	@Test
	public void verifyPanels() {
	ArrayList<String>expectedValues=new ArrayList<String>();
	expectedValues.addAll(Arrays.asList("Women","Dresses","T-shirts"));
	Assert.assertTrue(expectedValues.containsAll(expectedValues));

}
    
    @Test
    public void verifySubscription() {
    	hp.setNewsLetter(email);
    	String msg=hp.getTxtNewsLetterMessage();
    	Assert.assertTrue(msg.contains("successfully"), "Failed:Subscription message is not displayed");
    	Assert.assertTrue(msg.contains("SuccessFully"),"Failed");
    }

}
