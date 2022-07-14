package locator.order;

import locator.OrderDetailsFormPage;
import org.openqa.selenium.WebDriver;

public class OrderForm extends OrderDetailsFormPage {


    public OrderForm(WebDriver driver) {
        super(driver);

    }

    public OrderDetailsFormPage enterOrderForm(String name, String surname, String address, String number ){
        OrderDetailsFormPage info = new OrderDetailsFormPage(driver);

        info. enterName(name).
                enterSurname(surname).
                enterAddress(address).
                enterNumber(number).
                enterMetro();
        return new OrderDetailsFormPage(driver);
    }

}
