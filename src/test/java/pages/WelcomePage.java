package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//find element and perform operation on that
public class WelcomePage {
	WebDriver driver;
	public WelcomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="signin_button")
	public WebElement signInBtn;
	
	public void clickSingnInBtn()
	{
		signInBtn.click();
	}
}
