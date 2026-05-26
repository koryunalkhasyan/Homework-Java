package homework250526.task1;

import java.util.List;

public class NumberUtils {

    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;

        for (Number number : list) {
            if (number != null) {
                sum += number.doubleValue();
            }
        }

        return sum;
    }
}
