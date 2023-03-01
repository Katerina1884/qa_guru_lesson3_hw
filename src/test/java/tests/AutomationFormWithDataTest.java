package tests;

import org.junit.jupiter.api.Test;

import static tests.TestData.*;


public class AutomationFormWithDataTest extends TestBase {

    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setPhone(phone)
                .setBirthDate(birthDay, birthMonth, birthYear)
                .setSubjects(subjects1)
                .setSubjects(subjects2)
                .setHobbies(hobbies1)
                .setHobbies(hobbies2)
                .setPicture(picture)
                .setAddress(address)
                .setStateAndSity(state, city)
                .setSubmit();

        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", firstName + " " + lastName)
                .verifyResult("Student Email", email)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", phone)
                .verifyResult("Date of Birth", birthDay + " " + birthMonth + " " + birthYear)
                .verifyResult("Subjects", subjects1 + " " + subjects2)
                 .verifyResult("Hobbies", hobbies1 + " " + hobbies2)
                .verifyResult("Picture", picture)
                .verifyResult("Address", address)
                .verifyResult("State and City", state + " " + city);

    }
}
