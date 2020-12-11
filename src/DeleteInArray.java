import java.util.Arrays;
import java.util.Scanner;

public class DeleteInArray {
    public static void main(String[] args) {
        int[] array= {7,3,5,7,7};
        Scanner input_number = new Scanner(System.in);
        System.out.println("Enter number to check in array: ");
        int number = input_number.nextInt();
        delInArray(array,number);
    }

    public static void delInArray(int[]array,int num){
        int index_del;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num){
                index_del= i;
                for (int j = index_del; j <= array.length-1; j++) {
                    array[index_del]= 0;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
