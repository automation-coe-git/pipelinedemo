package com.pipelinedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	WebDriver driver=null;
  @Test
  public void Login() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("http://localhost:8082/JenkinsWar/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[text()='Login']")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[@name='uname']")).clear();
	  driver.findElement(By.xpath("//input[@name='uname']")).sendKeys("test");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//input[@name='psw']")).clear();;
	  driver.findElement(By.xpath("//input[@name='psw']")).sendKeys("pass");
	  Thread.sleep(5000);
	  driver.quit();
	  System.out.println("hello");
	  
	  
  }
}
