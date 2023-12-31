package lv.acodemy.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lv.acodemy.sauce_pages.AddToBasket;
import lv.acodemy.sauce_pages.InventoryPage;
import lv.acodemy.sauce_pages.LoginPage;
import lv.acodemy.sauce_pages.OrderPlacement;
import lv.acodemy.utils.LocalDriverManager;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static lv.acodemy.sauce_pages.AddToBasket.PRODUCT_TITLE;
import static lv.acodemy.sauce_pages.OrderPlacement.ORDER_COMPLETE_MESSAGE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElements;

public class AuthSteps {

    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();
    AddToBasket addToBasket = new AddToBasket();
    OrderPlacement orderPlacement = new OrderPlacement();
    WebDriverWait wait = new WebDriverWait(LocalDriverManager.getInstance(), Duration.ofSeconds(5));

    @When("user logs in with credentials: {string} and {string}")
    public void login(String username, String password) {
        loginPage.authorize(username, password);
    }

    @Then("user is authenticated")
    public void checkIfAuthenticated() {
        wait.until(visibilityOfAllElements(inventoryPage.getInventoryItems()));
        assertThat(inventoryPage.getInventoryItems()).hasSize(6);
    }

    @Then("user see error message: {string}")
    public void userSeeErrorMessage(String errorMessage) {
        assertThat(loginPage.getErrorMessage().getText()).isEqualTo(errorMessage);
    }

    @When("user add item \"Sauce Labs Backpack\" to basket")
    public void addItemToBasket() {
        addToBasket.AddBackpackToBasket();
    }

    @Then("user see this item in the basket")
    public void checkIfItemIsPresent() {
        wait.until(visibilityOf(addToBasket.getCartItem()));
        assertThat(addToBasket.getCartItem().getText()).isEqualTo(PRODUCT_TITLE);
    }

    @When ("user place an order")
    public void placeAnOrder() {
        orderPlacement.placeAnOrder("Eunice", "Christiansen", "17522");
    }

    @Then("user is redirected to the page with a message about completion of order placement")
    public void checkConfirmationMessage() {
        wait.until(visibilityOf(orderPlacement.getCheckoutCompleteMessage()));
        Assertions.assertThat(orderPlacement.getCheckoutCompleteMessage().getText()).isEqualTo(ORDER_COMPLETE_MESSAGE);
    }
}
