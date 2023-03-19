package ru.twistofthemyth.windriverprototype.pages;

import ru.twistofthemyth.windriverprototype.appium.FindStrategy;
import ru.twistofthemyth.windriverprototype.appium.WrappedWindowsElement;

public class StandardCalculatorPage {

    public WrappedWindowsElement result() {
        return new WrappedWindowsElement(FindStrategy.ACCESSIBILITY_ID, "CalculatorResults");
    }

    public WrappedWindowsElement numButton(int num) {
        return new WrappedWindowsElement(FindStrategy.ACCESSIBILITY_ID, "num" + num + "Button");
    }

    public WrappedWindowsElement plusButton() {
        return new WrappedWindowsElement(FindStrategy.ACCESSIBILITY_ID, "plusButton");
    }

    public WrappedWindowsElement minusButton() {
        return new WrappedWindowsElement(FindStrategy.ACCESSIBILITY_ID, "minusButton");
    }

    public WrappedWindowsElement multipleButton() {
        return new WrappedWindowsElement(FindStrategy.ACCESSIBILITY_ID, "multipleButton");
    }

    public WrappedWindowsElement divideButton() {
        return new WrappedWindowsElement(FindStrategy.ACCESSIBILITY_ID, "divideButton");
    }

    public WrappedWindowsElement clearButton() {
        return new WrappedWindowsElement(FindStrategy.ACCESSIBILITY_ID, "clearButton");
    }

    public WrappedWindowsElement equalButton() {
        return new WrappedWindowsElement(FindStrategy.ACCESSIBILITY_ID, "equalButton");
    }
}
