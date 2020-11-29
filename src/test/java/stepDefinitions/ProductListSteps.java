package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.HomePage;
import pageObjects.ProductListsPage;

public class ProductListSteps extends CommonFunctions {

    HomePage homePage = new HomePage(driver);
    ProductListsPage  productListsPage = new ProductListsPage(driver);

    @Given("^I'm on HomePage \"([^\"]*)\"$")
    public void i_m_on_HomePage(String url)  {
        driver.get(url);
    }

    @When("^I click menu option \"([^\"]*)\"$")
    public void i_click_menu_option(String menuOption) {
     homePage.mouseOverMenu(menuOption);
    }

    @When("^I click submenu option \"([^\"]*)\"$")
    public void i_click_submenu_option(String subMenuOption) {
     homePage.clickSubMenuOption(subMenuOption);
    }

    @Then("^I should see relevant products listed$")
    public void i_should_see_relevant_products_listed()  {
        productListsPage.assertListProducts("Jeans");
    }

}
