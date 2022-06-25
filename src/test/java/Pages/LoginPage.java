package Pages;

import Utilities.DriverUtil;
import Utilities.PropertiesReadingUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(css = "input[name='uid']")
    WebElement UserID;
    @FindBy(name = "password") WebElement Password;
    @FindBy(xpath = "//input[@name='btnLogin']") WebElement loginBtn;
    @FindBy(xpath = "//h2[text()='Guru99 Bank']") WebElement titleText;

    public void loginGuru_99(){
        UserID.sendKeys(PropertiesReadingUtil.getProperties("userName"));
        Password.sendKeys(PropertiesReadingUtil.getProperties("Password"));
        loginBtn.click();

    }
    public  boolean LoginTextDisplayed(){
      return titleText.isDisplayed();

    }


}
