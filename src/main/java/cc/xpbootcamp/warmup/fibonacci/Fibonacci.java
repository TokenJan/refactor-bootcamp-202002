package cc.xpbootcamp.warmup.fibonacci;

public class Fibonacci {

    public void calculate(int number) {
        if (number == 0) {
            throw new NumberOutofRangeException("number cannot be 0.");
        }
    }
}
