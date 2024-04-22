package EJERCICIOS.EJERCICIOS_LISTAS.PUNTO5;

import org.jetbrains.annotations.NotNull;

import java.math.BigInteger;

public class Metodo {

    public BigInteger multiply(CircularDoubleLinkedList circularDoubleLinkedList,
                               CircularDoubleLinkedList circularDoubleLinkedList1) {
        BigInteger firstNumber = iterateNodes(circularDoubleLinkedList);
        BigInteger secondNumber = iterateNodes(circularDoubleLinkedList1);

        return firstNumber.multiply(secondNumber);
    }

    public BigInteger iterateNodes(@NotNull CircularDoubleLinkedList circularDoubleLinkedList) {
        if (circularDoubleLinkedList.getHead() == null) {
            return BigInteger.ZERO;
        }
        Node current = circularDoubleLinkedList.getHead();
        StringBuilder number = new StringBuilder();
        do {
            number.append(current.data);
            current = current.next;
        } while (current != circularDoubleLinkedList.getHead());

        return new BigInteger(number.toString());
    }
}
