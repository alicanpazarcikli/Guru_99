package Tests;

import Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.NewCustomerEntryPage;
import Utilities.DriverUtil;
import Utilities.PropertiesReadingUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Guru_99__Tests extends TestBase {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    NewCustomerEntryPage newCustomerEntryPage = new NewCustomerEntryPage();

    @Test(priority = 1)
    public void verify_Header_Text() {
        DriverUtil.getDriver().get(PropertiesReadingUtil.getProperties("url"));
        loginPage.LoginTextDisplayed();
    }

    @Test(priority = 2)
    public void Login() {
        loginPage.loginGuru_99();
    }

    @Test(priority = 3)
    public void verifyMangerId() {

        String actMangerId = homePage.getUserid();
        String expMangerId = "Manger Id : mngr414566";
        Assert.assertEquals(expMangerId, actMangerId, "User Id mismatched.");
        homePage.clickOnNew_Customer_Page();

        }

    @Test(priority = 4)
    public void verifyNew_Customer_Page() {
        DriverUtil.getDriver().navigate().to("https://demo.guru99.com/V4/manager/addcustomerpage.php");
      String ExpURL = "https://demo.guru99.com/V4/manager/addcustomerpage.php";
      String ActURL = DriverUtil.getDriver().getCurrentUrl();
      Assert.assertEquals(ExpURL, ActURL, "Page did not navigate correctly.");
    }


    @Test(priority = 5)
    public void createNewCustomer(){
        DriverUtil.getDriver().navigate().to("https://demo.guru99.com/V4/manager/addcustomerpage.php");
        newCustomerEntryPage.setName();
        newCustomerEntryPage.setDateOfBirth();
        newCustomerEntryPage.setAddress();
        newCustomerEntryPage.setCity();
        newCustomerEntryPage.setState();
        newCustomerEntryPage.setPin();
        newCustomerEntryPage.setMobileNumber();
        newCustomerEntryPage.setEmail();
        newCustomerEntryPage.setPassword();
        newCustomerEntryPage.setSubmitBtn();

        newCustomerEntryPage.verifyRegistration();



    }













}