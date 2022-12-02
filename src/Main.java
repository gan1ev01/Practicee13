import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            number1.add(random.nextInt(100));
        }

        for (int i = 0; i < number1.size(); i++) {
            if (number1.get(i) % 2 == 0) {
                number2.add(number1.get(i));
            } else {
                number3.add(number1.get(i));
            }
        }

        System.out.println("Opshiy sandar:");
        System.out.println(number1);
        System.out.println("Tak sandar:");
        System.out.println(number2);
        System.out.println("Zhup sandar:");
        System.out.println(number3);
    }
}






