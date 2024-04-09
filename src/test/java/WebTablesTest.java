import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class WebTablesTest {

    @BeforeAll
    public static void setup() {
        Configuration.headless = true;
    }

    @Test
    public void testAddAndEditRecord() {
        open("https://demoqa.com/webtables");
        $("#addNewRecordButton").click();
        $("#firstName").setValue("Abdullah");
        $("#lastName").setValue("Şahin");
        $("#userEmail").setValue("asahin@example.com");
        $("#age").setValue("36");
        $("#salary").setValue("500000");
        $("#department").setValue("TEST");
        $("#submit").click();
        $(".rt-tbody").shouldHave(text("Abdullah"), text("Şahin"), text("asahin@example.com"), text("36"), text("500000"), text("TEST"));




    }
}
