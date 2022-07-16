import locator.QuestionsAboutImportant;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.my.second.BaseUITest;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class TestQuestions   extends BaseUITest {

        private final String extended;
        private final String question;
        private final int num;

    public TestQuestions(String extended, String question, int num) {
        this.extended = extended;
        this.question = question;
        this.num = num;
    }

    @Parameterized.Parameters // добавили аннотацию
        public static Object[][] getSumData() {
            return new Object[][] {
                    { "Сутки — 400 рублей. Оплата курьеру — наличными или картой.","Сколько это стоит? И как оплатить?",0},
                    { "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один " +
                            "за другим.","Хочу сразу несколько самокатов! Так можно?",1},
                    {"Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
                            "Как рассчитывается время аренды?",2},
                    {"Только начиная с завтрашнего дня. Но скоро станем расторопнее.","Можно ли заказать самокат прямо на сегодня?",3},
                    { "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
                            "Можно ли продлить заказ или вернуть самокат раньше?",4},
                    {"Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне." +
                            " Зарядка не понадобится.","Вы привозите зарядку вместе с самокатом??",5},
                    {"Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.","Можно ли отменить заказ?",6},
                    {"Да, обязательно. Всем самокатов! И Москве, и Московской области.","Я жизу за МКАДом, привезёте??",7},
            };
        }

    @Test
    public void QuestionsAboutImportant1() {

        String info = new QuestionsAboutImportant(driver).
                open().
                skrolQuestion().
                waitForLoadHomePage().
                checkAnswer(num);
        assertEquals("Некорректный текст выпадающего списка в вопросе "+ question, extended, info);
    }
}

