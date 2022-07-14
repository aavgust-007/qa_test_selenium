package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderHasBeenPlaced extends BasePage{

    private By statusOrder  = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ']"); // Заголовок Заказ оформлен

    public OrderHasBeenPlaced(WebDriver driver) {
        super(driver);
    }
    public boolean isOrderHasBeenPlaced(){
        return driver.findElement(statusOrder).isDisplayed();
    }
}
