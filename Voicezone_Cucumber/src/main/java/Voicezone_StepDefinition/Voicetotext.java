package Voicezone_StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class Voicetotext  {
    
	public static WebDriver driver;
	
	@Given("^A$")
	public void A() throws Throwable {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\s.d.saravanan\\Downloads\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	    driver.get("http://voicezone.timewarnercable.com");
		 Thread.sleep(5000); 
	     driver.findElement(By.id("cc-username")).sendKeys("pacoctest123");
		  System.out.println("qtest1");
		  driver.findElement(By.id("cc-user-password")).sendKeys("Cable123");
		  Thread.sleep(5000);
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
	
	@Given("^Voice to text$")
	public void Voice_to_text()throws Throwable {
		Thread.sleep(20000);
		 driver.findElement(By.xpath(".//*[@id='ContentRefresh']/div/div[3]/div[2]/div/a")).click();
		 Thread.sleep(5000);
		 flowrunVM(); 
		 Thread.sleep(5000);
		 flowrunVM();
         driver.close();
	}
    public void flowrunVM() throws InterruptedException {
    	 Boolean status = driver.findElement(By.id("VoicemailToText")).isSelected();
         System.out.println("Initial state: "+status);
         Boolean status1=true;
    	 if (status.equals(false)) { 
    		 status1=true;
             System.out.println("After state: "+status1);
             driver.findElement(By.id("VoicemailToText")).click();
             System.out.println("Initial state status1: "+status);
             driver.findElement(By.id("mainSubmitButton")).click();
             Thread.sleep(5000);
             status = driver.findElement(By.id("VoicemailToText")).isSelected();
             System.out.println("After state status: "+status);
    	     }
             else
             {
              status1=false;
             System.out.println("After state: "+status1);
             driver.findElement(By.id("VoicemailToText")).click();
             System.out.println("Initial state status1: "+status);
             driver.findElement(By.id("mainSubmitButton")).click();
             Thread.sleep(5000);
             status = driver.findElement(By.id("VoicemailToText")).isSelected();
             System.out.println("After state status: "+status);
             }   	 
    }




	
	
}



