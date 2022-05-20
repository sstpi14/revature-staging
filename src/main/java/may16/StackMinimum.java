package may16;

import java.util.Stack;

public class StackMinimum {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> minStack = new Stack<>();

        popItem(st, minStack);

        pushItem(st, minStack, 27);
        pushItem(st, minStack, 77);
        pushItem(st, minStack, 20);
        pushItem(st, minStack, 34);
        pushItem(st, minStack, 54);
        pushItem(st, minStack, 14);
        pushItem(st, minStack, 62);
        pushItem(st, minStack, 48);
        pushItem(st, minStack, 33);
        pushItem(st, minStack, 9);

        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(min(minStack));
        popItem(st, minStack);
        popItem(st, minStack);

        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(minStack);
        System.out.println(min(minStack));
    }

    static void pushItem(Stack<Integer> mainStack, Stack<Integer> minElStack, Integer element) {
        mainStack.push(element);
        if (minElStack.isEmpty() || minElStack.peek() >= element) {
            minElStack.push(element);
        }
    }

    static void popItem(Stack<Integer> mainStack, Stack<Integer> minElStack) {
        if(mainStack.isEmpty()) {
            System.out.println("Nothing on the stack");
            return;
        }
        int value = mainStack.pop();

        if(minElStack.peek() == value) {
            minElStack.pop();
        }
    }

    static Integer min(Stack<Integer> minElStack) {
        return minElStack.peek();
    }
}
