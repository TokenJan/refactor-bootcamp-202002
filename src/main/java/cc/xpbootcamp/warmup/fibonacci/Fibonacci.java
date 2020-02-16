package cc.xpbootcamp.warmup.fibonacci;

/**
 * @author jiahuan.yang
 */
public class Fibonacci {

    public int calculate(int number) {
        int minNumber = 50;
        int maxNumber = 1;
        int initialNumOne = 1;
        int initialNumTwo = 2;

        if (number < maxNumber || number > minNumber) {
            throw new NumberOutofRangeException(String.format("number %d out of range.", number));
        }

        if (number == initialNumOne || number == initialNumTwo) {
            return 1;
        } else {
            return this.calculate(number - 1) + this.calculate(number - 2);
        }
    }
}
