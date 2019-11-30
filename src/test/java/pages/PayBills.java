package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBills {
	WebDriver driver;
	public PayBills(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Pay Bills']")
	public WebElement payBills;
	@FindBy(xpath="//a[text()='Add New Payee']")
	public WebElement addNewPayee;
	@FindBy(id="np_new_payee_name")
	public WebElement pname;
	@FindBy(id="np_new_payee_address")
	public WebElement paddress;
	@FindBy(id="np_new_payee_account")
	public WebElement paccount;
	@FindBy(id="np_new_payee_details")
	public WebElement pdetail;
	@FindBy(id="add_new_payee")
	public WebElement addBtn;
	
	public void clickPayBills()
	{
		payBills.click();
	}
	public void clickAddNewPayee()
	{
		addNewPayee.click();
	}
	public void inputPayeeDetails()
	{
		pname.sendKeys("Richa");
		paddress.sendKeys("7 Virtues Avenue");
		paccount.sendKeys("123456");
		pdetail.sendKeys("for savings");
	}
	public void cliclAddbtn()
	{
		addBtn.click();
	}
	

}
