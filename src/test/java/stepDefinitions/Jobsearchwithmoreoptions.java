package stepDefinitions;
import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.*;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.log.Log;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import Pageobjects.Jobsearchwithmoreoptionspage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Jobsearchwithmoreoptions  {
	
	
	 ChromeDriver driver;
	 Jobsearchwithmoreoptionspage searchobj;
	 Actions a;
	 
	 private static final Logger log = LogManager.getLogger(Jobsearchwithmoreoptions.class.getName());
	 
	
	 @Given("user launch the chrome browser")
	 public void user_launch_the_chrome_browser() {
	        log.info("user launch the chrome browser");
	     	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	   	    driver=new ChromeDriver(); 
	   	    a=new Actions(driver);
	   	    searchobj= PageFactory.initElements(driver, Jobsearchwithmoreoptionspage.class);
	   	 }

	 

	@Given("user open url as {string}")
	 public void user_open_url_as(String url) {
		  log.info("user open url");
      	  searchobj.openurl(url);
				}
	 
	 @Given("user switch to more search options")
	 public void user_switch_to_more_search_options() throws InterruptedException {
          	log.info("user switched to  more search options");
            searchobj.searchjobs();
            searchobj.moresearchoption(a);
		  }
	 
	 	
	 @When("user enter details {string} {string}  {string}  {string}  {string} {string}  {string}  {string} {string} {string}")
	 public void user_enter_details(String jobtitle, String location1, String distance1, String salarymin, String salarymax, String salarytype, String posted, String jobtype, String industry1, String sortby) throws InterruptedException {
		 
		 log.info("user enter details page");
		 
		 searchobj.keywords(a, jobtitle);
		 searchobj.delay();
		
		 searchobj.location(a,location1);
		 searchobj.delay();
		 
		 searchobj.distance(distance1);
		 searchobj.delay();
	     		 
		 searchobj.salarymin(salarymin);
	     searchobj.delay();
	    
		 searchobj.salarymax(salarymax);     
		 searchobj.delay();
		 
		 searchobj.salarytype(salarytype);
		 searchobj.delay();
		 
		 searchobj.posted(posted);
	     searchobj.delay();
	     
	     searchobj.jobtype(jobtype);
	     searchobj.delay();
		
		 searchobj.industry(industry1);
       	 searchobj.delay();
    		
       	searchobj.sortby(sortby);
     	searchobj.delay();
     	
     	searchobj.findjob().click();
     	searchobj.delay();
	 }

	 @Then("user can view the job details")
	 public void user_can_view_the_job_details() throws IOException, InterruptedException {
        	 
     log.info("user can view the job details");
     
     
     searchobj.viewresults();
	  }

}	 
	 
	 
	 
	 
	 
