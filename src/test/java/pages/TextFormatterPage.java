package pages;

public class TextFormatterPage {

    private String inputText;
    private String formattedText;

    /**
     * Simulate entering text into a text box.
     */
    public void enterText(String text) {
        this.inputText = text;
    }

    /**
     * Simulate clicking a "convert" button.
     * This uses the utility class to convert the text.
     */
    public void clickConvertButton() {
        formattedText = TextFormatterUtil.toTitleCase(inputText);
    }

    /**
     * Retrieve the formatted text (as if from a UI element).
     */
    public String getFormattedText() {
        return formattedText;
    }
}
