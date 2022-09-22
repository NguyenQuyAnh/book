package page;

import constant.URL;
import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

//    @FindBy(xpath = "//button[contains(text(),'\"Log In and Borrow\"')]")
//    WebElement loginAndBorrowBtn;

    @FindBy(xpath = "//input[@type='email']")
    WebElement emailTextbox;

    @FindBy(xpath = "//input[@type='password']")
    WebElement passwordTextbox;

    @FindBy(xpath = "//input[@value='Log in']")
    WebElement loginBtn;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(String email, String password)
    {
        nagative(URL.LOGIN_URL);
        sendKey(emailTextbox,email);
        sendKey(passwordTextbox,password);
        click(loginBtn);
        nagative(URL.BOOK_URL);
    }
}