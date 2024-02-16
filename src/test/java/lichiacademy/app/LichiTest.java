package lichiacademy.app;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;

public class LichiTest extends BaseTest {

    private final static String Base_URL = "https://prerelease.academy.spb.lichishop.com/";
    private final static String LOGIN_EMAIL = "";
    private final static String LOGIN_PASSWORD = "";

    private final static String ERROR_LOGIN_TEXT = "Неверное имя пользователя или пароль bitrix.";



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


    @Test
    public void CheckCorrectLogin() {
        LoginPage loginPage = new LoginPage(Base_URL);
        loginPage.clickLangButton();

        loginPage.firstLanguage.click();
        Selenide.refresh();
        //Works with admin login and password
        // they are removed here due to security reasons
        loginPage.loginEmail.setValue(LOGIN_EMAIL);
        loginPage.loginPassword.setValue(LOGIN_PASSWORD);
        loginPage.clickSigninButton();
    }
    @Test
    public void CheckIncorrectLogin() {
        LoginPage loginPage = new LoginPage(Base_URL);
        loginPage.clickLangButton();

        loginPage.firstLanguage.click();
        Selenide.refresh();
        loginPage.loginEmail.setValue("example@mail.com");
        loginPage.loginPassword.setValue("incorrect");
        loginPage.clickSigninButton();
        loginPage.body.shouldHave(text(ERROR_LOGIN_TEXT));
        loginPage.navigationBar.shouldNotBe(visible);
    }
    @Test
    public void CheckCorrectTabs() {
        LoginPage loginPage = new LoginPage(Base_URL);
        loginPage.clickLangButton();

        loginPage.firstLanguage.click();
        Selenide.refresh();
        //Works with admin login and password
        // they are removed here due to security reasons
        loginPage.loginEmail.setValue(LOGIN_EMAIL);
        loginPage.loginPassword.setValue(LOGIN_PASSWORD);
        loginPage.clickSigninButton();
        loginPage.firstTab.click();
        loginPage.firstTab.shouldHave(attribute("data-active", "true"));
        loginPage.secondTab.click();
        loginPage.secondTab.shouldHave(attribute("data-active", "true"));
        loginPage.thirdTab.click();
        loginPage.thirdTab.shouldHave(attribute("data-active", "true"));
        loginPage.fourthTab.click();
        loginPage.fourthTab.shouldHave(attribute("data-active", "true"));

    }

}