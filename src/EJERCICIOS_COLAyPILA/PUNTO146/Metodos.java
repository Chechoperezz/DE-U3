package EJERCICIOS.EJERCICIOS_COLAyPILA.PUNTO146;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Metodos {
    public int numeroDeObjetosEnQueue(@NotNull Queue<Integer> queue) {
        return queue.size();
    }

    public void infixToPostFix(@NotNull String expression) {
        Stack<Character> sings = new Stack<>();
        Queue<Character> result = new LinkedList<>();

        for (int i = 0; i < expression.length(); i++) {
            char S = expression.charAt(i);
            if (Character.isLetterOrDigit(S)) {
                result.offer(S);
            } else if (S == '(') {
                sings.push(S);
            } else if (S == ')') {
                while (!sings.isEmpty() && sings.peek() != '(') {
                    result.offer(sings.pop());
                }
                sings.pop();
            } else  {
                while (!sings.isEmpty() && importance(sings.peek()) >= importance(S)) {
                    result.add(sings.pop());
                }
                sings.push(S);
            }
        }

        while (!sings.isEmpty()) {
            result.offer(sings.pop());
        }


        String postfixExpression = result.toString();
        System.out.println("Postfix expression: " + postfixExpression);
    }

    public String postfixToInfix(@NotNull String expression) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String operando2 = stack.pop();
                String operando1 = stack.pop();
                String infix = "(" + operando1 + c + operando2 + ")";
                stack.push(infix);
            }
        }

        return stack.pop();
    }

   public int importance(@NotNull Character Char){
        switch (Char){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }

   }




}
