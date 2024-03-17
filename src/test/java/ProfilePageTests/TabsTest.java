package ProfilePageTests;

import com.codeborne.selenide.Selenide;
import config.LichiConfig;
import io.qameta.allure.Description;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.ProfilePage;
import tests.TestsSetup;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.attribute;

public class TabsTest extends TestsSetup {

    LichiConfig config = ConfigFactory.create(LichiConfig.class);

    @Test
    @DisplayName("Check Correct Tabs method")
    @Description("Checking Correct Tabs")
    public void CheckCorrectTabs() {

        LoginPage loginPage = new LoginPage(config.baseUrl());
        ProfilePage profilePage = new ProfilePage(config.profileUrl());

        loginPage.selectEnglishLang();
        Selenide.refresh();
        //Works with admin login and password
        // they are removed here due to security reasons
        loginPage.setLoginEmail(config.loginEmail());
        loginPage.setLoginPassword(config.loginPassword());
        loginPage.clickSigninButton();

        profilePage.lecturesTab.click();
        profilePage.lecturesTab.shouldHave(attribute("data-active", "true"));
        profilePage.testsTab.click();
        profilePage.testsTab.shouldHave(attribute("data-active", "true"));
        profilePage.ratingTab.click();
        profilePage.ratingTab.shouldHave(attribute("data-active", "true"));
        profilePage.employeesTab.click();
        profilePage.employeesTab.shouldHave(attribute("data-active", "true"));

    }

}
