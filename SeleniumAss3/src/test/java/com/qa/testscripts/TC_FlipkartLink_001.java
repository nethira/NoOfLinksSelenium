package com.qa.testscripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_FlipkartLink_001 extends TestBase{
	@Test
	public void search() {
		flipOR.ClickCloseButton().click();
		List<WebElement> links=flipOR.DisplayLink();
		String count=Integer.toString(links.size());
		System.out.println("No.of.links="+count);
		for(WebElement link:links){
			 System.out.println(link.getText() + " - " + link.getAttribute("href"));
			 }
	}
	
}
