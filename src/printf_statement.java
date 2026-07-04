public class printf_statement {
    public static void main(String[] args) {
        String name = "Abhinav Aby";
        char firstLetter = 'A';
        int age = 19;
        double height = 60.3;
        boolean isEmployed = true;
        System.out.printf("Hello %s , your first name is %c and you are %d years old\n", name, firstLetter, age);
        System.out.printf("Your height is %.2f\n", height);

        if (isEmployed) {
            System.out.printf("you are employed == %b\n", isEmployed);
        }
        else {
            System.out.printf("you are not employed\n");
        }


        System.out.printf("\n");

        double c1 = 32.22;
        double c2 = 42000.22;
        double c3 = -32.22;
        double c4 = 44.2;
        double c5 = -44.2;

        System.out.printf("%+.2f\n",c1);
        System.out.printf("%+,.2f\n",c2);
        System.out.printf("% .2f\n",c3);
        System.out.printf("% .2f\n",c4);
        System.out.printf("% .2f\n",c5);


        System.out.println(" ");



        int id1 = 1;
        int id2 = 23;
        int id3 = 345;
        int id4 = 4567;

        System.out.printf("%04d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%04d\n",id4);
    }
}
