package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;



public class A101homepage {
    public A101homepage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[@href = '/giyim-aksesuar/'])[1]")
    public WebElement giyimAksesuar;
    @FindBy(css = "[href = '/giyim-aksesuar/dizalti-corap/']")
    public WebElement dizaltiCorap;
    @FindBy(xpath = "//button[@id = 'CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElement cookieAccept;
}
