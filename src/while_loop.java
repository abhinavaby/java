import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        while (name.isEmpty()){
            System.out.print("Please enter your name: ");
            name = sc.nextLine();





        }
        System.out.println("hello "+name);
        sc.close();


        System.out.println(" ");
        System.out.println("numbers 10 to 1: ");

        int n = 10;
        while(n<11 && n!=0){
            System.out.println(n);
            n--;
        }

    }
}
