package com.github.javafaker;

public class Adjective {

    private final Faker faker;

    protected Adjective(Faker faker) {
        this.faker = faker;
    }

    /**
     * <p>Produces a positive adjective.</p>
     * @return random a positive adjective.
     */
    public String positive() {
        return faker.resolve("adjective.positive");
    }

    /**
     * <p>Produces a negative adjective.</p>
     * @return random a negative adjective.
     */
    public String negative() {
        return faker.resolve("adjective.negative");
    }
}
