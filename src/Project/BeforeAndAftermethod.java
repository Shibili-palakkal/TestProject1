package Project;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAftermethod {
  @BeforeTest
  public void f() {
	  System.out.println("inside beforetests");
  }
  @BeforeMethod
  public void f2() {
	  System.out.println("inside before method");
  }
  @Test(groups="user")
  public void f3() {
	  System.out.println("inside test1");
  }
  @Test(groups= {"user","employee"})
  public void f4() {
	  System.out.println("inside test2");
  }
  @AfterMethod
  public void f5() {
	  System.out.println("inside after method");
  }
  @AfterTest
  public void f6() {
	  System.out.println("inside after tests");
  }
}
