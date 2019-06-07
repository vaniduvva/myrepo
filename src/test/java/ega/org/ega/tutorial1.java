package ega.org.ega;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Reporter;
import org.testng.annotations.Test;


//@Listeners(ega.org.ega.ListnersTest.class)
public class tutorial1 {
	public static WebDriver driver;
/*
  @DataProvider
  
  public Iterator<Object[]> getTestData() throws IOException
  {
	 ArrayList<Object[]> testdata = getDataFromExcel.excel();
	 return testdata.iterator();
	  
  }
  
  
  */
  
  @Test
  public void ebay()
  {
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Vani\\chromedriver.exe");
		Reporter.log("Launching the browser");
		driver = new ChromeDriver();
		driver.get("https://www.magicbricks.com/bricks/User-Registration1");
		Reporter.log("Launching the website");
		String browsertitle = driver.getTitle();
		Reporter.log("getting the title of the page");
		System.out.println(browsertitle);
		driver.manage().window().maximize();
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String url = js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		elertgenerate();
		
		driver.close();
		
		
		 	  
  }
  
   public void elertgenerate()
   {
	   JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("alert('hi this js')");
	   
   }
  
 
  
  
  
}
