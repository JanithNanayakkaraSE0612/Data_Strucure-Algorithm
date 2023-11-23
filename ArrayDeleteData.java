import java.util.Scanner;

public class ArrayDeleteData {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int arr [] = new int[10];
        int size=5;
        System.out.println("Data input :");
        for(int i = 0 ; i <size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Output of the array :");
        for(int j = 0 ; j <size; j++){
            System.out.println(arr[j]);
        }
        System.out.println("Enter the Index :");
        int ind = input.nextInt();

        for(int k =ind; k<size;k++){
            arr[k] = arr[k+1];
        }
        size--;
         System.out.println("Output of the array :");
        for(int j = 0 ; j <size; j++){
            System.out.println(arr[j]);
        }
    }
}
