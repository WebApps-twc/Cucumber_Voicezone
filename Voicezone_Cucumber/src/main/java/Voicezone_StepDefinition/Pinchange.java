package Voicezone_StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class Pinchange  {
    
	public static WebDriver driver;
	
	@Given("^D$")
	public void D() throws Throwable {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\s.d.saravanan\\Downloads\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	 	driver.manage().window().maximize();
	    driver.get("http://voicezone.timewarnercable.com");
		 Thread.sleep(5000); 
	     driver.findElement(By.id("cc-username")).sendKeys("pacoctest123");
		  System.out.println("qtest1");
		  driver.findElement(By.id("cc-user-password")).sendKeys("Cable123");
		  Thread.sleep(20000);
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
	
	@Given("^pinchange$")
	public void pinchange()throws Throwable {
		Thread.sleep(20000);
		driver.findElement(By.xpath("(//a[contains(text(),'(edit)')])[2]")).click();
		Thread.sleep(10000);
		driver.findElement(By.linkText("Voicemail PIN Settings")).click();
		Thread.sleep(5000);
		 flowrunPC(); 
		 Thread.sleep(5000);
		 Pinvalidation();
         driver.close();
	}
    public void flowrunPC() throws InterruptedException {
    	System.out.println("flowrun Inprogress");
    	 String pin1 = randomNO(9999,1000);
    	 System.out.println("flowrun");
    	 driver.findElement(By.id("PasswordForNewPin")).clear();
    	 driver.findElement(By.id("PasswordForNewPin")).sendKeys(pin1);
    	 driver.findElement(By.id("PasswordForConfirmPin")).clear();
    	 driver.findElement(By.id("PasswordForConfirmPin")).sendKeys(pin1);
    	 Thread.sleep(5000);
    	 driver.findElement(By.id("mainSubmitButton")).click();
    	 System.out.println(" flowrun Complete");
    }

    public String randomNO(int max, int min)
	  {
	  	  	int Max=max;
	  	  	int Min=min;
	  	  	double random1=Min + (int)(Math.random() * ((Max - Min) + 1));
	  		System.out.println(random1);
	  		int random2=(int)random1;
	  		System.out.println(random2);
	  		String s1 = new Integer(random2).toString();
	  		return(s1);
	  		
	  }

    public void Pinvalidation() throws Exception {
    	System.out.println("Pinvalidation Inprogress");
  	  
  	  String pin,pin2;
  	  
  	  Pincheck("","1234");
  	  
  	  Pincheck("1234","");
  	  
  	  String seftn=driver.findElement(By.xpath("//html/body/div[3]/form/div/div[2]/div/button/span")).getAttribute("data-friendlyname-contact");
  	  seftn=seftn.substring(6);
  	  Pincheck(seftn,seftn);
  	  
  	  Pincheck("1234","1234");
  	  
  	  
  	  pin=randomNO(9,1);
  	  pin=pin+pin+pin+pin;
  	  System.out.println("m not hapenning"+pin);
  	  Pincheck(pin,pin);

  	  
  	  pin=randomNO(999,100);
  	  Pincheck(pin,pin);
  	  System.out.println("4 digits");
  	 
  	  
  	  pin=randomNO(9999,1000);
  	  pin2=randomNO(9999,1000);
  	  Pincheck(pin,pin2);

   }
    public void Pincheck(String pin,String cpin) throws Exception
    {
  	  Thread.sleep(5000);
  	  System.out.println("Iam cumng too");
  	  System.out.println("Befor entering pins");
  	  driver.findElement(By.id("PasswordForNewPin")).clear();
  	  driver.findElement(By.id("PasswordForNewPin")).sendKeys(pin);
  	  driver.findElement(By.id("PasswordForConfirmPin")).clear();
  	  driver.findElement(By.id("PasswordForConfirmPin")).sendKeys(cpin);
 	  Thread.sleep(2000);
  	  driver.findElement(By.id("mainSubmitButton")).click();
        System.out.println("after submitting");
        Thread.sleep(3000);
      
        
        
        if((driver.findElement(By.cssSelector("span.help-block.error")).isDisplayed()))
       {
  	     System.out.println("Pass Error Message is displayed");
       } 
       
        else
        {
   	     System.out.println("Fail Error Message is not displayed");
        }
      	  
       
 
    }
	
	
}



