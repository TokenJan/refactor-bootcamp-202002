package cc.xpbootcamp.warmup.fibonacci;

/**
 * @author jiahuan.yang
 */
public class Fibonacci {

    public long calculate(int number) {
        int minNumber = 50;
        int maxNumber = 1;
        int initialNumOne = 1;
        int initialNumTwo = 2;
        long[] dpArray = new long[] {1, 1};
        long result = 0;

        if (number < maxNumber || number > minNumber) {
            throw new NumberOutofRangeException(String.format("number %d out of range.", number));
        }

        if (number == initialNumOne || number == initialNumTwo) {
            return 1;
        } else {
            for (int i = initialNumTwo; i < number; i++) {
                result = dpArray[0] + dpArray[1];
                dpArray[0] = dpArray[1];
                dpArray[1] = result;
            }
            return result;
        }
    }
}
