package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

import config.LichiConfig;
import org.aeonbits.owner.ConfigFactory;

public class LoginPage {

    LichiConfig config = ConfigFactory.create(LichiConfig.class);

    private final SelenideElement langInput = $("input[name='lang']");
    private final SelenideElement langButton = langInput.sibling(0);
    private final SelenideElement arabicLanguage = $("div[aria-label='lang']").find("ul li", 0);
    private final SelenideElement englishLanguage = $("div[aria-label='lang']").find("ul li", 1);
    private final SelenideElement polishLanguage = $("div[aria-label='lang']").find("ul li", 2);
    private final SelenideElement russianLanguage = $("div[aria-label='lang']").find("ul li", 3);

    public final SelenideElement body = $("body");
    private final SelenideElement loginEmail = $("input[name='login']");
    private final SelenideElement loginPassword = $("input[name='password']");

    private final SelenideElement signinButton= $("button[type='submit']");

    public LoginPage(String url){
        Selenide.open(url);
    }

    public void clickLangButton() {
        langButton.click();
    }
    public void selectArabicLang() {
        langButton.click();
        arabicLanguage.click();
    }

    public void selectEnglishLang() {
        langButton.click();
        englishLanguage.click();
    }

    public void selectPolishLang() {
        langButton.click();
        polishLanguage.click();
    }

    public void selectRussianLang() {
        langButton.click();
        russianLanguage.click();
    }

    public void clickSigninButton() {
        signinButton.click();
    }

    public void setLoginEmail(String value) {
        loginEmail.setValue(value);
    }

    public void setLoginPassword(String value) {
        loginPassword.setValue(value);
    }

}
