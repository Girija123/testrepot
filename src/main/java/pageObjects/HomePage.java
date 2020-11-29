package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public WebDriver driverPage;

    public static String menuOptionVal;

    public HomePage(WebDriver driver)
    {
        this.driverPage = driver;
        PageFactory.initElements(driver, this);
    }

    public void mouseOverMenu(String menuOptionVal)
    {
        HomePage.menuOptionVal = menuOptionVal;
        Actions actions = new Actions(driverPage);
        WebElement menuOption = driverPage.findElement(By.xpath("//span[@class='PrimarynavlinksText' and text()= '"+menuOptionVal+"']"));
        actions.moveToElement(menuOption).build().perform();
    }

    public void clickSubMenuOption(String subMenuOptionVal)
    {
        WebElement subMenuOption = driverPage.findElement(By.xpath("//div[@data-parentname='"+menuOptionVal+"']/div/ul/li/div[@class='HdTxt']/a[text()='"+subMenuOptionVal+"']"));
        subMenuOption.click();
    }

    public void clickHeaderLink(String headerLink)
    {
        driverPage.findElement(By.xpath("//section[@class='QuickLinks']/ul/li/a[text()="+headerLink+"]")).click();
    }

}
