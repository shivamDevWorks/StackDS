package implementation.stackapplications;

public class TwoStackInOneArray{
    private int n;
    private Integer[] arr;
    private int top1,top2;
    public TwoStackInOneArray(int n){
        this.n=n;
        arr=new Integer[n];
        top1=-1;
        top2=n;
    }

    public boolean push1(int ele){
        if(top1<top2-1){
            arr[++top1]=ele;
            return true;
        }
        return false;
    }

    public boolean push2(int ele){
        if(top1 < top2-1){
            arr[--top2]=ele;
            return true;
        }
        return false;
    }

    public int size1(){
        return top1+1;
    }

    public int size2(){
        return n-top2;
    }

    public boolean isEmpty1(){
        return top1==-1;
    }
    public boolean isEmpty2(){
        return top2==n;
    }

    public Integer peek1(){
        if(top1==-1){
            return null;
        }
        return arr[top1];
    }

    public Integer peek2(){
        if(top2==n){
            return null;
        }
        return arr[top2];
    }

    public Integer pop1(){
        if(top1==-1){
            return null;
        }
        return arr[top1--];
    }

    public Integer pop2(){
        if(top2==n){
            return null;
        }
        return arr[top2++];
    }


    public void printStack(){
        System.out.print("Stack1::");
        for(int i=0;i<=top1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("Stack2::");
        for(int i=n-1;i>=top2;i--){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

    }

}
