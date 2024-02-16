package lichiacademy.app;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class LichiTest extends BaseTest {

    private final static String Base_URL = "https://prerelease.academy.spb.lichishop.com/";


    @Test
    public void CheckLanguageArabic() {
        LoginPage loginPage = new LoginPage(Base_URL);
        loginPage.clickLangButton();

        loginPage.firstLanguage.click();
        Selenide.refresh();
        loginPage.body.shouldHave(text("Arabic"));
        loginPage.body.shouldNotHave(text("English"));
    }

    @Test
    public void CheckLanguageEnglish() {
        LoginPage loginPage = new LoginPage(Base_URL);
        loginPage.clickLangButton();

        loginPage.secondLanguage.click();
        Selenide.refresh();
        loginPage.body.shouldHave(text("English"));
        loginPage.body.shouldNotHave(text("Arabic"));
    }

    @Test
    public void CheckLanguagePolish() {
        LoginPage loginPage = new LoginPage(Base_URL);
        loginPage.clickLangButton();

        loginPage.thirdLanguage.click();
        Selenide.refresh();
        loginPage.body.shouldHave(text("Polish"));
        loginPage.body.shouldNotHave(text("English"));
    }

    @Test
    public void CheckLanguageRussian() {
        LoginPage loginPage = new LoginPage(Base_URL);
        loginPage.clickLangButton();

        loginPage.fourthLanguage.click();
        Selenide.refresh();
        loginPage.body.shouldHave(text("Русский"));
        loginPage.body.shouldNotHave(text("English"));
    }








}