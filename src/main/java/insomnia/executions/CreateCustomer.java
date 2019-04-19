package insomnia.executions;
import insomnia.pages.LoginPage;
import insomnia.pages.base.Settings;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class CreateCustomer extends Settings{

    public static void main(String[] args) {
        new Settings()
                .init();

        new LoginPage()
                .open()
                .loginAs(user);

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
        $("#region-address-companyName").val(customerName + "_COMPANY");
        $("#region-address-serviceNote-button > span.ui-icon.ui-icon-triangle-1-s").click();
        $(By.xpath("//li[contains(text(),'E-mail')]")).click();
        $("#select-workarea").click();
        $("#work-area-toast-form-zipCode").val("77144");
        $("#toast-search-work-area").click();
        $(".x-grid-cell-inner ").click();
        $(".arrow-button").click();
        $("#region-address-street").val("Chemin de Halage");
        $("#region-address-houseNo").val(""+(int) Math.floor(Math.random()*99));
        $("#select-customer-address-geocode").click();
        $(".x-grid-cell-inner ").click();
        $("#save-toast-form-customer-address-geocode").click();
        $("#editAddressToolbar > div.button.button-add > span").click();

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
        $("#averageParcelWeigh").val("3.5");

        //Save
//        $("#componentSaveButtonId").click();

        //Confirmation popup
//        $("#yes-confirmation-save-button").click();

        //Copy customer ID
//        $("#customerId")

        //Email information
        $("#select-segment").click();
        $("#customer-email-form-type-button > span.ui-icon.ui-icon-triangle-1-s").click();
        $(By.xpath("//*[@id='customer-email-form-type-menu']/li[contains(text(),'Invoice')]")).click();
        $("#customer-email-form-email").val("ivo.grancovskis@dpdgroup.com");
        $(By.xpath("//*[@id=\"toastform-customer-email-definition-form\"]/div/div[1]/div[2]/div[2]/label/span[1]")).click();
        $("#customer-email-toolbar-buttons > div.button.button-add > span").click();
        $("#save-toast-form-customer-email-definition").doubleClick();

    }
}
