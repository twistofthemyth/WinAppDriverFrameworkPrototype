package ru.twistofthemyth.windriverprototype.pages;

import ru.twistofthemyth.windriverprototype.appium.FindStrategy;
import ru.twistofthemyth.windriverprototype.appium.WindowsElement;

public class StandardCalculatorPage {

    public WindowsElement result() {
        return new WindowsElement(FindStrategy.ACCESSIBILITY_ID, "CalculatorResults");
    }

    public WindowsElement numButton(int num) {
        return new WindowsElement(FindStrategy.ACCESSIBILITY_ID, "num" + num + "Button");
    }

    public WindowsElement plusButton() {
        return new WindowsElement(FindStrategy.ACCESSIBILITY_ID, "plusButton");
    }

    public WindowsElement minusButton() {
        return new WindowsElement(FindStrategy.ACCESSIBILITY_ID, "minusButton");
    }

    public WindowsElement multipleButton() {
        return new WindowsElement(FindStrategy.ACCESSIBILITY_ID, "multipleButton");
    }

    public WindowsElement divideButton() {
        return new WindowsElement(FindStrategy.ACCESSIBILITY_ID, "divideButton");
    }

    public WindowsElement clearButton() {
        return new WindowsElement(FindStrategy.ACCESSIBILITY_ID, "clearButton");
    }

    public WindowsElement equalButton() {
        return new WindowsElement(FindStrategy.ACCESSIBILITY_ID, "equalButton");
    }
}
