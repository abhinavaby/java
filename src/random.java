
import java.util.Random;


public class random {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(1,100);
        double num = rand.nextDouble(1,10);
        double num2 = rand.nextDouble();
        boolean bool = rand.nextBoolean();
        System.out.println(number);
        System.out.println(num);
        System.out.println(num2);
        System.out.println(bool);
    }
}
