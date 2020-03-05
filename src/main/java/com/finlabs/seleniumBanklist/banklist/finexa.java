package com.finlabs.seleniumBanklist.banklist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class finexa extends seleniumbase{
	
	private static final String FINEXA_URL = "http://testenvfive.finlabsindia.com/";

	public static void main(String[] args) {

	finexa finexas = new finexa();
	finexas.setupChromeDriver(false);

	try {
		finexas.operation();
	} catch(Exception e) {
	e.printStackTrace();
	}

	}

	private void operation() throws Exception {
	driver.get(FINEXA_URL);
	//login 
	waitForElementToAppear(By.id("loginUsernameId"));
     driver.findElement(By.id("loginUsernameId")).click();
     driver.findElement(By.id("loginUsernameId")).clear();
     driver.findElement(By.id("loginUsernameId")).sendKeys("rosesudipa29@gmail.com");
     driver.findElement(By.id("loginPasswordId")).clear();
     driver.findElement(By.id("loginPasswordId")).sendKeys("FinexaPass");
     driver.findElement(By.id("loginForm")).click();
     driver.findElement(By.id("idSigninSubmit")).click();
     Thread.sleep(6000);
     driver.findElement(By.xpath("//*[@id=\"menu\"]/li[8]/a")).click();
     //Double click the button to launch an alertbox
     Actions action = new Actions(driver);
     WebElement link =driver.findElement(By.xpath("//*[@id=\"22663\"]/td[1]"));
     action.doubleClick(link).perform();
     Thread.sleep(8000);
     driver.findElement(By.xpath("//*[@id=\"menu\"]/li[1]/a/span")).click();
     driver.findElement(By.xpath("//*[@id=\"menu\"]/li[1]/div/ul/li[1]/a")).click();
     Thread.sleep(6000);
     driver.findElement(By.id("idDobCalendar")).click();
     
     String innerText = driver.findElement(By.id("idDobCalendar")).getText();
     System.out.println(innerText);
     //logout
     waitForElementToAppear(By.id("hum"));
     driver.findElement(By.id("hum")).click();
     driver.findElement(By.className("logout")).click();
	
	Thread.sleep(5000);

	//shutdown();
	}

}
