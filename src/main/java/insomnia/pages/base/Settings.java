package insomnia.pages.base;

import com.codeborne.selenide.Configuration;
import insomnia.pages.base.credentials.User;
import lombok.Data;

@Data
public class Settings{

    User roman = new User(
            "E2ETSYMBAL",
            "R1EBTNv0keIda",
            "roman.tsymbal-external@dpdgroup.com");

    String customerName = "E2E_t_FLOW63";

    public void init() {
        Configuration.browser="chrome";
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1440x960";
        Configuration.baseUrl = "http://10.240.20.156:8080";
    }

}
