package EJERCICIOS_COLAyPILA;


import EJERCICIOS_COLAyPILA.PUNTO146.Metodos;
import EJERCICIOS_COLAyPILA.PUNTO5.CircularDoubleQueue;

import java.util.LinkedList;
import java.util.Queue;

public class EJERCICIOS_COLAyPILA {
    public static void main(String[] args) {

        Metodos metodos = new Metodos();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println("NUMERO DE OBJETOS EN QUEUE : "+ metodos.numeroDeObjetosEnQueue(queue));

        System.out.println();

        System.out.println("INFIJA A POSTFIJA");
        metodos.infixToPostFix("(x+y)*(z^(s+t)+u)-v");

        System.out.println();

        System.out.println("QUEUE CIRCULAR");
        CircularDoubleQueue circularDoubleQueue = new CircularDoubleQueue();
        circularDoubleQueue.insertBack(1);
        circularDoubleQueue.insertBack(2);
        circularDoubleQueue.insertBack(3);

        circularDoubleQueue.display();

        circularDoubleQueue.deleteFront();
        circularDoubleQueue.display();

        circularDoubleQueue.insertFront(4);
        circularDoubleQueue.insertFront(5);
        circularDoubleQueue.display();

        circularDoubleQueue.deleteBack();

        circularDoubleQueue.display();

    }
}