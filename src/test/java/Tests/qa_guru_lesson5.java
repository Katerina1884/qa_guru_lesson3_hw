package Tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class qa_guru_lesson5 {
    @Test
    void fillFormTest() {
        Configuration.browserSize = "1920x1080";
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        $("#firstName").setValue("Yulian");
        $("#lastName").setValue("Sarychev");
        $("#userEmail").setValue("mail@example.com");
        $("#gender-radio-1").parent().click();
        $("#userNumber").setValue("7999123444");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("1989");
        $(".react-datepicker__day--008").click();
        $("#subjectsInput").setValue("Hindi").pressEnter();
        $("#subjectsInput").setValue("Biology").pressEnter();
        $("#hobbies-checkbox-1").parent().click();
        $("#hobbies-checkbox-2").parent().click();
        $("#uploadPicture").uploadFromClasspath("img/111.jpg");
        $("#currentAddress").setValue("Istra, Ivanova street, 98");
        $("#state").click();
        $("#react-select-3-option-3").click();
        $("#city").click();
        $("#react-select-4-option-0").click();
        $("#submit").click();

        $(".modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Yulian Sarychev"),
                text("mail@example.com"),
                text("Male"),
                text("7999123444"),
                text("08 July,1989"),
                text("Hindi, Biology"),
                text("Sports, Reading"),
                text("111.jpg"),
                text("Istra, Ivanova street, 98"),
                text("Rajasthan Jaipur")

        );

    }
}
