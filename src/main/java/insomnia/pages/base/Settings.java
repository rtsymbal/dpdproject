package insomnia.pages.base;

import com.codeborne.selenide.Configuration;
import insomnia.pages.base.domain.User;


public class Settings{

    public static User user = new User(
            "E2ETSYMBAL",
            "R1EBTNv0keIda"
    );

    public static String customerName = "E2E_t_ONE";
    public static String userEmail = "roman.tsymbal-external@dpdgroup.com";

    public String pageURL = "/it4em/customer/corporateCustomerDefinition/?lang=en";

    public void init() {
        Configuration.browser="chrome";
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1440x960";
        Configuration.baseUrl = "http://10.240.20.156:8080";
    }

}
