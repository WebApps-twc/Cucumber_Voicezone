package Voicezone_StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;


public class Voicetotext extends Commonfiles {
	@Given("^Voicetotext Get\"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and (\\d+)$")
	public void Voicetotext_Get_and_and_and_and(String Username, String Password, String Exe, String br, int tlim) throws Throwable {
		String schk="Fail";
	    if(Exe.equals("Yes")){
	    if(first==0) 
	    {
	         login(Username,Password,br,tlim);	
	    }
	    else
	    {
	   	 focusClick(driver,driver.findElement(By.id("settings-summary")),br);
	    }
		driver=getDriver();
		 System.out.println("Voicetotext Inprogress");
		 int chk=0;
		    do{
		        Thread.sleep(1000);       
		        chk++;
		        System.out.println(chk);
		              }
		    while(driver.findElement(By.xpath("//*[@id='progress']")).isDisplayed());
		 Thread.sleep(20000);
		 driver.findElement(By.xpath(".//*[@id='ContentRefresh']/div/div[3]/div[2]/div/a")).click();
		 Thread.sleep(5000);
		 index=i;
		 schk=flowrunVM(driver,br); 
		 Thread.sleep(5000);
		 if(schk.equals("Pass"))
		 schk=flowrunVM(driver,br);
		 PrintResult("Voicetotext");
         first=1;
         i=10;
	     }
	}
	
    public String flowrunVM(WebDriver driver,String br) throws Exception {
    	 Boolean status = driver.findElement(By.id("VoicemailToText")).isSelected();
         System.out.println("Iam running");
         System.out.println("Initial state: "+status);
         Boolean status1=false;
         String schk="Fail";
         if (status.equals(false)) { 
         status1=true;
         System.out.println("after state: "+status1);
         System.out.println("yessssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
         driver.findElement(By.id("VoicemailToText")).click();
         System.out.println("after state status: "+status);
         System.out.println("Before state status1: "+status1);
         driver.findElement(By.id("mainSubmitButton")).click();
         Thread.sleep(5000);
         schk=orderprocess(driver,br);
       System.out.println(schk);
         if(schk.equals("Pass"))
		    {
		    i=statusTracker(i,"Pass","Verify if voicetext Status changed from"+status1+"to"+status,"Status was saved successfully","Status should be saved successfully","");
		    }
		    else
		    {
		    i=statusTracker(i,"Fail","Verify if voicetext Status changed from"+status1+"to"+status,"Status was not saved successfully","Status should be saved successfully","");  
		    }
         }
         
         if (status.equals(true)) {
             status1=false;
          System.out.println("after state: "+status1);
          System.out.println("yessssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
          driver.findElement(By.id("VoicemailToText")).click();
          driver.findElement(By.id("mainSubmitButton")).click();
          Thread.sleep(5000);
          schk=orderprocess(driver,br);
          System.out.println(schk);
          if(schk.equals("Pass"))
		    {
		    i=statusTracker(i,"Pass","Verify if voicetext Status changed from"+status1+"to"+status,"Status was saved successfully","Status should be saved successfully","End");
		    }
		    else
		    {
		    i=statusTracker(i,"Fail","Verify if voicetext Status changed from"+status1+"to"+status,"Status was not saved successfully","Status should be saved successfully","End");  
		    }
          System.out.println("after state status: "+status);
          System.out.println("Before state status1: "+status1);
         }
		return schk;
   }

}
