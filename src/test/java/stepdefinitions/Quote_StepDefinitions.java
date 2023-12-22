package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.Quote_Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class Quote_StepDefinitions {
    Quote_Pages weptile_pages = new Quote_Pages();
    Actions actions = new Actions(Driver.getDriver());
    private WebDriver driver;
    @Given("User goes to weptile site")
    public void user_goes_to_weptile_site() {

        Driver.getDriver().get(ConfigReader.getProperty("WebUrl"));
    }
    @Given("Click on the testimonials section in the middle of the home page.")
    public void click_on_the_testimonials_section_in_the_middle_of_the_home_page() {
        weptile_pages.testimonialsButton.click();
    }
    @Given("Click on the Get a Quote Now button.")
    public void click_on_the_get_a_quote_now_button() throws InterruptedException {
        Thread.sleep(1000);
        weptile_pages.quoteButton.click();
    }
    @Given("User enters the required information")
    public void user_enters_the_required_information() {

    }
    @Given("Click on CAPTCHA")
    public void click_on_captcha() {

    }
    @When("Click on Send Message button")
    public void click_on_send_message_button() {

    }
    @Then("Assert a message that the offer request has been sent")
    public void assert_a_message_that_the_offer_request_has_been_sent() {
        Assert.assertTrue(weptile_pages.asserttext.isDisplayed());

    }


}
