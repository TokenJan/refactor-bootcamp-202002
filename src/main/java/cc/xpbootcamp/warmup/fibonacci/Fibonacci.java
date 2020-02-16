package cc.xpbootcamp.warmup.fibonacci;

/**
 * @author jiahuan.yang
 */
public class Fibonacci {

    public void calculate(int number) {
        int minNumber = 50;
        int maxNumber = 1;
        if (number < maxNumber || number > minNumber) {
            throw new NumberOutofRangeException("number cannot be 0.");
        }
    }
}
