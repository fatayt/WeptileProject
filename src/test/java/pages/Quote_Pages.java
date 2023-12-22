package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Quote_Pages {
    public Quote_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Testimonials']")
    public WebElement testimonialsButton;
    @FindBy(xpath = "//a[contains(text(),'GET A QUOTE NOW')]")
    public WebElement quoteButton;
    @FindBy(xpath = "//span[text()='check your inbox and spam box']")
    public WebElement asserttext;


}
