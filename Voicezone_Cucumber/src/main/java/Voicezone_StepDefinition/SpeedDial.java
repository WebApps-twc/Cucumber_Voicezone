package Voicezone_StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SpeedDial {
	public static WebDriver driver;
	@Given("^SpeedDial login$")
	public void SpeedDial_login() throws Throwable {
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
	@Given("^Navigate to Speed dial page$")
	public void Navigate_to_Speed_dial_page() throws Throwable {
	  Thread.sleep(20000);
	  driver.findElement(By.xpath("(//a[contains(text(),'(edit)')])[8]")).click();
	}

	@When("^SpeedDial flowrunadd Progress$")
	public void SpeedDial_flowrunadd_Progress() throws InterruptedException {
		 System.out.println("printing");
	       String tns[]= new String[10];
	       String ac;
	       String midtn;
	       String lastfour;
	       String tn;
	       System.out.println("print");
	for(int i=2;i<=9;i++)  
	     {
	         System.out.println("print1");                
	           ac=randomNO(999,200);
	           midtn=randomNO(999,200);
	           lastfour= randomNO(9999,1000);
	           tn=ac+midtn+lastfour;
	           driver.findElement(By.id("txtPhoneNumber"+i)).clear();
	           driver.findElement(By.id("txtPhoneNumber"+i)).sendKeys(tn);
	           tns[i]=tn;
	           }   
	 System.out.println("print");
	 Thread.sleep(3000);
	driver.findElement(By.id("mainSubmitButton")).click();
	Thread.sleep(1000);    
	}
	@When("^SpeedDial_deleteall progress$")
	public void deleteall_progress() throws InterruptedException {
          int chk=0;
             
               for (int i=2;i<=9;i++)
               {
                      if(!(driver.findElement(By.id("txtPhoneNumber"+i)).getAttribute("value").equals("")))
                       {
                              System.out.println("Not blank "+i);
                           chk=1;
                        }
               }
               System.out.println("pass");
               if (chk==1)
               {   System.out.println("pass1");
               Thread.sleep(30000);
               System.out.println("line 58");
                   for(int i=2;i<=9;i++)
                    {  Thread.sleep(2000); 
                    driver.findElement(By.id("DeleteNumber_"+i)).click();
                         
                         System.out.println("Deleted: "+i);
                       }
                   driver.findElement(By.id("mainSubmitButton")).click();
                     Thread.sleep(1000);
                    
               } 
	}
	@When("^SpeedDial_TNValidation progress$")
	public void TNValidation_progress() throws InterruptedException 
	{
		  System.out.println("TN Validation method started");
          String add=randomNO(999,100);
          TNcheck("10"+add);  
          System.out.println("TNCheck1");
         
          Thread.sleep(2000);
          add=randomNO(999,100);
          TNcheck("1010"+add);
          System.out.println("TNCheck2");
          
          Thread.sleep(2000);
          add=randomNO(99,10);
          TNcheck("*"+add);
          System.out.println("TNCheck3");
          
          Thread.sleep(2000);
          add=randomNO(99,10);
          TNcheck("11"+add);
          System.out.println("TNCheck4");
          //add=randomNO(99,10);
          //schk=TNcheck(add+"#","XX#");
          
          Thread.sleep(2000);
          add=randomNO(9,1);
          TNcheck(add+"11");
          System.out.println("TNCheck5");
         
          Thread.sleep(2000);
          add=randomNO(9999999,1000000);
          TNcheck(add);
          System.out.println("TNCheck6");
          
          Thread.sleep(2000);
          add=randomNO(9999999,1000000);
          TNcheck("1"+add);
          System.out.println("TNCheck7");
          
          Thread.sleep(2000);
          //add=randomNO(9999999999,1000000);
          String ac = randomNO(999,200);
          String midtn = randomNO(999,200);
          String lastfour = randomNO(9999,1000);
          add=ac+midtn+lastfour;
          TNcheck("1"+add);
          System.out.println("TNCheck8");
          
          Thread.sleep(2000);
          TNcheck("0");
          System.out.println("TNCheck9");
          
          Thread.sleep(2000);
          String firstfive =randomNO(99999,20000);
          ac = randomNO(999,200);
          midtn = randomNO(999,200);
          lastfour = randomNO(9999,1000);
          add=firstfive+ac+midtn+lastfour;
          TNcheck("01"+add);
          System.out.println("TNCheck10");
          
          Thread.sleep(2000);
          firstfive =randomNO(99999,20000);
          ac = randomNO(999,200);
          midtn = randomNO(999,200);
          lastfour = randomNO(9999,1000);
          add=firstfive+ac+midtn+lastfour;
          TNcheck("011"+add);
          System.out.println("TNCheck11");
          
          Thread.sleep(2000);
          driver.findElement(By.id("txtPhoneNumber"+2)).clear();
          TNcheck("1"+add);
          System.out.println("TNCheck12");
          
          
          Thread.sleep(2000);
          System.out.println("TN Validation method ended");   
	}
	public void TNcheck(String tn) throws InterruptedException {
        String txt;
                          
    driver.findElement(By.id("txtPhoneNumber"+2)).clear();
    Thread.sleep(2000);
    driver.findElement(By.id("txtPhoneNumber"+2)).sendKeys(tn);
   
    txt=driver.findElement(By.id("txtPhoneNumber"+2)).getAttribute("value");
   
    System.out.println("tn"+tn+" "+"txt"+txt);
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
    
}
