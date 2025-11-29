package implementation.arraybased;

import implementation.Constants;
import implementation.stackExceptions.MyStackEmptyException;

import java.util.ArrayList;

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
            throw new MyStackEmptyException(Constants.EMPTY_STACK_POP_OPERATION_ERROR);
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
            throw new MyStackEmptyException(Constants.EMPTY_STACK_PEEK_OPERATION_ERROR);
        }
        return al.get(al.size()-1);
    }
}
