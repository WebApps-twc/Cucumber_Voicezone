package Voicezone_StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class PinSkip  {
    
	public static WebDriver driver;
	
	@Given("^C$")
	public void C() throws Throwable {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\s.d.saravanan\\Downloads\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	    driver.get("http://voicezone.timewarnercable.com");
		 Thread.sleep(5000); 
	     driver.findElement(By.id("cc-username")).sendKeys("pacoctest123");
		  System.out.println("qtest1");
		  driver.findElement(By.id("cc-user-password")).sendKeys("Cable123");
		  Thread.sleep(15000);
		  driver.findElement(By.id("login-form-button")).click();
		 Thread.sleep(10000);
		int chk=0;
	    do{
	         Thread.sleep(1000);       
	        chk++;
	        System.out.println(chk);
	              }
	   while(driver.findElement(By.xpath("//*[@id='progress']")).isDisplayed());
	}
	
	@Given("^pinskip$")
	public void pinskip()throws Throwable {
		Thread.sleep(20000);
		driver.findElement(By.xpath("(//a[contains(text(),'(edit)')])[2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Voicemail PIN Settings")).click();
		Thread.sleep(5000);
		 flowrunPK();
         driver.close();
	}
   
	public void flowrunPK() throws InterruptedException {
      Thread.sleep(5000);
      Boolean status = driver.findElement(By.id("PinSkipStatus")).isSelected();
   	  System.out.println("Initial state: "+status);
   	  Boolean status1=false;
   	
   	  if(status==(true))
   	  {
   		  driver.findElement(By.id("PinSkipStatus")).click();
   		 Thread.sleep(5000);
   		  driver.findElement(By.id("mainSubmitButton")).click();
   		  Thread.sleep(10000);
   		  status1 = driver.findElement(By.id("PinSkipStatus")).isSelected();
   		  System.out.println("Final state: "+status1);
   		
  
   		  driver.findElement(By.id("PinSkipStatus")).click();
   		   Thread.sleep(5000);
		  driver.findElement(By.cssSelector("#dialog > div.modal-footer > #ok_PinSkip")).click();
		  Thread.sleep(10000);
   		  driver.findElement(By.id("mainSubmitButton")).click();
   		  Thread.sleep(10000);
   		  status1 = driver.findElement(By.id("PinSkipStatus")).isSelected();
   		  System.out.println("Final state: "+status1);
   	  }  
   	 else
   	  {
   			 driver.findElement(By.id("PinSkipStatus")).click();
   			  Thread.sleep(5000);
		      driver.findElement(By.cssSelector("#dialog > div.modal-footer > #ok_PinSkip")).click();
		      Thread.sleep(10000);
   			  driver.findElement(By.id("mainSubmitButton")).click();
   			  Thread.sleep(10000);
   			  status1=true;
   			  System.out.println("Final state: "+status1);
   			  
   			
   			  driver.findElement(By.id("PinSkipStatus")).click();
   			 Thread.sleep(5000);
   			  driver.findElement(By.id("mainSubmitButton")).click();
   			  Thread.sleep(10000);  
      		 status1 = driver.findElement(By.id("PinSkipStatus")).isSelected();
   			 System.out.println("Final state: "+status1);	  
   	  } 

    }
	
}



