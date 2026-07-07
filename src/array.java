import java.util.Arrays;


public class array {
    public static void main(String[] args) {
        String[] fruits = {"apple","banana","orange"};
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);

        System.out.println(" ");

        for(int i = 0; i < fruits.length; i++){
            fruits[i] = fruits[i].toUpperCase();
            System.out.println(fruits[i]);
        }

        System.out.println(" ");

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println(" ");
        int[] num = {6,2,7,3,2,4,1};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        Arrays.fill(num,0);
        System.out.println("after filling with 0 : "+ Arrays.toString(num));
    }
}
