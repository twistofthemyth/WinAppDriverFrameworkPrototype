package ru.twistofthemyth.windriverprototype;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.twistofthemyth.windriverprototype.pages.StandardCalculatorPage;

public class CalculatorTest extends AbstractTest {
    @Test
    public void standardCalculatorTest() {
        StandardCalculatorPage standardCalculator = new StandardCalculatorPage();

        standardCalculator.numButton(2).find().click();
        standardCalculator.plusButton().find().click();
        standardCalculator.numButton(2).find().click();
        standardCalculator.equalButton().find().click();
        Assert.assertEquals(standardCalculator.result().find().getText(), "Display is 4");
    }
}
