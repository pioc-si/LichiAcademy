package lichiacademy.app;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LoginPage {

    // Find the input element with the attribute name="lang"
    SelenideElement langInput = $("input[name='lang']");

    // Use Selenide's sibling method to find the next element
    SelenideElement langButton = langInput.sibling(0);

    SelenideElement firstLanguage = $("div[aria-label='lang']").find("ul li", 0);

    SelenideElement secondLanguage = $("div[aria-label='lang']").find("ul li", 1);

    SelenideElement thirdLanguage = $("div[aria-label='lang']").find("ul li", 2);

    SelenideElement fourthLanguage = $("div[aria-label='lang']").find("ul li", 3);

    SelenideElement body = $("body");

    SelenideElement loginEmail = $("input[name='login']");

    SelenideElement loginPassword= $("input[name='password']");

    private SelenideElement signinButton= $("button[type='submit']");

    SelenideElement navigationBar = $("body nav");

    SelenideElement firstTab = $$("ul[data-justify='center'] li").get(0);

    SelenideElement secondTab = $("ul[data-justify='center']").find("li", 1);

    SelenideElement thirdTab = $("ul[data-justify='center']").find("li", 2);

    SelenideElement fourthTab = $("ul[data-justify='center']").find("li", 3);

    public LoginPage(String url){
        Selenide.open(url);
    }

    public void clickLangButton() {
        langButton.click();
    }

    public void clickSigninButton() {
        signinButton.click();
    }
}
