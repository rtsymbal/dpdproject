package pl.dpdproject;

import com.codeborne.selenide.Configuration;
import insomnia.pages.LoginPage;
import insomnia.pages.domain.User;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public class CreateCustomer {

    public static void main(String[] args) {

        int rnd = (int) Math.floor(Math.random()*111);

        Configuration.browser="chrome";
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1440x960";
        Configuration.baseUrl = "http://10.240.20.156:8080";

        User roman = new User("E2ETSYMBAL", "R1EBTNv0keIda");
        String userEmail = "roman.tsymbal-external@dpdgroup.com";
        String customerName = "E2E_TEST_ONE";


        new LoginPage()
                .open()
                .loginAs(roman);


        //Corporate Customer Definition
        $("#depotUnitId").val("1077");
        $(".ui-menu-item").click();
        $(By.xpath(".//*[@id='corporate-customer-main-section']/div[5]/div[2]/div[2]/div[2]/label/span[1]")).click();
        $("#customerName").val(customerName);
        $("#shortName").val(customerName);
        $("#idmEmail").val(userEmail);
        $("#phone").val("1234567890");
        $(By.xpath(".//*[@id='idmArea-button']/span[1]")).click();
        $(By.xpath("//li[contains(text(),'+33 - FRANCE')]")).click();
        $("#idmTelNo").val("660314362");
        $(By.xpath(".//*[@id='typeOfGoods-button']/span[1]")).click();
        $(By.xpath("//li[contains(text(),'Hardware')]")).click();

        //Address Definition
        $(By.xpath(".//*[@id='ui-id-11']/span[1]")).click();
        $("#region-address-companyName").val("E2E_TEST_ONE_COMPANY");
        $("#region-address-serviceNote-button > span.ui-icon.ui-icon-triangle-1-s").click();
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
        $("#bankLinkPayment-button > span.ui-icon.ui-icon-triangle-1-s").click();
        $(By.xpath("//li[contains(text(),'Enabled')]")).click();
        $("#invoiceTerm-button > span.ui-icon.ui-icon-triangle-1-s").click();
        $(By.xpath("//li[contains(text(),'Monthly')]")).click();
        $("#invoicingWeight-button > span.ui-icon.ui-icon-triangle-1-s").click();
        $(By.xpath("//li[contains(text(),'Pick-up weight')]")).click();
        $("#averageParcelWeigh").val("3.55");









    }

}
