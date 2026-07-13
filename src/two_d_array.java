import java.util.Arrays;

public class two_d_array {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "orange", "kiwi"};
        String[] colors = {"red", "green", "blue", "brown"};
        String[] vegitables = {"papaya", "tomato", "capsicum", "potato"};





        String[][] goceries ={fruits, colors, vegitables};
        System.out.println(Arrays.deepToString(goceries));
        System.out.println(" ");

        for(String[] foods : goceries){
            System.out.println(Arrays.toString(foods));
        }
        System.out.println(" ");

        for(String[] foods : goceries){

            for(String food : foods){
                System.out.print(food+"  ");
            }
            System.out.println();
        }

        System.out.println(" "  );
        goceries[0][0]= "pineapple";
        System.out.println("array after some change: "+Arrays.deepToString(goceries));

    }
}
