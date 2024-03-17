package ProfilePageTests;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestsSetup;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.attribute;

public class TabsTest extends TestsSetup {
    /*
    @Test
    @DisplayName("Check Correct Tabs method")
    @Description("Checking Correct Tabs")
    public void CheckCorrectTabs() {

        LoginPage loginPage = new LoginPage(baseurl);
        loginPage.clickLangButton();

        loginPage.arabicLanguage.click();
        Selenide.refresh();
        //Works with admin login and password
        // they are removed here due to security reasons
        loginPage.loginEmail.setValue(LOGIN_EMAIL);
        loginPage.loginPassword.setValue(LOGIN_PASSWORD);
        loginPage.clickSigninButton();
        loginPage.lecturesTab .click();
        loginPage.lecturesTab .shouldHave(attribute("data-active", "true"));
        loginPage.testsTab.click();
        loginPage.testsTab.shouldHave(attribute("data-active", "true"));
        loginPage.ratingTab.click();
        loginPage.ratingTab.shouldHave(attribute("data-active", "true"));
        loginPage.employeesTab.click();
        loginPage.employeesTab.shouldHave(attribute("data-active", "true"));

    }
    */

}
