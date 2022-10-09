package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;



public class Penticorap {
    public Penticorap(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "[alt= 'Penti Kadın 50 Denye Pantolon Çorabı Siyah']")
    public WebElement pentiCorapDetay;
    @FindBy(css ="[class= 'add-to-basket button green block with-icon js-add-basket']")
    public WebElement addToBasketButton;
    @FindBy(css = "[class= 'go-to-shop']")
    public WebElement sepetiGörüntüleButonu;

}
