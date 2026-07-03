public class variables {
    public static void main(String[] args) {
        // 🟩 variable = a reusable container for a value
        //     a variable behaves as if it was the value it contains

        // 🟥 Primitive = simple value stored directly in memory (stack)
        // 🟦 Reference = memory address (stack) that points to the (heap)

        // 🟥 Primitive vs 🟦 Reference
        // ------------------     ------------------
        // int                    String
        // double                 Array
        // char                   Object
        // boolean

        // 2 Steps to creating a variable
        // ------------------------------
        // 1. Declaration
        // 2. Assignment

        int age;
        age=18;
        int value =21;
        System.out.println(value);
        System.out.println("the age is "+age);


        System.out.println("");



        double gpa = 9.21;
        double temp = 22.23;
        double price = 20.333;
        System.out.println("$ "+ price);


        System.out.println("");


        char grade = 'A';
        char symbol = '#';
        System.out.println("the grade is "+grade);
        System.out.println("the symbol is "+symbol);


        System.out.println("");


        boolean flag = true;
        boolean flag2 = true;
        boolean flag3 = false;
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag);


        System.out.println("");


        String str1 = "hello";
        String str2 = "hello guys";
        System.out.println(str1+", "+str2);
    }


}
