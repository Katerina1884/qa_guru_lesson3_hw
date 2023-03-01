package tests;

import com.github.javafaker.Faker;

public class TestData {
    static Faker faker = new Faker();
    static String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = "Male",
            phone = "7999123444",
            birthDay = String.valueOf(faker.number().numberBetween(1, 31)),
            birthMonth = "July",
            birthYear = String.valueOf(faker.number().numberBetween(1980, 2023)),
            subjects1 = "Hindi",
            subjects2 = "Biology",
            hobbies1 = "Sports",
            hobbies2 = "Reading",
            picture = "img/111.jp",
            address = faker.lebowski().quote(),
            state = "Rajasthan",
            city = "Jaipur";


}
