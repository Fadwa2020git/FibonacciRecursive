package main;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @org.junit.jupiter.api.Test
    void getFibonacciNumberTest5() {

        Assert.assertEquals(5, Fibonacci.getFibonacciNumber(5));
    }
    @org.junit.jupiter.api.Test
    void getFibonacciNumberTest20() {

        Assert.assertEquals(6765, Fibonacci.getFibonacciNumber(20));
    }
    @org.junit.jupiter.api.Test
    void getFibonacciNumberTest11() {

        Assert.assertEquals(89, Fibonacci.getFibonacciNumber(11));
    }
}