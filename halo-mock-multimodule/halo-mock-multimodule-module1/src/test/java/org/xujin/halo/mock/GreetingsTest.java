package org.xujin.halo.mock;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GreetingsTest {

    @Test
    public void testHello() {
        Greetings greetings = new Greetings();
        assertThat("Hello,xujin", is(greetings.getHello()));
    }

    @Test
    public void testSayGodBye() {
        Greetings greetings = new Greetings();
        assertThat("Goodbye,xujin", is(greetings.getGoodbye()));
    }

}

