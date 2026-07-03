import java.util.Scanner;


public class user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter your name: ");
        String name = sc.nextLine();



        System.out.print("enter your age: ");
        int age = sc.nextInt();


        System.out.println("enter your cgpa: ");
        double cgpa = sc.nextDouble();


        System.out.println("enter the age: ");
        int age2 = sc.nextInt();


        System.out.println("are you happy: ");
        boolean happy = sc.nextBoolean();


        System.out.println("it takes only first name: ");
        String firstName = sc.next();



        System.out.println(name+"   "+age);
        System.out.println("first name is "+firstName);
        System.out.println("age is "+age2);
        System.out.println("cgpa is "+cgpa);
        System.out.println("happy is "+happy);

        sc.close();

    }
}
