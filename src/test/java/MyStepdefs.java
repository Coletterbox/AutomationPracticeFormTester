import com.sparta.crss.HomePage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
    @When("I type into the first name box")
    public void iTypeIntoTheFirstNameBox() {
        WebDriver webDriver = new ChromeDriver();
        HomePage.enterTextIntoBox(webDriver, "firstName", "Bob");
    }
}
