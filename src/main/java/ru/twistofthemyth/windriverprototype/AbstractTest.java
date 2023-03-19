package ru.twistofthemyth.windriverprototype;

import lombok.extern.java.Log;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.twistofthemyth.windriverprototype.appium.DriverFactory;
import ru.twistofthemyth.windriverprototype.context.DriverDepended;


@Log
public abstract class AbstractTest implements DriverDepended {

    @BeforeMethod(alwaysRun = true)
    public void init() {
        log.info("init test");
        setDriver(new DriverFactory().windowsDriver());
    }

    @AfterMethod(alwaysRun = true)
    private void teardown() {
        log.info("tear down test");
        getWindowsDriver().closeApp();
        getWindowsDriver().close();
    }
}
