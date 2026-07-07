import java.util.Arrays;
import java.util.Scanner;

public class user_input_to_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the limit of the array: ");
        int limit = sc.nextInt();

        String[] fruits = new String[limit];

        for(int i=0;i<limit;i++){
            System.out.print("enter fruit "+(i+1)+": ");
            fruits[i] = sc.next();
        }

        System.out.println("the array = " + Arrays.toString(fruits));

    }
}
