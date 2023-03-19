package ru.twistofthemyth.windriverprototype;

import lombok.extern.java.Log;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.twistofthemyth.windriverprototype.context.DriverDepended;


@Log
public abstract class AbstractTest implements DriverDepended {

    @BeforeClass(alwaysRun = true)
    public void init() {
        log.info("init test");
        setDriver(new DriverFactory().windowsDriver());
    }

    @AfterClass(alwaysRun = true)
    private void teardown() {
        log.info("tear down test");
        getDriver().close();
    }
}
