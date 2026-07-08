import java.util.Arrays;

public class vararg {
    public static void main(String[] args) {
        add(1,2,34,4);

    }
    static void add(int...numbers){
        System.out.println(Arrays.toString(numbers));
        System.out.print("sum = ");
        int n = 0;
        for(int number : numbers){
            n=n+number;


        }
        System.out.println(n);
    }

}
