import java.util.Scanner;
public class UserInputArray {
    public static void main(String[] args) {
        int arr [] = new int[5];
        int size = 5;
        Scanner input = new Scanner(System.in);
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        for(int j = 0; j<size;j++){
            System.out.println(arr[j]);
        }

    }
}
