package EJERCICIOS_LISTAS.PUNTO5;

import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;

public class Metodo {



    //RECIBE DOS LISTAS CIRCULARES DOBLEMENTE ENLAZADAS
    public BigInteger multiply(CircularDoubleLinkedList circularDoubleLinkedList,
                               CircularDoubleLinkedList circularDoubleLinkedList1) {

        //SE LLAMA EL METODO PARA ITERAR Y OBTENER EL NUMERO REPRESENATDO
        BigInteger firstNumber = iterateNodes(circularDoubleLinkedList);
        BigInteger secondNumber = iterateNodes(circularDoubleLinkedList1);

        //YA QUE ES UN NUMERO MUY GRANDE, NO SE PUEDE MULTIPLICAR CONVENCIONALMENTE(A *B)
        // BigInteger tiene un metodo para realizar ese tipo de operaciones
        return firstNumber.multiply(secondNumber);
    }

    public BigInteger iterateNodes(@NotNull CircularDoubleLinkedList circularDoubleLinkedList) {
        if (circularDoubleLinkedList.getHead() == null) {
            return BigInteger.ZERO;
        }
        Node current = circularDoubleLinkedList.getHead();
        StringBuilder number = new StringBuilder();
        do {
            //Append agrega el primer elemento en la ultima "posicion" de el String
            number.append(current.data);

            /*
            Mientras que el siguiente nodo no apunte al primero, se continua iterando.
            Current.next es el siguiente nodo.
             */
            current = current.next;
        } while (current.next != circularDoubleLinkedList.getHead());

        //SE CONVIERTE EL STRING A BIGINTEGER PARA PODER OPERARLO
        return new BigInteger(number.toString());
    }
}
