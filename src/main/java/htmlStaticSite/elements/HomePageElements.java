package htmlStaticSite.elements;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class HomePageElements {
    private final SelenideElement btnRequestAQuote;
    private final SelenideElement inputYourName;
    private final SelenideElement inputEmailAddress;
    private final SelenideElement inputPhoneNumber;
    private final SelenideElement inputProjectDescription;
    private final SelenideElement btnUploadFiles;
    private final SelenideElement checkboxTermsAndConditions;


    public HomePageElements() {
        btnRequestAQuote = $("span[class=\"ribbon-block__desktop-text\"]");
        inputYourName = $("btnRequestAQuote;");
        inputEmailAddress = $("#email-popupForm");
        inputPhoneNumber = $("#phone-popupForm");
        inputProjectDescription = $("#project-popupForm");
        btnUploadFiles = $("a[class=\'contact-form__upload-lable\']");
        checkboxTermsAndConditions = $("span[class=\"checkbox__icon\"]");

    }
}