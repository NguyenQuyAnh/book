import constant.URL;
import core.BaseTest;
import org.testng.annotations.Test;
import until.SaveFile;

import java.io.File;

public class GetImage extends BaseTest
{
    File file = new File("D:\\API-AQA\\saveImage\\Vu.txt");

    @Test
    public void saveImage()
    {
        loginPage.login(URL.EMAIL, URL.PASSWORD);
        SaveFile.saveToFile(bookDetailPage.getSrc(), file);
    }

}
