package Arrays;

import java.util.Stack;

public class ImplementStack {
    int arr[];
    int top;
    int capacity;

    public ImplementStack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int num){
        if(top == capacity -1){
            System.out.println("Stack over flow");
            return;
        }
        arr[++top] = num;
    }

    public int pop(){
        if(top ==-1){
            System.out.println("Stack under flow");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if(top == -1){
            System.out.println("stack is empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public int size(){
        return top+1;
    }

    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.peek());

        System.out.println(stack.isEmpty());
    }
}
