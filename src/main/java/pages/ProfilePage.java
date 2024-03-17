package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProfilePage {

    SelenideElement navigationBar = $("body nav");

    SelenideElement lecturesTab = $$("ul[data-justify='center'] li").get(0);
    SelenideElement testsTab = $("ul[data-justify='center']").find("li", 1);
    SelenideElement ratingTab = $("ul[data-justify='center']").find("li", 2);
    SelenideElement employeesTab = $("ul[data-justify='center']").find("li", 3);

}
