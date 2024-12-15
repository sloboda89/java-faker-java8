package com.github.javafaker;

public class Airport {

    private final Faker faker;

    protected Airport(Faker faker) {
        this.faker = faker;
    }

    /**
     * <p>Produces random Airport by name and takes arguments for size and region.</p>
     * @param size {@link String} airport size, united_states has large, or medium, or small, european_union has large, or medium
     * @param region {@link String} airport region, currently available -> united_states or european_union
     *
     * @return random an airport.
     */
    public String name(String size, String region) {
        return faker.resolve("airport." + region + "." + size);
    }

    /**
     * <p>Produces random Airport by IATA code and takes arguments for size and region.</p>
     * @param size {@link String} airport size, united_states has large, or medium, or small, european_union has large, or medium
     * @param region {@link String} airport region, currently available -> united_states or european_union
     *
     * @return IATA code of a random airport.
     */
    public String iata(String size, String region) {
        return faker.resolve("airport." + region + ".iata_code." + size);
    }
}
