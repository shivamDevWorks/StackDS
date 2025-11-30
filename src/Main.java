import implementation.arraybased.DynamicStack;
import implementation.arraybased.FixedStack;
import implementation.linkedlistbased.GenericStack;
import implementation.stackapplications.TwoStackInOneArray;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TwoStackInOneArray
        TwoStackInOneArray twoStack=new TwoStackInOneArray(10);
        for(int i=1;i<=10;i++){
            twoStack.push1(10*i);
        }
        twoStack.printStack();
        System.out.println("stack1::"+twoStack.peek1());
        System.out.println("stack2::"+twoStack.peek2());
        for(int i=1;i<=10;i++){
            twoStack.pop1();
            twoStack.push2(20*i);
        }
        twoStack.printStack();
        System.out.println("size2::"+twoStack.size2());
        System.out.println("size1::"+twoStack.size1());



    }
}
