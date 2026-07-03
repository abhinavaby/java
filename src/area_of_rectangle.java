import  java.util.Scanner;


public class area_of_rectangle {
    public static void main(String[] args) {
        double length = 0.0;
        double width = 0.0;


        Scanner sc = new Scanner(System.in);
        System.out.print("enter length: ");
        length = sc.nextDouble();
        System.out.print("enter width: ");
        width = sc.nextDouble();


        System.out.println("area = "+ length*width+" cm^2");

        sc.close();
    }
}
