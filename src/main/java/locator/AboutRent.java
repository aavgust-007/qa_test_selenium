package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
public class AboutRent extends BasePage{

    private By dateInput = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private By rentalInput = By.xpath(".//div[@class='Dropdown-control']"); // срок аренды
    private By rentalValueInput = By.xpath("//div[starts-with(text(),'сутки')]"); // значение аренды
    private By colorScoterInput = By.xpath(".//label[@for='black']"); // цвет самоката
    private By commentInput = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private By orderButtom = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"); // кнопка заказать

    public AboutRent(WebDriver driver) {
        super(driver);
    }

    public AboutRent enterDate(String date){
        driver.findElement(dateInput).sendKeys(date + Keys.ENTER);
        return this;
    }

    public AboutRent enterRental(){
        driver.findElement(rentalInput).click();
        driver.findElement(rentalValueInput).click();
        return this;
    }

    public AboutRent enterColorScoter(){
        driver.findElement(colorScoterInput).click();
        return this;
    }

    public AboutRent enterComment(String comment){
        driver.findElement(commentInput).sendKeys(comment);
        return this;
    }

    public СonfirmationOrder enterOrder(){
        driver.findElement(orderButtom).click();
        return new СonfirmationOrder(driver);
    }

}
