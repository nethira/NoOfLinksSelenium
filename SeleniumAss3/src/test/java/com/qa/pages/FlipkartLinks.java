package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLinks {
WebDriver driver;
@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/button[1]")
WebElement closebutton;
public WebElement ClickCloseButton() {
	return closebutton;
}

@FindAll(@FindBy(tagName="a"))
List<WebElement> displaylinks;
public List<WebElement> DisplayLink(){
	return displaylinks;
}
public FlipkartLinks(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
		
}
