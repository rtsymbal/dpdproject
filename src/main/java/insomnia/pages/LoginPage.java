package insomnia.pages;

import com.codeborne.selenide.Selenide;
import insomnia.pages.base.Settings;
import insomnia.pages.base.credentials.User;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage extends Settings {
    public LoginPage open() {
        Selenide.open("/it4em/customer/corporateCustomerDefinition/?lang=en");
        return this;
    }

    public LoginPage loginAs(User user){
        $("#username").val(user.getName());
        $("#password").val(user.getPassword());
        $(".login-button").click();
        return this;
    }
}
