import implementation.dynamicize.DynamicStack;
import implementation.fixedSize.FixedStack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DynamicStack stack=new DynamicStack();
        try{
            stack.push(5);
            stack.push(9);
            System.out.println(stack.peek());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.peek());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            FixedStack fixedStack = new FixedStack(10);
            fixedStack.push(1);
            fixedStack.push(5);
            System.out.println(fixedStack.pop());
            System.out.println(fixedStack.pop());
            fixedStack.peek();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
