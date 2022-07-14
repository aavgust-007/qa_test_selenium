package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderDetailsFormPage extends BasePage {

    private By nameInput = By.xpath(".//input[@placeholder='* Имя']");
    private By surnameInput = By.xpath(".//input[@placeholder='* Фамилия']");
    private By addressInput = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private By metroInput = By.xpath(".//input[@placeholder='* Станция метро']");
    private By metroValueInput = By.xpath(".//li[@data-index='1']"); // значение поля метро
    private By numberInput = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By nextButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']"); // кнопка поиска заказа


    public OrderDetailsFormPage(WebDriver driver) {
        super(driver);
    }
    public OrderDetailsFormPage enterName(String name){
        driver.findElement(nameInput).sendKeys(name);
        return this;
    }
    public OrderDetailsFormPage enterSurname(String surname){
        driver.findElement(surnameInput).sendKeys(surname);
        return this;
    }

    public OrderDetailsFormPage enterAddress(String address){
        driver.findElement(addressInput).sendKeys(address);
        return this;
    }
    public OrderDetailsFormPage enterMetro(){
        driver.findElement(metroInput).click();
        driver.findElement(metroValueInput).click();
        return this;
    }
    public OrderDetailsFormPage enterNumber(String number){
        driver.findElement(numberInput).sendKeys(number);
        return this;
    }

    public AboutRent enterNextButton(){
        driver.findElement(nextButton).click();
        return new AboutRent(driver);
    }
}
