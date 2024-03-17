package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import config.LichiConfig;
import org.aeonbits.owner.ConfigFactory;


public class ProfilePage {

    public ProfilePage(String url){
        Selenide.open(url);
    }

    LichiConfig config = ConfigFactory.create(LichiConfig.class);

    public SelenideElement navigationBar = $("body nav");

    public SelenideElement lecturesTab = $$("ul[data-justify='center'] li").get(0);
    public SelenideElement testsTab = $("ul[data-justify='center']").find("li", 1);
    public SelenideElement ratingTab = $("ul[data-justify='center']").find("li", 2);
    public SelenideElement employeesTab = $("ul[data-justify='center']").find("li", 3);

}
