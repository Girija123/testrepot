package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListsPage {


    public ProductListsPage (WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "")
    public WebElement searchResultHeading;


    public void assertListProducts(String subMenuOption)
    {
        Assert.assertEquals(searchResultHeading.getText().trim(), subMenuOption);
    }
}
