package com.cdac.acts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;




public class AppTest 
{
	
@Test
  public  void test() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	 
	//  
	//  driver.get("http://www.google.co.in/");
	//  driver.findElement(By.name("q")).sendKeys("cdac centre in pune");
	// 
	//  driver.findElement(By.name("q")).submit();
	//  Thread.sleep(5000);
	//  driver.close();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.findElement(By.id("fname")).sendKeys("kartik");
		driver.findElement(By.id("idOfButton")).click();
//		driver.findElement(By.id("dblClkBtn")).click();
//		driver.findElement(By.id("dblClkBtn")).click();will not work a double click
		
		WebElement element=driver.findElement(By.id("dblClkBtn"));
		Actions actions=new Actions(driver);
		actions.doubleClick(element).perform();
		 Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.id("male")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("female")).click();
		
		driver.findElement(By.xpath("//*[@id=\"commonWebElements\"]/form[2]/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"commonWebElements\"]/form[2]/input[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"commonWebElements\"]/form[2]/input[2]")).click();
		
		//dropdwons
		
//		 WebDriverWait wait = new WebDriverWait(driver, 10);
//	     WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdownId")));
		
		WebElement dropdownElement=driver.findElement(By.id("testingDropdown"));
		Select dropdown=new Select(dropdownElement);
		
		dropdown.selectByVisibleText("Automation Testing");
		Thread.sleep(3000);
		dropdown.selectByValue("Performance");
		Thread.sleep(3000);
		dropdown.selectByIndex(2);
		Thread.sleep(3000);
		dropdown.selectByIndex(3);
		
		driver.findElement(By.xpath("//*[@id=\"AlertBox\"]/button")).click();
		Thread.sleep(3000);
		alert.accept();
		
		driver.findElement(By.xpath("//*[@id=\"ConfirmBox\"]/button")).click();
		Thread.sleep(3000);
		alert.accept();
		
		driver.findElement(By.xpath("//*[@id=\"ConfirmBox\"]/button")).click();
		Thread.sleep(3000);
		alert.dismiss();
		
		//drag and drop
		
		 WebElement sourceElement = driver.findElement(By.xpath("//*[@id=\"myImage\"]"));
		 WebElement targetElement = driver.findElement(By.xpath("//*[@id=\"targetDiv\"]"));
		 
		 actions.dragAndDrop(sourceElement, targetElement).build().perform();
		 Thread.sleep(3000);
		 driver.quit();
		
  }
  }
