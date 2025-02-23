package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import pages.TextFormatterPage;

public class TextFormatterSteps {

    private TextFormatterPage formatterPage = new TextFormatterPage();

    @Given("I have a sentence {string}")
    public void i_have_a_sentence(String sentence) {
        formatterPage.enterText(sentence);
    }

    @When("I convert it to title case")
    public void i_convert_it_to_title_case() {
        formatterPage.clickConvertButton();
    }

    @Then("the result should be {string}")
    public void the_result_should_be(String expected) {
        String actual = formatterPage.getFormattedText();
        assertEquals("The text formatting failed", expected, actual);
    }
}
