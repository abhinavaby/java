import java.util.Scanner;

public class searching_elements_in_array {
    public static void main(String[] args) {
        int[] num = {1, 4, 3, 2, 5, 6, 34};
        int target = 33;
        boolean flag = false;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                System.out.println("element found at index: " + i);
                flag = true;
                break; // Stop searching once found
            }
        }

        if (flag == false) {
            System.out.println("element not found");
        }
    }
}
