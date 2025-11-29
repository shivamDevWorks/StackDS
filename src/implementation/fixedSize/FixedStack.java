package implementation.fixedSize;

import implementation.stackExceptions.MyStackEmptyException;
import implementation.stackExceptions.MyStackOverflowException;

public class FixedStack {
    private int arr[];
    private int capacity;
    private int top;

    public FixedStack(int capacity){
        this.capacity = capacity;
        arr=new int[capacity];
        top = -1;
    }

    public void push(int e){
        if(top==(capacity-1)){
            throw new MyStackOverflowException("FixedStack :: Stack Overflow Exception! Stack size is full. Element:"+e+" cannot be pushed");
        }

        arr[++top]=e;
    }

    public int peek(){
        if(top==-1){
            throw new MyStackEmptyException("FixedStack ::Stack is Empty! peek() operation can't be performed.");
        }
        return arr[top];
    }

    public int pop(){
        if(top==-1){
            throw new MyStackEmptyException("FixedStack ::Stack is Empty! pop() operation can't be performed.");
        }
        int poppedElement = arr[top];
        top--;
        return poppedElement;
    }

    public int size(){
        return top+1;
    }

    public boolean isEmpty(){
        return top == -1;
    }


}
