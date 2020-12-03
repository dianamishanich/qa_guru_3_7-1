import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

public class YandexTest {

   @Test
   
   public void selenideSearchYandex() {
   open("https://yandex.ru");
   $(byName("text")).setValue("Selenide").pressEnter();
   $("html").shouldHave(text("selenide.org"));
   } 
}
 
