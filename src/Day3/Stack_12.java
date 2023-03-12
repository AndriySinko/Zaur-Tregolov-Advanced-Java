package Day3;

import java.util.Stack;

public class Stack_12 {
    /**
     * Stack - наследник класса Вектор тоже synchronized и тоже не рекомендован в использовании
     */
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Andriy");
        stringStack.push("Anton");
        stringStack.push("Katya");
        stringStack.push("Misha");
        System.out.println(stringStack);
        while (!stringStack.isEmpty()){
            System.out.println(stringStack.pop());
            System.out.println(stringStack);
        }
        System.out.println();

        stringStack.push("Petr");
        stringStack.push("Ivan");
        stringStack.push("Nastya");
        stringStack.push("Vika");
        for (int i =0; i<4 ;i++){
            System.out.println(stringStack.peek());
            System.out.println(stringStack);
            System.out.println(stringStack.pop());
        }
    }
}
