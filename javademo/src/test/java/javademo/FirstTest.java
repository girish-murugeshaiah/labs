package javademo;

import org.junit.jupiter.api.Test;

class FirstTest {

    // declaring logger ... 

    @Test
    void whenTestCase1_thenPass() {
        System.out.println("Running a dummyTest1");
    }
    @Test
    void whenTestCase2_thenPass() {
        System.out.println("Running a dummyTest2");
    }
}