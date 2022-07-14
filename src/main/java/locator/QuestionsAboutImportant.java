package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuestionsAboutImportant extends BasePage{
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    private By question = By.xpath("//div[@class='accordion']"); // Вопросы в важном

    public QuestionsAboutImportant(WebDriver driver) {
        super(driver);
    }
    public QuestionsAboutImportant waitForLoadHomePage(){
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(question));
        return this;
    }
    public QuestionsAboutImportant skrolQuestion() {
        WebElement element = driver.findElement(question);
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",element);
       return this;
    }
    public QuestionsAboutImportant clickQuestion(By value_question) {
        WebElement menu= driver.findElement(question);
        Actions mouse = new Actions(driver);
        mouse.moveToElement(menu).build().perform();
        WebElement    item= driver.findElement(value_question);
        mouse.moveToElement(item).click().build().perform();
        return this;
    }

    public String enterAnswer(By value_answer) {
       return driver.findElement(value_answer).getText();
    }


    public String checkAnswer (int num) {
        String question_xpath = "accordion__heading-" + num;
        String answer_xpath = ".//div[@id='accordion__panel-" + num + "']";
        By question = By.id(question_xpath);
        clickQuestion(question);
        By answer = By.xpath(answer_xpath);
        String result_answer  = enterAnswer(answer);
        return result_answer;
         
    }


    public QuestionsAboutImportant open(){
        driver.get(URL);
        return this;
    }
}
