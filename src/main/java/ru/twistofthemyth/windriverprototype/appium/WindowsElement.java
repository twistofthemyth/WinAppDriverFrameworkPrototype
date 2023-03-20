package ru.twistofthemyth.windriverprototype.appium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.windows.WindowsDriver;
import lombok.AllArgsConstructor;
import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import ru.twistofthemyth.windriverprototype.context.DriverDepended;

import java.time.Duration;
import java.util.List;

import static java.time.temporal.ChronoUnit.MILLIS;
import static java.time.temporal.ChronoUnit.SECONDS;


@AllArgsConstructor
public class WindowsElement implements ElementLocator, DriverDepended {

    private final FindStrategy strategy;
    private final String locator;

    @Override
    public WebElement findElement() {
        WindowsDriver driver = getWindowsDriver();
        Awaitility.await()
                .atMost(Duration.of(30, SECONDS))
                .pollInterval(Duration.of(100, MILLIS))
                .ignoreException(WebDriverException.class)
                .until(() -> findElement(driver) != null);

        return findElement(driver);
    }

    @Override
    public List<WebElement> findElements() {
        WindowsDriver driver = getWindowsDriver();
        Awaitility.await()
                .atMost(Duration.of(30, SECONDS))
                .pollInterval(Duration.of(100, MILLIS))
                .ignoreException(WebDriverException.class)
                .until(() -> findElements(driver) != null);

        return findElements(driver);
    }

    private WebElement findElement(WindowsDriver driver) {
        switch (strategy) {
            case NAME -> {
                return driver.findElement(By.name(locator));
            }
            case ACCESSIBILITY_ID -> {
                return driver.findElement(AppiumBy.accessibilityId(locator));
            }
            default -> throw new IllegalStateException();
        }
    }

    private List<WebElement> findElements(WindowsDriver driver) {
        switch (strategy) {
            case NAME -> {
                return driver.findElements(By.name(locator));
            }
            case ACCESSIBILITY_ID -> {
                return driver.findElements(AppiumBy.accessibilityId(locator));
            }
            default -> throw new IllegalStateException();
        }
    }
}
