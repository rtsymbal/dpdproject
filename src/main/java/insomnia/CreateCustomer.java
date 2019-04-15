package pl.dpdproject;

import com.codeborne.selenide.Configuration;
import insomnia.pages.LoginPage;
import insomnia.pages.domain.User;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.*;

public class CreateCustomer {
    public static void main(String[] args) {

        int rnd = (int) Math.floor(Math.random()*111);

        Configuration.browser="chrome";
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1440x960";
        Configuration.baseUrl = "http://10.240.20.156:8080";

        User roman = new User("E2ETSYMBAL", "R1EBTNv0keIda");


        new LoginPage()
                .open()
                .loginAs(roman);

//        open("http://10.240.20.156:8080/it4em/customer/corporateCustomerDefinition/?lang=en");
//        $("#username").val("E2ETSYMBAL");
//        $("#password").val("R1EBTNv0keIda");
//        $(".login-button").click();

        //Corporate Customer Definition
        $("#depotUnitId").val("1077");
        $(".ui-menu-item").click();
        $(By.xpath(".//*[@id='corporate-customer-main-section']/div[5]/div[2]/div[2]/div[2]/label/span[1]")).click();
        $("#customerName").val("E2E_TEST_ONE");
        $("#shortName").val("E2E_TEST_ONE");
        $("#idmEmail").val("roman.tsymbal-external@dpdgroup.com");
        $("#phone").val("1234567890");
//        Select idmArea = new Select($("#idmArea"));
//        idmArea.selectByValue("+33");
        $(By.xpath(".//*[@id='idmArea-button']/span[1]")).click();
        $(By.xpath("//li[contains(text(),'+33 - FRANCE')]")).click();
        $("#idmTelNo").val("660314362");
        $(By.xpath(".//*[@id='typeOfGoods-button']/span[1]")).click();
        $("#ui-id-129").click();

        //Address Definition
        $(By.xpath(".//*[@id='ui-id-11']/span[1]")).click();
        $("#region-address-companyName").val("E2E_TEST_ONE_COMPANY");
        $(By.xpath(".//*[@id='region-address-serviceNote-button']/span[1]")).click();
        $(By.xpath("//li[contains(text(),'E-mail')]")).click();
        $("#select-workarea").click();
        $("#work-area-toast-form-zipCode").val("77144");
        $("#toast-search-work-area").click();
        $(".x-grid-cell-inner ").click();
        $(".arrow-button").click();

        $("#region-address-street").val("Chemin de Halage");
        $("#region-address-houseNo").val(""+rnd);
        $("#select-customer-address-geocode").click();
        $(".x-grid-cell-inner ").click();
        $("#save-toast-form-customer-address-geocode").click();
//        $(By.xpath("//div[@id='editAddressToolbar']//div[contains(@class,'button button-add')]")).click();

        //Commercial Detail
        $("#ui-id-2 > span.ui-accordion-header-icon.ui-icon.ui-icon-custom-plus").click();
        $("#taxNo").val("FR123456789");
        $("#industryName").val("V");
        $("#ui-id-44").click();

        //Credit Information
        $("#ui-id-4 > span.ui-accordion-header-icon.ui-icon.ui-icon-custom-plus").click();





    }

}
