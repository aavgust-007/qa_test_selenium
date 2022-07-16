import locator.*;
import org.junit.Test;
import org.my.second.BaseUITest;
import static org.junit.Assert.*;

public class TestScooter extends BaseUITest {



    @Test
   public void Order_button_1() {

       boolean order = new OrderPage(driver).
               open().
               OrderButton_1().
               enterOrderForm("Анна","Партрутская","Черкизова","89081152555").
               enterNextButton().
               enterDate("14.07.2022").
               enterRental().
               enterColorScoter().
               enterComment("dfsdfs").
               enterOrder().
               enterYesButton().
               isOrderHasBeenPlaced();

       assertTrue("Order not found image is not displayed",order);
    }

    @Test
    public void Order_button_2() {
        boolean order = new OrderPage(driver).
                open().
                skrolButton().
                OrderButton_2().
                enterOrderForm("Иван","Партрутский","Черкизова","89081172555").
                enterNextButton().
                enterDate("14.07.2022").
                enterRental().
                enterColorScoter().
                enterComment("dfsdfs").
                enterOrder().
                enterYesButton().
                isOrderHasBeenPlaced();

        assertTrue("Order not found image is not displayed",order);
    }
}
