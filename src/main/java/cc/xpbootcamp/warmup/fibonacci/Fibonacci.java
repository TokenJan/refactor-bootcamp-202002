package cc.xpbootcamp.warmup.fibonacci;

/**
 * @author jiahuan.yang
 */
public class Fibonacci {

    public int calculate(int number) {
        int minNumber = 50;
        int maxNumber = 1;

        if (number < maxNumber || number > minNumber) {
            throw new NumberOutofRangeException(String.format("number %d out of range.", number));
        }

        if (number == 1 || number == 2) {
            return 1;
        } else {
            return 0;
        }
    }
}
