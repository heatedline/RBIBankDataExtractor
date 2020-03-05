package com.finlabs.seleniumBanklist.banklist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BanksInIndia extends seleniumbase{
	private static final String RBI_BANKS_IN_INDIA_URL = "https://www.rbi.org.in/commonman/English/Scripts/BanksInIndia.aspx";

	public static void main(String[] args) {

	BanksInIndia banksInIndia = new BanksInIndia();
	banksInIndia.setupChromeDriver(false);

	try {
	banksInIndia.operation();
	} catch(Exception e) {
	e.printStackTrace();
	}

	}

	private void operation() throws Exception {
	driver.get(RBI_BANKS_IN_INDIA_URL);
	
	//String innerText = driver.findElement(By.xpath("//*[@id=\"MLRBIForm\"]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[27]/td/table[1]/tbody/tr[1]/th")).getText(); 	
	String innerText = driver.findElement(By.xpath("//*[@id=\"MLRBIForm\"]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[27]/td/table[1]/tbody/tr[1]/th")).getText();
	System.out.println(innerText);
	WebElement tableRow1 = driver.findElement(By.xpath("//*[@id=\"MLRBIForm\"]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[27]/td/table[1]/tbody/tr[3]"));
	WebElement tableRow2 = driver.findElement(By.xpath("//*[@id=\"MLRBIForm\"]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[27]/td/table[1]/tbody/tr[4]"));
    String rowtext1 = tableRow1.getText();
    String rowtext2 = tableRow2.getText();
	 System.out.println(rowtext1);
	 System.out.println(rowtext2);
	Thread.sleep(5000);

	shutdown();
	}


}
