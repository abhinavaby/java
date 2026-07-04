import java.util.Scanner;


public class enhanced_switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        switch(num){
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            case 4 -> System.out.println("4");
            case 5 -> System.out.println("5");
            case 6 -> System.out.println("6");
            default -> System.out.println("number is above 6");
        }
    }
}
