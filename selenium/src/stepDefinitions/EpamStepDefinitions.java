package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import javax.xml.datatype.DatatypeFactory;

public class EpamStepDefinitions {

    public WebDriver driver;

    public EpamStepDefinitions() {
        driver = Hooks.driver;
    }
###
    @Given("I'm in Epam site$")
    public void i_am_in_epam_site() {
        driver.get("http://www.epam.com");
    }


    @When("I entered Global (en) and chose other language$")
    public void i_click_language_and_select() throws Throwable {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnButtonLanguageTab()
                .clickUkrainianRegion();
    }

    @Then("Site was translated$")
    public void i_should_see_english_language() throws Throwable {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        String titleAfterChangeRegion = homePage.getTitleOnHomePage();
        assertEquals(titleAfterChangeRegion, "Engineering the Future");
    }

    @When("I was read message about analytic data and enter accept$")
    public void i_need_close_cookie() {
    	HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.cookiePolice.click();
    }

    @Then("message dissapeared$")
    public void i_click_language_and_select() throws Throwable {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    }    
    
    @When("I was slided main page down and clicked in Facebook icon$")
    public void i_scroll_down_press_facebook() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToSocialsIcons()
                .clickFacebookIcon();
    }

    @Then("I got in Epam facebook page and subscribed in Epam group$")
    public void i_should_see_facebook_page() {
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        String urlInNewTab = driver.getCurrentUrl();
        assertEquals(urlInNewTab, "https://www.facebook.com/EPAM.Global");
    }
    
    @When("I was slided main page down and clicked in instagram icon$")
    public void i_scroll_down_press_instagram() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToSocialIcons()
                .clickInstagramIcon();
    }

    @Then("I got in Epam instagram page and subscribed in instagram group$")
    public void i_should_see_instagram_page() {
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        String urlInNewTab = driver.getCurrentUrl();
        assertEquals(urlInNewTab, "https://www.instagram.com/epamsystems/");
    }

}