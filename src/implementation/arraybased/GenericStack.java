package implementation.arraybased;

import implementation.stackExceptions.MyStackEmptyException;

import java.util.ArrayList;

public class GenericStack <T>{
    private ArrayList<T> arr;

    public GenericStack(){
        arr=new ArrayList<>();
    }

    public void push(T val){
        arr.add(val);
    }

    public T pop(){
        if(arr.isEmpty()){
            throw new MyStackEmptyException("Stack is empty! Pop() operation is invalid.");
        }

        return arr.remove(arr.size()-1);
    }

    public T peek(){
        if(arr.isEmpty()){
            throw new MyStackEmptyException("Stack is empty! Invalid peek() operation.");
        }
        return arr.get(arr.size()-1);
    }

    public boolean isEmpty(){
        return arr.isEmpty();
    }

    public int size(){
        return arr.size();
    }

    @Override
    public String toString(){
        return arr.toString();
    }
}
