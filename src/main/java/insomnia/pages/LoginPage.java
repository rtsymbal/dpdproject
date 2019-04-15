package insomnia.pages;

import com.codeborne.selenide.Selenide;
import insomnia.pages.domain.User;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    public LoginPage open() {
        Selenide.open("/it4em/customer/corporateCustomerDefinition/?lang=en");
        return this;
    }

    public MainPage loginAs(User user){
        $("#username").val(user.getName());
        $("#password").val(user.getPassword());
        $(".login-button").click();
        return new MainPage();
    }
}
