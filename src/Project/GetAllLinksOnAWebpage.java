package Project;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinksOnAWebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://demoqa.com/links");
    String url="";
    List<WebElement> linksList = driver.findElements(By.tagName("a"));
    System.out.println("Total links on the Wb Page: " + linksList.size());

    //We will iterate through the list and will check the elements in the list.
    Iterator<WebElement> iterator = linksList.iterator();
    while (iterator.hasNext()) {
  	  url = iterator.next().getText();
  	  System.out.println(url);
    }
    
   //Close the browser session
    driver.quit();
    	
	}

}
