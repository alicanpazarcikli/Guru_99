package Base;

import Utilities.DriverUtil;
import Utilities.StaticWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static java.util.concurrent.TimeUnit.SECONDS;

public abstract class TestBase {

    @BeforeMethod
    public void setUp(){
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(10,SECONDS);

    }
    @AfterMethod
    public void closing(){
        StaticWait.wait(2);
       // DriverUtil.closeDriver();
    }
}
