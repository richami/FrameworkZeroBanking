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
import pages.WelcomePage;

public class Testcase_Login {
	WebDriver driver;
	LoginPage lp;
	WelcomePage wp;
	AccountSummaryPage ap;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");
		driver=new ChromeDriver();
		lp=new LoginPage(driver);
		wp=new WelcomePage(driver);
		AccountSummaryPage ap=new AccountSummaryPage(driver);
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
	public void login()
	{
		wp.clickSingnInBtn();
		lp.doLogin("username", "password");
		System.out.println("Welcome to GIT");
		System.out.println("something change");
		System.out.println("hema see this");
		String expectedTitle=driver.getTitle();
		String actualTitle="Zero - Account Summary";
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}
