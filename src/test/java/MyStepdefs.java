import com.sparta.crss.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStepdefs {
    WebDriver webDriver = new ChromeDriver();

    @Given("I am on the form page")
    public void iAmOnTheFormPage() {
        //this is already a given
    }

    @When("I type into the first name box")
    public void iTypeIntoTheFirstNameBox() {
        HomePage.enterTextIntoBox(webDriver, "firstName", "Bob");
    }

    @Then("the text will be in the first name box")
    public void theTextWillBeInTheFirstNameBox() {
        assertEquals(HomePage.getTextFromBox(webDriver, "firstName"), "Bob");
    }
}
