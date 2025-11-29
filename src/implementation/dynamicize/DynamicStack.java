package implementation.dynamicize;

import implementation.stackExceptions.MyStackEmptyException;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class DynamicStack {
    private ArrayList<Integer> al;

    public DynamicStack(){
        al=new ArrayList<>();
    }

    public void push(int x){
        al.add(x);
    }

    public int pop(){

        if(al.isEmpty()){
            throw new MyStackEmptyException("DynamicStack ::Stack is empty! Invalid pop operation");
        }
        int top=al.get(al.size()-1);
        al.remove(al.size()-1);
        return top;
    }

    public boolean isEmpty(){
        return al.isEmpty();
    }

    public int size(){
        return al.size();
    }

    public int peek(){
        if(al.isEmpty()){
            throw new MyStackEmptyException("DynamicStack ::Stack is empty! Invalid peek() operation.");
        }
        return al.get(al.size()-1);
    }
}
