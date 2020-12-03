import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideTest {
        
    String searchString = "Selenide";
    String contitionText = "selenide.org";
    String searchEngine = "https://google.com";

    @Test
        public void searchStringTest() {

        // Открываем поисковую систему
        open(searchEngine);

        // Выполняем поисковой запрос
        SelenideElement inputField = $("form input[type=text]");
        inputField.click();
        inputField.setValue(searchString);
        inputField.pressEnter();

        // Убеждаемся, что на странице присутствует ссылка на selenide
        $("main").shouldHave(Condition.text(contitionText));
    }

}