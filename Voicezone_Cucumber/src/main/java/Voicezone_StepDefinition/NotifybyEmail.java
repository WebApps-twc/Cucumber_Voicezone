package Voicezone_StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class NotifybyEmail  {
 
	public static WebDriver driver;
	@Given("^B$")
	public void B() throws InterruptedException {
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
	
	@Given("^Notify by Email$")
	public void Notify_by_Email()throws Throwable {
		 Thread.sleep(20000);
		 System.out.println("Notify by Email Inprogress");
		 driver.findElement(By.xpath(".//*[@id='ContentRefresh']/div/div[3]/div[2]/div/a")).click();
		 Thread.sleep(5000);
		 DeleteNBE();
		 Thread.sleep(5000);
		 addNBE();
		 Thread.sleep(5000);
		 Emailvalidation();
		 driver.close();
	}
	public void DeleteNBE() throws InterruptedException {
		 System.out.println("gain inside Deleteall"); 
		 int count= driver.findElements(By.xpath("/html/body/div[3]/form/div/div[3]/div[2]/div/div/div/div/div/div[3]/div/div[2]/table/tbody/tr/td[5]/label")).size();
		 System.out.println("count"+count);
		 Thread.sleep(5000);
		 for(int i=1;i<=count;i++)
		  {
			  driver.findElement(By.cssSelector("button.close-delete.poping")).click();
			  Thread.sleep(5000);
		  }
		  driver.findElement(By.id("mainSubmitButton")).click();
	      System.out.println("Delete operation Complete");
		
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
	  
	public void addNBE() throws InterruptedException {
		 System.out.println("addremove Inprogress");
			  int rand=5;
			  for(int i=1;i<=rand;i++)
			  { 
				    Thread.sleep(2000);
				  	String num=randomNO(9999,1000);
				  	driver.findElement(By.id("txtEmailAddress")).sendKeys("test"+num+"@test.tst");
					Thread.sleep(5000);
				  	driver.findElement(By.id("btnAddtolist")).click();
			  	    String email="test"+num+"@test.tst";
			  		System.out.println(email);
			  }
			 
			  Thread.sleep(2000);
			  driver.findElement(By.id("mainSubmitButton")).click();
			  
			  Thread.sleep(20000);
			  
			  int count=2; 
			  for(int i=1;i<=count;i++)
			  {
				  Thread.sleep(2000);
				  driver.findElement(By.cssSelector("button.close-delete.poping")).click();
				  Thread.sleep(5000);
				  int count1= driver.findElements(By.xpath("/html/body/div[3]/form/div/div[3]/div[2]/div/div/div/div/div/div[3]/div/div[2]/table/tbody/tr/td[5]/label")).size();
				  System.out.println(count1);
			  }
			  driver.findElement(By.id("mainSubmitButton")).click();
			  Thread.sleep(5000);
			  System.out.println("Add Remove operation complete");
	    
	}
	public void Emailvalidation() throws InterruptedException {
		  String email=null;
		  int count= driver.findElements(By.xpath("/html/body/div[3]/form/div/div[3]/div[2]/div/div/div/div/div/div[3]/div/div[2]/table/tbody/tr/td[5]/label")).size();
			 if(count==0)
				{
				  driver.findElement(By.id("txtEmailAddress")).clear();	  
				  driver.findElement(By.id("txtEmailAddress")).sendKeys("aa@gmail.com");
				  driver.findElement(By.id("btnAddtolist")).click();
				} 
		  Thread.sleep(2000);
		  TNcheck("");
		  Thread.sleep(2000);
		  TNcheck("ss.com");
		  Thread.sleep(5000);
		  String self=driver.findElement(By.xpath(".//*[@id='EmailGridRefresh']/div[2]/table/tbody/tr[1]/td[1]")).getText(); 
		  System.out.println(self);
		  TNcheck(self);
		  Thread.sleep(2000);
		  DeleteNBE();
		  
		  Thread.sleep(5000);
		  
		  int rand=5;
		  for(int i=1;i<=rand;i++)
		  {     
			    Thread.sleep(5000);
			  	String num=randomNO(9999,1000);
			  	driver.findElement(By.id("txtEmailAddress")).clear();
			  	driver.findElement(By.id("txtEmailAddress")).sendKeys("test"+num+"@test.tst");
			  	Thread.sleep(3000);
			  	driver.findElement(By.id("btnAddtolist")).click();
		  		email="test"+num+"@test.tst";
		  		System.out.println(email);
		  }
		  Thread.sleep(5000);
		  driver.findElement(By.id("mainSubmitButton")).click();
		  Thread.sleep(5000);
		  TNcheck("eodi@odi.com");
		  Thread.sleep(3000);
	      driver.findElement(By.xpath("/html/body/div[3]/form/div/div[3]/div[2]/div/div/div/div/div/div[5]/div/button[1]")).click();
	      DeleteNBE();
	      System.out.println("Email validation operation complete");
	     
		
	}
	public void TNcheck(String email) throws InterruptedException { 
		  System.out.println("Before entering email");
		  driver.findElement(By.id("txtEmailAddress")).clear();	  
		  Thread.sleep(3000);
		  driver.findElement(By.id("txtEmailAddress")).sendKeys(email);
		  Thread.sleep(3000);
			driver.findElement(By.id("btnAddtolist")).click();
	      System.out.println("after submitting");
	      Thread.sleep(5000);
	      String Errormessage=driver.findElement(By.cssSelector("span.help-inline.error")).getText();
	      int Error=driver.findElements(By.cssSelector("span.help-inline.error")).size();
	      if(Error!=0)
	      {
	 	  System.out.println(Errormessage);
	 	  }
	 	  else
	 	  {
	      System.out.println("Error  message is not displayed"); 
	 	  }
	}
}


