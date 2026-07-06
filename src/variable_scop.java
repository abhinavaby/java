public class variable_scop {
    static int w = 2; // class variable
    public static void main(String[] args) {
        int x = 1; //local variable
        System.out.println("x = " + x);
        System.out.println("w ="+w);
        System.out.println(" ");
        dosomething();
    }
    static void dosomething(){
        int x = 2; //local variable
        System.out.println("x = " + x);
        System.out.println("w ="+w);
    }
}
