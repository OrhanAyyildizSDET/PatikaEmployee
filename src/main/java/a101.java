package stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.A101Basket;

import pages.A101aksesuar_giyim;
import pages.A101homepage;
import pages.Penticorap;
import utilities.Driver;

import java.time.Duration;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class a101 {
    A101homepage a101homepage = new A101homepage();
    A101aksesuar_giyim a101aksesuar_giyim = new A101aksesuar_giyim();
    A101Basket a101basket = new A101Basket();
    Penticorap pentiCorap = new Penticorap();
    JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
    ChromeOptions chromeOptions = new ChromeOptions();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(5));
    Actions action = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    @Given("a101 sitesine gidilir {string}")
    public void a101_sitesine_gidilir(String string) throws InterruptedException {
        Driver.getDriver().get(string);//
        chromeOptions.setAcceptInsecureCerts(true);
        wait.until(ExpectedConditions.visibilityOf(a101homepage.cookieAccept)).click();
        Point a  = a101homepage.giyimAksesuar.getLocation();
        System.out.println(a);
        boolean title = Driver.getDriver().getPageSource().contains("A101");
        System.out.println(title);
        //List<WebElement> list = driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"));
        //xpath=//button[contains(.,'Arcade Reader')]/../preceding-sibling::button[@name='settings']
        //getGroupByName("Arcade Reader").find("button[name='settings']");
    }
    @When("Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap bölümüne girilir")
    public void giyim_aksesuar_kadın_i̇ç_giyim_dizaltı_çorap_bölümüne_girilir() throws InterruptedException {
        action.moveToElement(a101homepage.giyimAksesuar).perform();
        Thread.sleep(2000);
        js.executeScript("arguments[0].click()",a101homepage.dizaltiCorap);
    }
    @Then("- Açılan ürünün siyah olduğu doğrulanır.")
    public void açılan_ürünün_siyah_olduğu_doğrulanır() {
        a101aksesuar_giyim.pentiCorap.click();
        assertEquals("SİYAH", a101aksesuar_giyim.assertSiyah.getText());
    }
    @When("Sepete ekle butonuna tıklanır.")
    public void sepete_ekle_butonuna_tıklanır() {
        pentiCorap.addToBasketButton.click();
    }
    @When("Sepeti Görüntüle butonuna tıklanır.")
    public void sepeti_görüntüle_butonuna_tıklanır() {
        pentiCorap.sepetiGörüntüleButonu.click();
    }
    @When("Sepeti Onayla butonuna tıklanır.")
    public void sepeti_onayla_butonuna_tıklanır() {
        a101basket.sepetiOnayla.click();
    }
    @When("Üye olmadan devam et butonuna tıklanır.")
    public void üye_olmadan_devam_et_butonuna_tıklanır() {
        a101basket.üyeOlmadanDevam.click();
    }
    @Then("Mail ekranı gelir.")
    public void mail_ekranı_gelir() {
        a101basket.email.sendKeys(faker.internet().emailAddress());
        a101basket.devamEt.click();
    }
    @Then("Sonrasında adres ekranı gelir.")
    public void sonrasında_adres_ekranı_gelir() throws InterruptedException {
        a101basket.newAddress.click();
        action.sendKeys(a101basket.adressBaslıgı,"Ev").sendKeys(Keys.TAB).sendKeys(faker.name().firstName()+Keys.TAB
        +faker.name().lastName()+Keys.TAB+faker.phoneNumber().cellPhone()).build().perform();
        Select city = new Select(a101basket.city);
        Select township = new Select(a101basket.township);
        Select district = new Select(a101basket.district);
        city.selectByVisibleText("İSTANBUL");
        township.selectByVisibleText("BEŞİKTAŞ");
        Thread.sleep(1000);
        district.selectByVisibleText("ORTAKÖY MAH");
        a101basket.addressText.sendKeys(faker.address().streetAddress());
        //js.executeScript("arguments[0].setAttribute('value','"+faker.address().streetAddress()+"')",a101basket.addressText);
        Thread.sleep(1000);
        a101basket.kaydetButonu.click();
        Thread.sleep(2000);
        //js.executeScript("arguments[0].click()",a101basket.kaydetVeDevamEt);
        action.click(a101basket.kaydetVeDevamEt).build().perform();
    }
    @When("Adres oluştur dedikten sonra ödeme ekranı gelir.")
    public void adres_oluştur_dedikten_sonra_ödeme_ekranı_gelir() {
        assertTrue(a101basket.odemeSecenekleri.isDisplayed());
    }
    @When("Siparişi tamamla butonuna tıklayarak,")
    public void siparişi_tamamla_butonuna_tıklayarak() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(a101basket.cardName.isDisplayed());
        action.sendKeys(a101basket.cardName,faker.name().fullName()).sendKeys(a101basket.masterPassCardNo,faker.number().digits(16)).
                sendKeys(a101basket.cardMonth,"12").sendKeys(a101basket.cardYear,"35").sendKeys(a101basket.cardCvcNo,faker.number().digits(3))
                .build().perform();
        js.executeScript("document.querySelector(arguments[0].click(),'::before');",a101basket.agreement);
        Thread.sleep(2000);
        a101basket.orderComplete.click();


    }
    @Then("ödeme ekranına gidildiği ,doğru ekrana yönlendiklerini kontrol edecekler.")
    public void ödeme_ekranına_gidildiği_doğru_ekrana_yönlendiklerini_kontrol_edecekler() {
    }
}
