package Pageobjects;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Jobsearchwithmoreoptionspage  {
	WebDriver driver;
	
	public  Jobsearchwithmoreoptionspage(WebDriver driver) {
				
		this.driver=  driver;
	}

	//Actions a1=new Actions(driver);
	@FindBy(css="li[class='site-nav__item nav-new-search'] a[class='site-nav__link']") WebElement searchjobs;
	
	
	@FindBy(css="#more-search-options")  WebElement moreseaechoptions;
	
	
	
	@FindBy(css="#keywords") WebElement keywords;
	
	
	@FindBy(xpath="//input[@id='location']")  WebElement location;
	
	
	@FindBy(css="#distance_adv")  WebElement distance;

	
   	@FindBy(css="#sal-min")  WebElement salarymin;
   	
	
	@FindBy(css="#sal-max")  WebElement salarymax;
	
	
	@FindBy(css="#sal-type")  WebElement salarytype;
	
	
	@FindBy(css="#posted-by")  WebElement posted;
	
   
    @FindBy(css="#job-type")  WebElement jobtype;
    
    
    @FindBy(css="#industry")  WebElement industry;
    
   
    @FindBy(css="#order-by")  WebElement sortby;
    
  
  	@FindBy(css="#adv-search-btn")  WebElement findjob;
  	
	
	
	
	public void searchjobs()
	{
			 searchjobs.click();
	}
	
	public void moresearchoption(Actions a)
	{
				//return moreseaechoptions; 
		a.moveToElement(moreseaechoptions).click().build().perform(); 
	}
	
	public void keywords(Actions a,String jobtitle)
	{
		a.moveToElement(keywords).click().sendKeys(jobtitle).build().perform(); 
				//return keywords;
	}
	public void location(Actions a,String location1)
	{
				//return location;
		a.moveToElement(location).click().sendKeys(location1).build().perform(); 
		
	}
	
	public void distance(String distance1)
	{
Select dropdown=new Select(distance);
		
    	dropdown.selectByVisibleText(distance1);   	
		//return distance;
	}
	
	public void salarymin(String salarymin1)
	{
		salarymin.sendKeys(salarymin1);	    
		//return salarymin;
	}
	
	
	public void salarymax(String salarymax1)
	{
		salarymax.sendKeys(salarymax1);	    
		//return salarymin;
	}
	
	
	public void salarytype(String salarytype1)
	{
			  //  return salarytype;
		Select dpnsaltype=new Select(salarytype);
    	dpnsaltype.selectByVisibleText(salarytype1);
	}
	
	public void posted(String posted1)
	{
				//return posted;
		Select dpnposted=new Select(posted);
    	dpnposted.selectByVisibleText(posted1);
	}
	
	public void jobtype(String jobtype1)
	{
		Select dpnjobtype=new Select(jobtype);
    	dpnjobtype.selectByVisibleText(jobtype1);		
		//return jobtype;
	}
	
	
	
	public void industry(String industry1)
	{
		Select dpnindustry=new Select(industry);
    	dpnindustry.selectByVisibleText(industry1);
				//return industry;
	}
	
	
	public void sortby(String sortby1)
	{
				//return sortby;
		Select dpnsort=new Select(sortby);
    	dpnsort.selectByVisibleText(sortby1);
	}
	
		public WebElement findjob()
	{
				return findjob;
	}
	
		public void openurl(String url)
		{
			driver.get(url);
			driver.manage().window().maximize();
		}
		
		public void delay() throws InterruptedException 
		{
			Thread.sleep(800);
		}

		public void viewresults() throws InterruptedException, IOException {
			// TODO Auto-generated method stub
			delay();
		    TakesScreenshot scrShot =(TakesScreenshot)driver;
			File sf=scrShot.getScreenshotAs(OutputType.FILE);
			File df=new File("./Screenshots/img1.jpg");
			FileUtils.copyFile(sf,df); 
			
			driver.close();
		}
}
