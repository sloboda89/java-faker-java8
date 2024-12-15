package com.github.javafaker;

import com.github.javafaker.repeating.Repeat;
import org.junit.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class AirportTest extends AbstractFakerTest {

    @Test
    @Repeat(times=100)
    public void small_united_states_name() {
        assertThat(faker.airport().name("small", "united_states"), matchesRegularExpression("[\\p{L} .,/\\-']+"));
    }

    @Test
    @Repeat(times=100)
    public void medium_united_states_name() {
        assertThat(faker.airport().name("medium", "united_states"), matchesRegularExpression("[\\p{L} .,/\\-']+"));
    }

    @Test
    @Repeat(times=100)
    public void large_united_states_name() {
        assertThat(faker.airport().name("large", "united_states"), matchesRegularExpression("[\\p{L} .,/\\-']+"));
    }

    @Test
    @Repeat(times=100)
    public void medium_european_union_name() {
        assertThat(faker.airport().name("medium", "european_union"), matchesRegularExpression("[\\p{L} .,/\\-']+"));
    }

    @Test
    @Repeat(times=100)
    public void large_european_union_name() {
        assertThat(faker.airport().name("large", "european_union"), matchesRegularExpression("[\\p{L} .,/\\-']+"));
    }

    @Test
    public void iata() {
        assertThat(faker.airport().iata("large", "united_states"), matchesRegularExpression("[A-Z]{3}"));
    }

}
