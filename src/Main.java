import implementation.dynamicize.MyStack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyStack stack=new MyStack();
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
    }
}
