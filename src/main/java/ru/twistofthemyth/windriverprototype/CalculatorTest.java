package ru.twistofthemyth.windriverprototype;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.twistofthemyth.windriverprototype.pages.StandardCalculatorPage;

public class CalculatorTest extends AbstractTest {
    @Test
    public void standardCalculatorTest() {
        StandardCalculatorPage standardCalculator = new StandardCalculatorPage();

        standardCalculator.numButton(2).findElement().click();
        standardCalculator.plusButton().findElement().click();
        standardCalculator.numButton(2).findElement().click();
        standardCalculator.equalButton().findElement().click();
        Assert.assertEquals(standardCalculator.result().findElement().getText(), "Display is 4");
    }
}
