import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(15);
        nums.add(35);
        nums.add(48);
        nums.add(60);
        nums.add(75);


        int suma = 0;
        for (int n : nums) {
            suma += n;
        }
        System.out.println("Suma de nums: " + suma);


        List<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carla");
        nombres.add("Diego");


        System.out.println("Impresión con for:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println(nombres.get(i));
        }


        System.out.println("Impresión con foreach:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }


        System.out.println("Impresión con while:");
        int i = 0;
        while (i < nombres.size()) {
            System.out.println(nombres.get(i));
            i++;
        }
    }
}