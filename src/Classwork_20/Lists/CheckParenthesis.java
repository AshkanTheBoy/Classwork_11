package Classwork_20.Lists;

import java.util.Stack;

public class CheckParenthesis {

    public static void main(String[] args) {
        //String s = "(1*[2+3]);"; //Правильное выражение
        //String s = "2+3]);"; //Только закрывающие скобки
        String s = "[(2+3]);"; //Несоответствующие скобки

        String parenthesis = "(){}[]";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = parenthesis.indexOf(c);
            if (index!=-1){
                if (index%2==0){
                    stack.push(c);
                } else {
                    if (stack.empty()){
                        System.out.println("Err");
                        break;
                    } else {
                        char c2 = stack.peek();
                        int index2 = parenthesis.indexOf(c2);
                        if (index-index2==1){
                            stack.pop();
                        } else {
                            System.out.println("Err");
                        }
                    }
                }
            }
        }
        if (!stack.empty()) {
            System.out.println("Err");
        }
    }
}
