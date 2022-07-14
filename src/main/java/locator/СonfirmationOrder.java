package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class СonfirmationOrder extends BasePage{
    private By yesButton = By.xpath("/html/body/div/div/div[2]/div[5]/div[2]/button[2]"); // кнопка подтверждения заказа

    public СonfirmationOrder(WebDriver driver) {
        super(driver);
    }
    public OrderHasBeenPlaced enterYesButton () {
        driver.findElement(yesButton).click();
        return new OrderHasBeenPlaced(driver);
    }
}
