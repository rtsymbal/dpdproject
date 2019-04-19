package insomnia.pages;

import com.codeborne.selenide.Selenide;
import insomnia.pages.base.Settings;
import insomnia.pages.base.domain.User;

import static com.codeborne.selenide.Selenide.$;


public class LoginPage extends Settings {

    public LoginPage open() {
        Selenide.open(pageURL);
        return this;
    }

    public LoginPage loginAs(User user){
        $("#username").val(user.name);
        $("#password").val(user.password);
        $(".login-button").click();
        return this;
    }
}
