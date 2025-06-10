public class StackMain {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.print("Custom Stack is :- " + stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println("Custom stack after the POP operations" + stack);

    }
}
