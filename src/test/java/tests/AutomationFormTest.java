package tests;

import org.junit.jupiter.api.Test;


public class AutomationFormTest extends TestBase {

    @Test
    void fillFormTest() {
        registrationPage.openPage()
                .setFirstName("Yulian")
                .setLastName("Sarychev")
                .setEmail("mail@example.com")
                .setGender("Male")
                .setPhone("7999123444")
                .setBirthDate("08", "July", "1989")
                .setSubjects("Hindi")
                .setSubjects("Biology")
                .setHobbies("Sports")
                .setHobbies("Reading")
                .setPicture("img/111.jpg")
                .setAddress("Istra, Ivanova street, 98")
                .setStateAndSity("Rajasthan", "Jaipur")
                .setSubmit();

        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", "Yulian Sarychev")
                .verifyResult("Student Email", "mail@example.com")
                .verifyResult("Gender", "Male")
                .verifyResult("Mobile", "7999123444")
                .verifyResult("Date of Birth", "08 July,1989")
                .verifyResult("Subjects", "Hindi, Biology")
                .verifyResult("Hobbies", "Sports, Reading")
                .verifyResult("Picture", "111.jpg")
                .verifyResult("Address", "Istra, Ivanova street, 98")
                .verifyResult("State and City", "Rajasthan Jaipur");

    }
}
