import java.util.Scanner;

public class ArrayInsertData {
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
        System.out.println("Enter the Date :");
        int element = input.nextInt();

        size++;

        for(int k =size; k>=ind;k--){
            arr[k] = arr[k-1];
        }
        arr[ind] = element;
        System.out.println("Output of the array summery :");
        for(int j = 0 ; j <size; j++){
            System.out.println(arr[j]);
        }
    }
}
