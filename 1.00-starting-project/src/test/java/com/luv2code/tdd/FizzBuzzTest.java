package com.luv2code.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    // If number is divisible by 3              print Fizz
    // If number is divisible by 5              print Buzz
    // If number is divisible by 3 and 5        print FizzBuzz
    // If number is NOT divisible by 3 or 5     print the number

    // If number is divisible by 3              print Fizz
    @Order(1)
    @DisplayName("Divisible by Three")
    @Test
    void testForDivisibleByThree()  {

        String expected = "Fizz";

        assertEquals(expected, FizzBuzz.compute(3), "Should return Fizz");
    }

    // If number is divisible by 5              print Buzz
    @Order(2)
    @DisplayName("Divisible by Five")
    @Test
    void testForDivisibleByFive()  {

        String expected = "Buzz";

        assertEquals(expected, FizzBuzz.compute(5), "Should return Buzz");
    }

    // If number is divisible by 3 and 5        print FizzBuzz
    @Order(3)
    @DisplayName("Divisible by Three and Five")
    @Test
    void testForDivisibleByThreeAndFive()  {

        String expected = "FizzBuzz";

        assertEquals(expected, FizzBuzz.compute(15), "Should return FizzBuzz");
    }

    // If number is NOT divisible by 3 or 5     print the number
    @Order(4)
    @DisplayName("Not Divisible by Three or Five")
    @Test
    void testForNotDivisibleByThreeOrFive()  {

        String expected = "1";

        assertEquals(expected, FizzBuzz.compute(1), "Should return 1");
    }


}
