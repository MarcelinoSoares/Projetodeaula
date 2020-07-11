package stepDefinitions;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
// import io.cucumber.java.en.Then;
import io.cucumber.java.PendingException;

public class DummySteps {

    private WebDriver driver;

    @Given("dummy given")
    public void dummyGiven() {
    }

    @When("dummy when")
    public void dummyWhen() {
        throw new PendingException();
    }

    // @Then("dummy then")
    // public void dummyThen() {
    // }
}