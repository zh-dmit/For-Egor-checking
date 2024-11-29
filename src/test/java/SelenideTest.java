import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class SelenideTest {

    @Test
    public void openPage() {
        // создай драйвер для браузера Chrome
        // перейди на страницу тестового стенда
        open("https://qa-mesto.praktikum-services.ru/");
        // выполни авторизацию
        $(byId("email")).setValue("dmitriev_41@gmail.com");
        $(byId("password")).setValue("12345");
        $(byClassName("auth-form__button")).click();
        // получи текст второй карточки и сохрани его в переменную cardText
        String cardText = $$(byClassName("card")).get(1).find(byClassName("card__title")).getText();

    }
}
