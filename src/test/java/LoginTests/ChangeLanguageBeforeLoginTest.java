package LoginTests;

import com.codeborne.selenide.Selenide;
import config.LichiConfig;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.junit5.AllureJunit5;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.DisplayName;
import pages.LoginPage;
import tests.TestsSetup;
import enums.LanguageEnum;

import static com.codeborne.selenide.Condition.*;
import org.aeonbits.owner.ConfigFactory;

@DisplayName("Lichi Login Page Test Class")
@Feature("Login Page Feature")
public class ChangeLanguageBeforeLoginTest extends TestsSetup {



    LichiConfig config = ConfigFactory.create(LichiConfig.class);

    @Test
    @DisplayName("Check Arabic Language method")
    @Description("Checking Arabic Language")
    public void CheckLanguageArabic() {
        LoginPage loginPage = new LoginPage(config.baseUrl());

        loginPage.selectArabicLang();
        Selenide.refresh();

        loginPage.body.shouldHave(text(LanguageEnum.ARABIC.getName()));
        loginPage.body.shouldNotHave(text(LanguageEnum.ENGLISH.getName()));
    }

    @Test
    @DisplayName("Check English Language method")
    @Description("Checking English Language")
    public void CheckLanguageEnglish() {
        LoginPage loginPage = new LoginPage(config.baseUrl());

        loginPage.selectEnglishLang();
        Selenide.refresh();

        loginPage.body.shouldHave(text(LanguageEnum.ENGLISH.getName()));
        loginPage.body.shouldNotHave(text(LanguageEnum.ARABIC.getName()));
    }

    @Test
    @DisplayName("Check Polish Language method")
    @Description("Checking Polish Language")
    public void CheckLanguagePolish() {
        LoginPage loginPage = new LoginPage(config.baseUrl());

        loginPage.selectPolishLang();
        Selenide.refresh();

        loginPage.body.shouldHave(text(LanguageEnum.POLISH.getName()));
        loginPage.body.shouldNotHave(text(LanguageEnum.RUSSIAN.getName()));
    }

    @Test
    @DisplayName("Check Russian Language method")
    @Description("Checking Russian Language")
    public void CheckLanguageRussian() {
        LoginPage loginPage = new LoginPage(config.baseUrl());

        loginPage.selectRussianLang();
        Selenide.refresh();

        loginPage.body.shouldHave(text(LanguageEnum.RUSSIAN.getName()));
        loginPage.body.shouldNotHave(text(LanguageEnum.ENGLISH.getName()));
    }


}

