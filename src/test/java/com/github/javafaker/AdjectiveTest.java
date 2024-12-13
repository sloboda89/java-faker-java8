package com.github.javafaker;

import org.junit.Test;

import static com.github.javafaker.matchers.MatchesRegularExpression.matchesRegularExpression;
import static org.junit.Assert.assertThat;

public class AdjectiveTest extends AbstractFakerTest {

    @Test
    public void positive() {
        assertThat(faker.adjective().positive(), matchesRegularExpression("\\w+"));
    }

    @Test
    public void negative() {
        assertThat(faker.adjective().negative(), matchesRegularExpression("\\w+"));
    }

}
