package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String titleString=driver.getTitle();
		if(titleString.equals("Google")) {
			System.out.println("pass:The title is Google");
		}
		else {
			System.out.println("fail:Title is not google:actual title is "+titleString);
		}
		String urlString=driver.getCurrentUrl();
		if(urlString.contains("google.com")) {
			System.out.println("pass url has done google.com");					
		}
		else {
			System.out.println("fail url dont have google.com "+urlString);
		}
		Thread.sleep(1000);
		driver.close();

	}

}
