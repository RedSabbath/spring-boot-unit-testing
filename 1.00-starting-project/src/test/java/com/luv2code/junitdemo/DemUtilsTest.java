package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class DemUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach()  {
        demoUtils = new DemoUtils();
//        System.out.println("@BeforeEach executes before the execution of each test method");
    }

    @Test
    @DisplayName("Equals and Not Equals")
    void testEqualsAndNotEquals() {

//        System.out.println("Running test: testEqualsAndNotEquals");

        assertEquals(6, demoUtils.add(2,4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1,9), "1+9 must not be 6");
    }

    @DisplayName("Null and Not Null")
    @Test
        void testNullAndNotNull()   {

//        System.out.println("Running test: testNullAndNotNull");

        String str1 = null;
        String str2 = "luv2code";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should NOT be null");
    }

    @DisplayName("True and False")
    @Test
        void testTrueFalse()    {
            int gradeOne = 10;
            int gradeTwo = 5;

            assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "This should return true");
            assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "This should return false");
    }

    @DisplayName("Same and Not Same")
    @Test
    void testSameAndNotSame()  {
        String str = "luv2code";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Objects should refer to the same object");
        assertNotSame(str, demoUtils.getAcademy(), "Objects should not refer to the same object");
    }

    @DisplayName("Array Equals")
    @Test
    void testArrayEquals()  {
        String[] stringArray = {"A", "B", "C"};

        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(), "Arrays should be the same");
    }

    @DisplayName("Interable Equals")
    @Test
    void testIterableEquals()   {
        List<String> theList = List.of("luv", "2", "code");
        assertIterableEquals(theList, demoUtils.getAcademyInList(), "Expected list should be same as actual list");
    }

    @DisplayName("Lines Match")
    @Test
    void testLinesMatch()   {
        List<String> theList = List.of("luv", "2", "code");
        assertLinesMatch(theList, demoUtils.getAcademyInList(), "Lines should match");
    }




//    @AfterEach
//    void tearDownAfterEach()    {
//        System.out.println("Running @AfterEach");
//        System.out.println();
//    }
//
//    @BeforeAll
//    static void setupBeforeEachClass()  {
//        System.out.println("@BeforeAll executes only once before all test methods executing in the class");
//    }
//
//    @AfterAll
//    static void tearDownAfterAll()  {
//        System.out.println("@AfterAll executes only once after all test methods execution in the class");
//    }




}
