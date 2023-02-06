package seleniumalone;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
public class differentjobs {
	public static void main(String[] args) throws InterruptedException {
	      System.setProperty("webdriver.chrome.driver",  "C:\\Chromedriver\\chromedriver.exe");
	 	  WebDriver driver1 = new ChromeDriver(); /*WebDriver driver3 = new ChromeDriver();
	 	  WebDriver driver4 = new ChromeDriver(); */
	      String url1 = "http://ilcecmm018:8070/job/J-BOOT/";
	      String url2 = "http://ilcecmm053:8080/job/MS360_ENV_INFO_REPORT/";
	      String url3 = "http://inoscmm462:7070/jenkins/job/Env_sanity_report/build?delay=0sec";
	      String url4 = "http://inoscmm462:7070/jenkins/job/ONI_Pod_Status/";
 //1.JBOOT report that shows BSS components + OCP MS status- http://ilcecmm018:8070/job/J-BOOT/
	      driver1.get(url1);
	      driver1.manage().window().maximize();   
	      driver1.findElement(By.xpath("//div[@class='login']")).click();
	      driver1.findElement(By.xpath("//input[@name='j_username']")).sendKeys("sajithan");
	      driver1.findElement(By.xpath("//input[@name='j_password']")).sendKeys("Hackale@123");
	      driver1.findElement(By.xpath("//span[@name='Submit']")).click();
	      driver1.findElement(By.xpath("//a[@href='/job/J-BOOT/build?delay=0sec']")).click();
	      Thread.sleep(1000);
	      Select selection = new Select(driver1.findElement(By.name("value")));
	      Thread.sleep(1000);
	      selection.selectByValue("VAPP_244");
	      List<WebElement> elements = driver1.findElements(By.name("name"));
	      WebElement j = driver1.findElement(By.xpath("//table/tbody[2]/tr[1]/td[3]/div/select"));
	      WebElement k = driver1.findElement(By.xpath("//table/tbody[3]/tr[1]/td[3]/div/select"));
	      System.out.println(driver1.findElement(By.xpath("//table/tbody[2]/tr[1]/td[2]")).getText());
	      System.out.println(driver1.findElement(By.xpath("//table/tbody[3]/tr[1]/td[2]")).getText());
	      j.sendKeys("Ping");
	    //  k.sendKeys("FULL");
	      driver1.findElement(By.xpath("//button[@id='yui-gen1-button']")).click();
	     // System.out.println("Radio button text:" + j.getAttribute("value"));
//2.MS info job – to get MS status of a VAPP- http://ilcecmm053:8080/job/MS360_ENV_INFO_REPORT/ ( Report - Comcast-Mid-Market Status of OCP ENV)
	      WebDriver driver2 = new ChromeDriver();
	      driver2.get(url2);  
	      driver2.manage().window().maximize();
	      driver2.findElement(By.xpath("//a[@href='/login?from=%2Fjob%2FMS360_ENV_INFO_REPORT%2F']")).click();
	      driver2.findElement(By.xpath("//input[@name='j_username']")).sendKeys("sajithan");
	      driver2.findElement(By.xpath("//input[@name='j_password']")).sendKeys("Hackale@123");
	      driver2.findElement(By.xpath("//input[@name='Submit']")).click();
	      driver2.findElement(By.xpath("//a[@href='/job/MS360_ENV_INFO_REPORT/build?delay=0sec']")).click();
	      Thread.sleep(1000);
	      Select selection2 = new Select(driver2.findElement(By.name("value")));
	      selection2.selectByValue("cmm-il03-env244-runtime");
	      driver2.findElement(By.xpath("//button[@id='yui-gen1-button']")).click();
	      Thread.sleep(1000);
	   //   driver2.quit();
	      
//3OSO PODs Jenkins job - http://inoscmm462:7070/jenkins/job/Env_sanity_report/build?delay=0sec ( Report - inoscmm578 Sanity Report)
	      WebDriver driver3 = new ChromeDriver();
	      driver3.get(url3);  
	      driver3.manage().window().maximize();
	      driver3.findElement(By.xpath("//a[@href='/jenkins/login?from=%2Fjenkins%2Fjob%2FEnv_sanity_report%2Fbuild']")).click();
	      driver3.findElement(By.xpath("//input[@name='j_username']")).sendKeys("sajithan");
	      driver3.findElement(By.xpath("//input[@name='j_password']")).sendKeys("Hackale@123");
	      driver3.findElement(By.xpath("//input[@name='Submit']")).click();
	      driver3.findElement(By.xpath("//a[@href='/jenkins/job/Env_sanity_report/build?delay=0sec']")).click();
	      Thread.sleep(1000);
	      driver3.findElement(By.xpath("//input[@class='setting-input   ']")).sendKeys("inoscmm600");
	      driver3.findElement(By.xpath("//table/tbody[2]/tr[1]/td[3]/div/input[2]")).sendKeys("sajitha.nair@amdocs.com");
	      driver3.findElement(By.xpath("//button[@id='yui-gen1-button']")).click();
	      Thread.sleep(1000);
	      
	    //  driver3.quit();
	      
//4. ONI PODS Jenkins job - http://inoscmm462:7070/jenkins/job/ONI_Pod_Status/(Report – (Report - Oni Pod Status)	      
	      WebDriver driver4 = new ChromeDriver();
	      driver4.get(url4);  
	      driver4.manage().window().maximize();
	      driver4.findElement(By.xpath("//a[@href='/jenkins/login?from=%2Fjenkins%2Fjob%2FONI_Pod_Status%2F']")).click();
	      driver4.findElement(By.xpath("//input[@name='j_username']")).sendKeys("sajithan");
	      driver4.findElement(By.xpath("//input[@name='j_password']")).sendKeys("Hackale@123");
	      driver4.findElement(By.xpath("//input[@name='Submit']")).click();
	      driver4.findElement(By.xpath("//a[@href='/jenkins/job/ONI_Pod_Status/build?delay=0sec']")).click();
	      Thread.sleep(1000);
	      driver4.findElement(By.xpath("//input[@class='setting-input   ']")).sendKeys("inoscmm600");
	      Thread.sleep(1000);
	      driver4.findElement(By.xpath("//table/tbody[2]/tr[1]/td[3]/div/input[2]")).sendKeys("sajitha.nair@amdocs.com");
	      driver4.findElement(By.xpath("//button[@id='yui-gen1-button']")).click();
	    //  driver4.close();     
	      
	    System.out.println("I love you kunju dont worry everything going to be alright");
	  
	      
	}

}
