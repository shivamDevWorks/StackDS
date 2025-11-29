package implementation.linkedlistbased;

public class Node <T>{
    protected T val;
    protected Node<T> nextNode;// protected because inside package and its subclass can use it directly with '.' operator
    protected Node<T> prevNode;

    public Node(T val){
        this.val = val;
        this.nextNode = null;
        this.prevNode = null;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node<T> prevNode) {
        this.prevNode = prevNode;
    }

    @Override
    public String toString(){
        return this.val.toString();
    }
}
