import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("enter your age: ");
        age = sc.nextInt();

        if(age >= 0 && age <= 100) {
            if(age >= 10 && age <= 25) {
                System.out.println("your age is " + age + " years old");
                System.out.println("you are young");
            }
            else{
                System.out.println("welcome");
            }
        }
        else if(age >= 60 && age <= 100) {
            System.out.println("your age is " + age + " years old");
            System.out.println("you are old");

        }
        else{
            System.out.println("enter a valid age");
        }

    }
}
