package IntegrationProject;



	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Action;
	import org.openqa.selenium.interactions.Actions;

	public class EmailDelete {

		public static void main(String[] args) throws InterruptedException
		{
			
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\mayur.kumshi\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.gmail.com");
			System.out.println(driver.getTitle());
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.id("identifierId")).sendKeys("mkumshi.14@gmail.com");
			driver.findElement(By.id("identifierNext")).click();
			
			Thread.sleep(5000);
			
//			WebDriverWait wait3 = new WebDriverWait(driver, 30);
//			wait3.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//input[@name='password']")));
//			
			driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("Gm@il@14$");
		    
		    driver.findElement(By.xpath((".//div[@role='button'][@id='passwordNext']"))).click();
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		    Actions actions = new Actions(driver);
		    
		    driver.findElement(By.xpath((".//input[@aria-label='Search mail']"))).clear();
		    driver.findElement(By.xpath((".//input[@aria-label='Search mail']"))).sendKeys("cars24");
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    actions.sendKeys(Keys.ENTER);
		    
		   String  array1 = null;
		   Thread.sleep(10000);
		   
		   
		   WebElement element = driver.findElement(By.xpath("//span[@class='Dj']//span[@class='ts'][2]"));
		   Actions mouseclick = actions.moveToElement(element);
		   System.out.println(" "+element.getText());
		   System.out.println("Script executed successfully");
		   
		   driver.close();
		   
		   
		   
//		   array1 =  driver.findElement(By.xpath(".//div[@id=':ig']//span[@class='Dj']//span[@class='ts']")).getText();
//		   System.out.println("Elements of the array are");
//		   for(int i = 0 ; i< array1.length();i++)
//		   { 
//			   System.out.println(" "+array1);
	//  
		}
		}



