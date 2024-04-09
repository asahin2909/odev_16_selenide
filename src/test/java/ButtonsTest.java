import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class ButtonsTest {

    @BeforeAll
    public static void setup() {
        Configuration.headless = true;
    }

    @Test
    public void testButtonClick() {
        open("https://demoqa.com/elements");
        $($x("Buttons")).click();
        $($x("Click Me")).click();
        $("#dynamicClickMessage").shouldHave(text("You have done a dynamic click"));
    }
}
