package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class A101Basket {
    public A101Basket() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "[href= '/orders/checkout/']")
    public WebElement sepetiOnayla;
    @FindBy(css = "[title= 'ÜYE OLMADAN DEVAM ET']")
    public WebElement üyeOlmadanDevam;
    @FindBy(css = "[name= 'user_email']")
    public WebElement email;
    @FindBy(xpath = "//button[@class ='button block green']")
    public WebElement devamEt;
    @FindBy(xpath = "(//li/a[@class = 'new-address js-new-address'])[1]")
    public WebElement newAddress;
    @FindBy(css = "[placeholder = 'Ev adresim, iş adresim vb.']")
    public WebElement adressBaslıgı;
    @FindBy(css = "[name= 'city']")
    public WebElement city;
    @FindBy(css = "[name = 'township']")
    public WebElement township;
    @FindBy(css = "[name = 'district']")
    public WebElement district;
    @FindBy(css = "[class = 'js-address-textarea']")
    public WebElement addressText;
    @FindBy(css = "[class = 'button green address-modal-submit-button js-set-country js-prevent-emoji js-address-form-submit-button']")
    public WebElement kaydetButonu;
    @FindBy(css = "[data-index= '1']")
    public WebElement kaydetVeDevamEt;
    @FindBy(xpath = "//*[. = '2. ÖDEME SEÇENEKLERİ']")
    public WebElement odemeSecenekleri;
    @FindBy(xpath = "//div[6]/div[1]/label/input")
    public WebElement cardName;
    @FindBy(css = "[class = 'js-masterpassbin-payment-card']")
    public WebElement masterPassCardNo;
    @FindBy(xpath = "//div[6]/div[4]/label/input")
    public WebElement cardCvcNo;
    @FindBy(css = "[name = 'card_month'][autocomplete]")
    public WebElement cardMonth;
    @FindBy(css = "[name = 'card_year'][autocomplete]")
    public WebElement cardYear;
    @FindBy(css = "[class = 'order-complete']")
    public WebElement orderComplete;
    @FindBy(css = "[for= 'agrement2']")
    public WebElement agreement;
}
