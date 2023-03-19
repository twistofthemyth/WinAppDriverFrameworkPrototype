package ru.twistofthemyth.windriverprototype.context;

import org.openqa.selenium.WebDriver;

public interface DriverDepended {

    default WebDriver getDriver() {
        return ContextContainer.get(WebDriver.class).orElseThrow();
    }

    default void setDriver(WebDriver driver) {
        ContextContainer.put(WebDriver.class, driver);
    }
}
