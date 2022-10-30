package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void getFactorial() {
        assertAll(() -> assertEquals(1, Factorial.getFactorial(1)),
                () -> assertNotEquals(4, Factorial.getFactorial(4)),
                () -> assertEquals(24, Factorial.getFactorial(4)),
                () -> assertEquals(1, Factorial.getFactorial(-3)),
                () -> assertEquals(40320, Factorial.getFactorial(8)));
    }
}