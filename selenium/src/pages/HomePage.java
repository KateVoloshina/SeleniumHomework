package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
    public HomePage(WebDriver driver) {
        super(driver);
    }


    @FindBy(how = How.CSS, using = ".location-selector__button")
    public WebElement languageTab;
    @FindBy(how = How.CSS, using = ".title-ui.title--center")
    public WebElement title;
    @FindBy(how = How.CSS, using = ".title")
    public WebElement logoEpam;
    @FindBy(how = How.CSS, using = ".footer__socials")
    public WebElement socialsIcons;
    @FindBy(how = How.CSS, using = "li:nth-child(3) .footer__social-link")
    public WebElement facebookIcon;
    @FindBy(how = How.CSS, using = "li:nth-child(4) .footer__social-link")
    public WebElement instagramIcon;
    @FindBy(how = How.CSS, using = ".cookie-disclaimer__button")
    public WebElement cookiePolice;


    public LanguagePage clickOnButtonLanguageTab() {
        System.out.println("Click on the language tab");
        languageTab.click();
        return PageFactory.initElements(driver, LanguagePage.class);
    }

    public HomePage scrollToSocialsIcons() throws InterruptedException {
        System.out.println("Scroll to facebook icon");
        scrollToElement(socialsIcons);
        return this;
    }

    public void clickFacebookIcon() throws InterruptedException {
        System.out.println("Click facebook icon");
        facebookIcon.click();
        Thread.sleep(500);
    }

    public HomePage scrollToSocialIcons() throws InterruptedException {
        System.out.println("Scroll to instagram icon");
        scrollToElement(socialsIcons);
        return this;
    }
    
    public void clickInstagramIcon() throws InterruptedException {
        System.out.println("Click instagram icon");
        instagramIcon.click();
        Thread.sleep(500);
    }
    
    public void closeCookiePolicy () {
        cookiePolice.click();
    }

}