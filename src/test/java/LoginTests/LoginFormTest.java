package LoginTests;

import com.codeborne.selenide.Selenide;
import config.LichiConfig;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.ProfilePage;
import tests.TestsSetup;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import org.aeonbits.owner.ConfigFactory;

public class LoginFormTest extends TestsSetup {

    LichiConfig config = ConfigFactory.create(LichiConfig.class);

    @Test
    @DisplayName("Check Correct Login method")
    @Description("Checking Correct Login")
    public void CheckCorrectLogin() {
        LoginPage loginPage = new LoginPage(config.baseUrl());

        loginPage.selectArabicLang();
        Selenide.refresh();
        //Works with admin login and password
        // they are removed here due to security reasons
        loginPage.setLoginEmail(config.loginEmail());
        loginPage.setLoginPassword(config.loginPassword());
        loginPage.clickSigninButton();
    }

    @Test
    @DisplayName("Check Incorrect Login method")
    @Description("Checking Incorrect Login")
    public void CheckIncorrectLogin() {
        LoginPage loginPage = new LoginPage(config.baseUrl());
        ProfilePage profilePage = new ProfilePage(config.profileUrl());

        loginPage.selectArabicLang();
        Selenide.refresh();

        loginPage.setLoginEmail("example@mail.com");
        loginPage.setLoginPassword("incorrect");
        loginPage.clickSigninButton();

        loginPage.body.shouldHave(text(config.errorLoginText()));
        profilePage.navigationBar.shouldNotBe(visible);
    }

}

