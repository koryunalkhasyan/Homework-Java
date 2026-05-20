package homework180526.task2;

public class GenericUtils {
    public static  <T> boolean contains (T[] array, T elementToFind){
        for (T element : array){
            if (element.equals(elementToFind)){
                return true;
            }
        }
        return false;
    }
}
