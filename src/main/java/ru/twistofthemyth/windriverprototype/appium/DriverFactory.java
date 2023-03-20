package ru.twistofthemyth.windriverprototype.appium;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.options.WindowsOptions;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import ru.twistofthemyth.windriverprototype.config.Config;

import java.net.URL;

public class DriverFactory {
    @SneakyThrows
    public WebDriver windowsDriver() {
        WindowsOptions options = new WindowsOptions().setApp(Config.APPIUM().appName());
        return new WindowsDriver(new URL(Config.APPIUM().url()), options);
    }
}
