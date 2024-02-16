package lichiacademy.app;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class LichiTest extends BaseTest {

    @Test
    public void CheckPage() {
        LoginPage loginPage = new LoginPage("https://prerelease.academy.spb.lichishop.com/");
    }

}