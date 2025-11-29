package implementation.linkedlistbased;

import implementation.Constants;
import implementation.stackExceptions.MyStackEmptyException;

public class GenericStack <T>{
    private Node<T> head;
    private int size;

    public GenericStack(){
        this.head = null;
        this.size =0;
    }

    public void push(T val){
        Node<T> temp=new Node<>(val);
        temp.nextNode = head;
        head = temp ;
        size++;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public T peek(){
        if(head==null){
            throw new MyStackEmptyException(Constants.EMPTY_STACK_PEEK_OPERATION_ERROR);
        }
        return head.val;
    }

    public T pop(){
        if(head==null){
            throw new MyStackEmptyException(Constants.EMPTY_STACK_POP_OPERATION_ERROR);
        }
        T topEle = head.val;
        head = head.nextNode;
        size--;
        return topEle;
    }

    @Override
    public String toString(){

        if(head == null){
            return "Top->null";
        }
        StringBuilder sb=new StringBuilder("Top->");
        Node<T> curr=head;

        while(curr!=null){
            sb.append(curr.val);
            if(curr.nextNode!=null){
                sb.append("->");
            }
            curr=curr.nextNode;
        }
        sb.append("->null");
        return sb.toString();
    }
}
