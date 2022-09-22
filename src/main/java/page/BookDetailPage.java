package page;

import core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class BookDetailPage extends BasePage {

    @FindBy(xpath = "//button[@title='Flip right']")
    WebElement nextBtn;

    @FindBy(xpath = "//img[@class='BRpageimage']")
    WebElement imgElement;

    public BookDetailPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public List<String> getSrc() {
        List<String> srcList = new ArrayList<String>();
        while (nextBtn.isEnabled()) {
            srcList.add(imgElement.getAttribute("src"));
            sleep(time);
            click(nextBtn);
        }
        return srcList;
    }

}
