package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    @FindBy(xpath = "//td[.='Manger Id : mngr414566']") WebElement MangerId;
    @FindBy(linkText = "New Customer") WebElement newCustomer;


    public String getUserid(){

        return MangerId.getText();
    }

    public void clickOnNew_Customer_Page(){
        newCustomer.click();
    }




}
