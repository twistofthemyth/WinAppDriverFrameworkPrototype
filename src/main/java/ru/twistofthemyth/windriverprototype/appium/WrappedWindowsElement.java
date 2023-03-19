package ru.twistofthemyth.windriverprototype.appium;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import lombok.AllArgsConstructor;
import org.awaitility.Awaitility;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WrapsElement;
import ru.twistofthemyth.windriverprototype.context.DriverDepended;

import java.time.Duration;

import static java.time.temporal.ChronoUnit.MILLIS;
import static java.time.temporal.ChronoUnit.SECONDS;


@AllArgsConstructor
public class WrappedWindowsElement implements WrapsElement, DriverDepended {

    private final FindStrategy strategy;
    private final String locator;

    public WindowsElement find() {
        WindowsDriver<WindowsElement> driver = getWindowsDriver();
        Awaitility.await()
                .atMost(Duration.of(30, SECONDS))
                .pollInterval(Duration.of(100, MILLIS))
                .ignoreException(WebDriverException.class)
                .until(() -> getWrappedElement(driver) != null);

        return getWrappedElement();
    }

    @Override
    public WindowsElement getWrappedElement() {
        return getWrappedElement(getWindowsDriver());
    }

    private WindowsElement getWrappedElement(WindowsDriver<WindowsElement> driver) {
        switch (strategy) {
            case NAME -> {
                return driver.findElementByName(locator);
            }
            case ACCESSIBILITY_ID -> {
                return driver.findElementByAccessibilityId(locator);
            }
            default -> throw new IllegalStateException();
        }
    }
}
