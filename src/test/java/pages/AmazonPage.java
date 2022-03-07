package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPage extends BasePage{

    @FindBy(xpath = "(//*[text()=\"Start here.\"])[2]")
    public WebElement startHere;

    @FindBy(id = "ap_customer_name")
    public WebElement yourname;

    @FindBy(id = "ap_email")
    public WebElement mobilEmail;

    @FindBy(id = "ap_password")
    public WebElement password;

    @FindBy(id = "ap_password_check")
    public WebElement rePassword;

    @FindBy(id = "continue")
    public WebElement continuex;


}
