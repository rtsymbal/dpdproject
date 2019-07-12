package insomnia.pages.base;

import com.codeborne.selenide.Configuration;
import insomnia.pages.base.domain.User;


public class Settings{

    public static User user = new User(
            "Twoj login",
            "Twoje haslo"
    );

    public static String customerName = "E2E_TEST_C14_5";
    public static String userEmail = "daniel.piwek@dpdgroup.com";

    public String pageURL = "/it4em/customer/corporateCustomerDefinition/?lang=en";

    public void init() {
        Configuration.browser="chrome";
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1440x960";
        Configuration.baseUrl = "TU trzeba wpisac adrec strony i port, np. 10.101.23.45:8080"; // Spodowisko prod lub trening
    }

}
