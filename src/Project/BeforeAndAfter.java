package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfter {
  private ChromeDriver driver;

@BeforeTest
  public void f1() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://festo-admin.yes45.in/");
	  driver.manage().window().maximize();
  }
@BeforeMethod
public void f2() {
	System.out.println("logintest");
}
@Test(priority = 1)
public void f3() {
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.findElement(By.name("password")).sendKeys("12345678");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div[3]/button")).click();
}
@Test(priority = 2)
public void f4() {
	driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[3]/a/span")).click();
	driver.findElement(By.xpath("//*[@id=\"branch\"]/ul/li[1]/a")).click();
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div[1]/div[2]/a/i")).click();
	driver.findElement(By.name("code")).sendKeys("B1");
	driver.findElement(By.name("name")).sendKeys("kakkad");
	driver.findElement(By.name("cluster_id")).click();
	driver.findElement(By.name("place")).sendKeys("kakkad");
	driver.findElement(By.name("address")).sendKeys("abcd");
	driver.findElement(By.name("contact")).sendKeys("254763");
	driver.findElement(By.name("description")).sendKeys("uddhde");
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div[2]/button")).click();
}
@AfterMethod
public void f5() {
	System.out.println("execution completed");
}
@AfterTest
public void f6() {
	driver.close();
}
}
