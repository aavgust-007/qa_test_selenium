package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderHasBeenPlaced extends BasePage{

    private By statusOrder  = By.className("Order_NextButton__1_rCA"); // Класс экрана Заказ оформлен


    public OrderHasBeenPlaced(WebDriver driver) {
        super(driver);
    }
    public boolean isOrderHasBeenPlaced(){
        return driver.findElement(statusOrder).isDisplayed();
    }
}
