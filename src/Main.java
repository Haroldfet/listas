import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(15);
        nums.add(35);
        nums.add(48);

        System.out.println("elementos de la posición:" + nums.get(3));
        System.out.println("el tamaño de la lista es:" + nums.size());
    }
}   