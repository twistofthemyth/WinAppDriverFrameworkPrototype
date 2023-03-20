package ru.twistofthemyth.windriverprototype.context;

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.WebDriver;

public interface DriverDepended {

    default WebDriver getDriver() {
        return ThreadContainer.get(WebDriver.class).orElseThrow();
    }

    @SuppressWarnings("unchecked")
    default WindowsDriver getWindowsDriver() {
        if (getDriver() instanceof WindowsDriver) {
            return (WindowsDriver) getDriver();
        } else {
            throw new IllegalStateException();
        }
    }

    default void setDriver(WebDriver driver) {
        ThreadContainer.put(WebDriver.class, driver);
    }
}
