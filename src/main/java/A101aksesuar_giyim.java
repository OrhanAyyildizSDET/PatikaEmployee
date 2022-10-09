package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;



public class A101aksesuar_giyim {
    public A101aksesuar_giyim() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "[alt= 'Penti Kadın 50 Denye Pantolon Çorabı Siyah']")
    public WebElement pentiCorap;
    @FindBy(xpath = "//div//span[.='SİYAH']")
    public WebElement assertSiyah;
}
