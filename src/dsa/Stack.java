package dsa;

public class Stack {
    private int[] arr;
    private int top;

    public Stack(int size){
        arr = new int[size];
        top = -1;
    }

    public void push( int val ) {
        if ( top == arr.length ) {
            System.out.println("LIMIT REACHED");
            return;
        }
        arr[++top] = val;
    }

    public void pop() {
        if ( isEmpty() ) {
            System.out.println("NO ELEMENT TO POP");
            return;
        }
        top--;
    }

    public int peek() {
        if ( isEmpty() ) {
            System.out.println("NO ELEMENT To PEEK");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}