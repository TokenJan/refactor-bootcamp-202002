package cc.xpbootcamp.warmup.fibonacci;

import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @Before
    public void setup() {
        fibonacci = new Fibonacci();
    }

    @Test(expected = NumberOutofRangeException.class)
    public void should_throw_exception_when_calculate_given_number_0() {
        fibonacci.calculate(0);
    }

    @Test(expected = NumberOutofRangeException.class)
    public void should_throw_exception_when_calculate_given_number_51() {
        fibonacci.calculate(51);
    }

    @Test()
    public void should_return_1_when_calculate_given_number_1() {
        assert 1 == fibonacci.calculate(1);
    }

    @Test()
    public void should_return_1_when_calculate_given_number_2() {
        assert 1 == fibonacci.calculate(2);
    }

    @Test()
    public void should_return_2_when_calculate_given_number_3() {
        assert 2 == fibonacci.calculate(3);
    }
}
