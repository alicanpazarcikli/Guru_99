package Pages;

import Utilities.DriverUtil;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    // make the class abstract before doing anything
    // we will initialize our elements from PageFactory so we ll need a constructor
    public BasePage(){
        PageFactory.initElements(DriverUtil.getDriver(),this);


    }
}
