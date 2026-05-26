package homework180526.task1;

public class GenericUtils {
    public static <T extends Comparable <T>> T findMax(T[] array) {
        if (array == null || array.length == 0 )
            return null;
        T max = array[0];
        for(T element : array){
            if(element.compareTo(max) > 0){
                max = element;
            }
        }
        return max;
    }
}
class House implements Comparable<House>{
    private String address;
    private double area;
    public House (String address, double area){
        this.address = address;
        this.area = area;
    }

    @Override
    public int compareTo(House other){
        return Double.compare(this.area, other.area);
    }
    @Override
    public String toString(){
        return "House{" + "address='" + address + '\'' + ", area=" + area +'}';
    }
}
