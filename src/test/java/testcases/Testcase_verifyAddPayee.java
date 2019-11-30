package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AccountSummaryPage;
import pages.LoginPage;
import pages.PayBills;
import pages.WelcomePage;

public class Testcase_verifyAddPayee {
	WebDriver driver;
	LoginPage lp;
	WelcomePage wp;
	AccountSummaryPage ap;
	PayBills pb;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		driver=new ChromeDriver();
		lp=new LoginPage(driver);
		wp=new WelcomePage(driver);
		AccountSummaryPage ap=new AccountSummaryPage(driver);
		pb=new PayBills(driver);
		driver.get("http://zero.webappsecurity.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@Test
	public void doAddPayee()
	{
		wp.clickSingnInBtn();
		lp.doLogin("username", "password");
		pb.clickPayBills();
		pb.clickAddNewPayee();
		pb.inputPayeeDetails();
		pb.cliclAddbtn();
		
	}

}
