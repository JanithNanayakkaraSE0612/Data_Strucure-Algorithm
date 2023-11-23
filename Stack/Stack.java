package Stack;

public class Stack {
    private int[] elementData;
    private int top; // point to the top of the stack

    public Stack (final int initialCapacity){
        elementData = new int[initialCapacity];
        top = -1;
    }
    public void push(int data){
            elementData[++top] = data;
    }
    public void printStack(){
        System.out.print("[");
        for(int i =0; i<=top;i++){
            System.out.print(elementData[i] + ", ");
        }
        System.out.print("\b\b]");
    }
}
