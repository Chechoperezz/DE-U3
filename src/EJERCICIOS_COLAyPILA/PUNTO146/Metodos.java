package EJERCICIOS_COLAyPILA.PUNTO146;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Metodos {
    public int numeroDeObjetosEnQueue(@NotNull Queue<Integer> queue) {
        return queue.size();
    }

    public void infixToPostFix(@NotNull String expression) {
        //SE UTILIZO EL ALGORITMO DE SHUNTING YARD
        Stack<Character> sings = new Stack<>(); //STACK PARA SIGNOS
        Queue<Character> result = new LinkedList<>(); // STACK PARA NUMEROS/EXPRESION CONVERTIDA

        for (int i = 0; i < expression.length(); i++) {
            char S = expression.charAt(i);
            if (Character.isLetterOrDigit(S)) {
                result.offer(S);  // CHAR ES NUMERO/LETRA SE AÑADE AUTOMATICAMENTE A LA QUEUE
            } else if (S == '(') {
                sings.push(S);  // SI ES UN "(", SE AÑADE AL STACK
            } else if (S == ')') {
                while (!sings.isEmpty() && sings.peek() != '(') {   //SE BUSCA EL PARENTESIS "ABRIDOR" EN EL STACK
                    result.offer(sings.pop());  //MIENTRAS ESO SUCEDE LOS SIGNOS SE AÑADEN A LA QUEUE
                }
                sings.pop();  //SE ELIMINA EL "ABRIDOR DEL STACK UNA VEZ ENCONTRADO
            } else  {
                while (!sings.isEmpty() && importance(sings.peek()) >= importance(S)) {
                    /*
                    SI ES UN SIGNO Y LA LISTA NO ESTA VACIA
                    1. SE BUSCA EL SIGNO CON MAYOR IMPORTANCIA DENTRO DEL STACK
                       ANQADIENDOLO AL QUEUE.
                     */
                    result.add(sings.pop());
                }
                //SI LA IMPORTANCIA ES MENOR Y LA LISTA ESTA VACIA , SE AÑADE AL STACK
                sings.push(S);
            }
        }

        //ESTO ASEGURA QUE NO SE OMITAN SIGNOS
        while (!sings.isEmpty()) {
            result.offer(sings.pop());
        }

        StringBuilder postfixExpression = new StringBuilder();
        for (char c : result) {
            postfixExpression.append(c);
        }

        System.out.println("Postfix expression: " + postfixExpression.toString());
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
