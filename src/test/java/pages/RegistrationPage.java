package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.RegistrationResultsModal;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();

    private final String TITLE_TEXT = "Practice Form";

    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName");

    public RegistrationPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        $(".main-header").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setEmail(String value) {
        $("#userEmail").setValue(value);

        return this;
    }

    public RegistrationPage setGender(String value) {
        $("#genterWrapper").$(byText(value)).click();

        return this;
    }

    public RegistrationPage setPhone(String value) {
        $("#userNumber").setValue(value);

        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public RegistrationPage verifyResultsModalAppears() {
        registrationResultsModal.verifyModalAppears();

        return this;
    }

    public RegistrationPage verifyResult(String key, String value) {
        registrationResultsModal.verifyResult(key, value);

        return this;
    }

    public RegistrationPage setSubjects(String value) {
        $("#subjectsInput").setValue(value).pressEnter();

        return this;
    }

    public RegistrationPage setHobbies(String value) {
        $("#hobbiesWrapper").$(byText(value)).click();

        return this;
    }

    public RegistrationPage setPicture(String value) {
        $("#uploadPicture").uploadFromClasspath(value);

        return this;
    }

    public RegistrationPage setAddress(String value) {
        $("#currentAddress").setValue(value);

        return this;
    }

    public RegistrationPage setStateAndSity(String state, String city) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText(state)).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText(city)).click();

        return this;
    }

    public RegistrationPage setSubmit() {
        $("#submit").click();

        return this;
    }
}
