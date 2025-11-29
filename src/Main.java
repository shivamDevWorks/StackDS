import implementation.arraybased.DynamicStack;
import implementation.arraybased.FixedStack;
import implementation.linkedlistbased.GenericStack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GenericStack<String> stack=new GenericStack<>();
        stack.push("shivam");
        stack.push("rahul");
        stack.push("raghav");
        System.out.println(stack.toString());
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        System.out.println(stack.toString());
        stack.pop();
        stack.pop();//will throw exception
    }
}
