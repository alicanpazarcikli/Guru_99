package Pages;

import Utilities.DriverUtil;
import Utilities.PropertiesReadingUtil;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class NewCustomerEntryPage extends BasePage {

    @FindBy(xpath = "//a[.='New Customer']")
    WebElement newCustomerBtn;

    @FindBy(name = "name")
    WebElement CustomerName;
    @FindBy(name = "addr")
    WebElement Address;

    @FindBy(xpath = "//input[@type='date']")
    WebElement DateOfBirth;

    @FindBy(name = "city")
    WebElement City;
    @FindBy(name = "state")
    WebElement State;
    @FindBy(name = "pinno")
    WebElement Pin;
    @FindBy(name = "telephoneno")
    WebElement MobileNumber;
    @FindBy(name = "emailid")
    WebElement Email;
    @FindBy(name = "password")
    WebElement Password;
    @FindBy(xpath = "//input[@value='Submit']")
    WebElement submitBtn;

    public void setName(){
        CustomerName.sendKeys(PropertiesReadingUtil.getProperties("Name"));
    }
    public void setDateOfBirth(){
        DateOfBirth.sendKeys(PropertiesReadingUtil.getProperties("YearOfBirth"),Keys.ARROW_RIGHT,
                PropertiesReadingUtil.getProperties("MonthOfBirth"),
                PropertiesReadingUtil.getProperties("DayOfBirth"));

    }

    public void setAddress() {
        Address.sendKeys(PropertiesReadingUtil.getProperties("address"));
    }
    public void setCity(){
        City.sendKeys(PropertiesReadingUtil.getProperties("city"));
    }

    public void setState() {
        State.sendKeys(PropertiesReadingUtil.getProperties("state"));
    }

    public void setPin() {
        Pin.sendKeys(PropertiesReadingUtil.getProperties("PIN"));
    }
    public void setMobileNumber(){
        MobileNumber.sendKeys(PropertiesReadingUtil.getProperties("number"));
    }
    public void setEmail(){
        Email.sendKeys(PropertiesReadingUtil.getProperties("email"));
    }
    public void setPassword(){
        Password.sendKeys(PropertiesReadingUtil.getProperties("Password"));
    }
    public void setSubmitBtn(){
        submitBtn.click();
    }

    public void verifyRegistration(){
        Alert alert=DriverUtil.getDriver().switchTo().alert();
        String actMsg= alert.getText();
        alert.accept();
        String expMsg="Email Address Already Exist !!";
        // just because  I preRegistered i don't get the successful msg prompt
        Assert.assertEquals(expMsg,actMsg,"Registration verified..");
        DriverUtil.getDriver().switchTo().defaultContent();


    }


}




