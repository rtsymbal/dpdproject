package pl.dpdproject;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CreateCustomer {
    public static void main(String[] args) {

        double rnd = Math.floor(Math.random()*11);

        Configuration.browser="chrome";
        Configuration.headless = false;
        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
        open("http://10.240.20.156:8080/backend/login");
        $("#username").sendKeys("E2ETSYMBAL");
        $("#password").sendKeys("R1EBTNv0keIda");
        $(".login-button").click();

        open("http://10.240.20.156:8080/it4em/customer/corporateCustomerDefinition/?lang=en");

        //Corporate Customer Definition
        $("#depotUnitId").sendKeys("1077");
        $(".ui-menu-item").click();
        $(By.xpath(".//*[@id='corporate-customer-main-section']/div[5]/div[2]/div[2]/div[2]/label/span[1]")).click();
        $("#customerName").sendKeys("E2E_TEST_ONE");
        $("#shortName").sendKeys("E2E_TEST_ONE");
        $("#idmEmail").sendKeys("roman.tsymbal-external@dpdgroup.com");
        $("#phone").sendKeys("1234567890");
//        Select idmArea = new Select($("#idmArea"));
//        idmArea.selectByValue("+33");
        $(By.xpath(".//*[@id='idmArea-button']/span[1]")).click();
        $("#ui-id-92").click();
        $("#idmTelNo").sendKeys("660314362");
        $(By.xpath(".//*[@id='typeOfGoods-button']/span[1]")).click();
        $("#ui-id-129").click();

        //Address Definition
        $(By.xpath(".//*[@id='ui-id-11']/span[1]")).click();
        $("#region-address-companyName").sendKeys("E2E_TEST_ONE_COMPANY");
        $(By.xpath(".//*[@id='region-address-serviceNote-button']/span[1]")).click();
        $("#ui-id-89").click();
        $("#region-address-paddedZipCode").sendKeys("77144");
        $("#region-address-cityRegion").sendKeys("MONTEVRAIN");
        $("#region-address-street").sendKeys("Rue du Bicheret");
        $("#region-address-houseNo").sendKeys(""+rnd);
        $("#select-customer-address-geocode").click();


    }

}
