package homework180526.task3;

public class GenericUtils {
    public static <R, E extends Identifiable<R>> Object[] extractIds(E[] array) {
        Object[] ids = new Object[array.length];
        for (int i = 0; i < array.length; i++) {
            ids[i] = array[i].getId();
        }
        return ids;
    }
}
