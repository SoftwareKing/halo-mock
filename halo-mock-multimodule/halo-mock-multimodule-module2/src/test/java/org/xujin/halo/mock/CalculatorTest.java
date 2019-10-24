package org.xujin.halo.mock;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void testHello() {
        Calculator calc = new Calculator();
        assertThat(4, is(calc.add(2, 2)));
    }
}

