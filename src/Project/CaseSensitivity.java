package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseSensitivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseurlString="http://demo.guru99.com/test/newtours/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(baseurlString);
		driver.manage().window().maximize();
		String thelinktextString=driver.findElement(By.partialLinkText("egis")).getText();
		System.out.println("The Link Text");
		String thelinkString=driver.findElement(By.partialLinkText("EGIS")).getText();
		System.out.println("The Link Text");
		driver.quit();
		

	}

}
