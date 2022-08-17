import org.junit.jupiter.api.BeforeAll;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubPricing {

    @BeforeAll

    static void configure() {

        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://github.com";

    }

    @Test

    void choosePlanTest() {

        open("/");
        $("html").hover();
        $(".HeaderMenu").$(byText("Pricing")).hover();
        $(".HeaderMenu").$(byText("Compare plans")).click();
        $(".application-main").shouldHave(text("Choose the plan that’s right for you."));

    }
}
