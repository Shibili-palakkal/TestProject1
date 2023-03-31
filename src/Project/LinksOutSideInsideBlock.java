package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksOutSideInsideBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseurlString="http://demo.guru99.com/test/block.html";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(baseurlString);
		driver.findElement(By.partialLinkText("Inside")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Outside")).click();
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
