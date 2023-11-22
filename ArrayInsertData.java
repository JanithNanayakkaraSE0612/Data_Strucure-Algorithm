import java.util.Scanner;

public class ArrayInsertData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr [] = new int[5];
        int size=5;
        System.out.println("Data input :");
        for(int i = 0 ; i <size; i++){
            arr[i] = input.nextInt();
        }
        for(int j = 0 ; j <size; j++){
            System.out.println(arr[j]);
        }
    }
}
