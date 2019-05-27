	package com.Application.myApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomepageObject extends BasePage {

	@FindBy(xpath = "//*[text()='Women']")
	private WebElement women;

	@FindBy(xpath = "//div/ul/li[1]//*[text()='Dresses']")
	private WebElement dresses;

	@FindBy(xpath = "//div/ul/li[1]//*[text()='T-shirts']")
	private WebElement tshirts;
	
	@FindBy(id="newsletter-input")
	private WebElement txtBoxNews ;
	
	@FindBy(name="submitNewsletter")
	private WebElement btnsubmitNewsletter ;
	
	@FindBy(name="//*[@class='alert alert-success']")
	private WebElement txtSubscription ;
		

	public HomepageObject() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomenFromPanel() {
		return women;
	}

	public WebElement getDressesFromPanel() {
		return dresses;
	}

	public WebElement getTshirtFromPanel() {
		return tshirts;

	}
	
	public void setNewsLetter(String email) {
		setText(txtBoxNews,email);
		btnsubmitNewsletter.click();
		
	}
	
	
	public String getTxtNewsLetterMessage() {
		return txtSubscription.getText();
		
	}
	
	
	
	
	}

