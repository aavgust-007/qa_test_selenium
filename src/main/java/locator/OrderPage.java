package locator;

import locator.order.OrderForm;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderPage extends BasePage  {
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    private By OrderButton_1 = By.xpath(".//button[@class='Button_Button__ra12g']"); // кнопка Заказать наверху страницы
    private By OrderButton_2 = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"); // кнопка Заказать внизу страницы

    public OrderPage(WebDriver driver) {
        super(driver);
    }

    public OrderPage open(){
        driver.get(URL);
        return this;
    }


    public OrderForm OrderButton_1() {
        driver.findElement(OrderButton_1).click();
        return new OrderForm(driver);
    }

    public OrderPage skrolButton() {
        WebElement element = driver.findElement(OrderButton_2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",element);
        return this;
    }
    public OrderForm OrderButton_2() {
        driver.findElement(OrderButton_2).click();
        return new OrderForm(driver);
    }
}
