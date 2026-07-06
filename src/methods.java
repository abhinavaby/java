import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        methods = reusable code
        System.out.print("enter your name: ");
        String name = sc.nextLine();
        System.out.print("enter your age: ");
        int age = sc.nextInt();
        happubirthday(name,age);

        System.out.println(" ");

        System.out.print("enter the number to be squared: ");
        int squared = sc.nextInt();
        double sqr = square(squared);
        System.out.println("square of "+squared+" is "+sqr);


    }
    static void happubirthday(String name,int age){
        System.out.println(" ");
        System.out.printf("happy birth day to you\nyour are %d years old\nhappy birth day to you %s\n",age,name);
    }

    // method for squaring a number
    static double square(double x){
        return x*x;
    }
}
