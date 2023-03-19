package ru.twistofthemyth.windriverprototype.appium;

import io.appium.java_client.windows.WindowsDriver;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.twistofthemyth.windriverprototype.config.Config;

import java.net.URL;

public class DriverFactory {
    @SneakyThrows
    public WebDriver windowsDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", Config.APPIUM().appName());
        return new WindowsDriver(new URL(Config.APPIUM().url()), capabilities);
    }
}
