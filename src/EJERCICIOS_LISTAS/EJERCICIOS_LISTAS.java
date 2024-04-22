package EJERCICIOS_LISTAS;

import EJERCICIOS_LISTAS.PUNTO5.CircularDoubleLinkedList;
import EJERCICIOS_LISTAS.PUNTO5.Metodo;
import EJERCICIOS_LISTAS.PUNTOS_1to4.Metodos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EJERCICIOS_LISTAS {
    public static void main(String[] args) {

        Metodos metodos = new Metodos();
        Metodo metodo = new Metodo();

        CircularDoubleLinkedList circularDoubleLinkedList = new CircularDoubleLinkedList();
        circularDoubleLinkedList.insert(1);
        circularDoubleLinkedList.insert(2);
        circularDoubleLinkedList.insert(3);
        circularDoubleLinkedList.insert(4);
        circularDoubleLinkedList.insert(5);
        circularDoubleLinkedList.insert(6);
        circularDoubleLinkedList.insert(7);
        circularDoubleLinkedList.insert(8);
        circularDoubleLinkedList.insert(9);
        circularDoubleLinkedList.insert(10);
        CircularDoubleLinkedList circularDoubleLinkedList1 = new CircularDoubleLinkedList();
        circularDoubleLinkedList1.insert(11);
        circularDoubleLinkedList1.insert(12);
        circularDoubleLinkedList1.insert(13);
        circularDoubleLinkedList1.insert(14);
        circularDoubleLinkedList1.insert(15);
        circularDoubleLinkedList1.insert(16);
        circularDoubleLinkedList1.insert(17);
        circularDoubleLinkedList1.insert(18);
        circularDoubleLinkedList1.insert(19);
        circularDoubleLinkedList1.insert(20);

        System.out.println("BIGINTEGER: "+metodo.multiply(circularDoubleLinkedList1,circularDoubleLinkedList1));



        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        List<Integer> list2 = new ArrayList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(10);
        list3.add(20);
        list3.add(30);
        list3.add(40);
        list3.add(50);

        metodos.Mezcla2(list1,list2);
        metodos.imprimeInverso(list3,3);
        System.out.println("SUMA RECURSIVA "+ metodos.sumaRecursiva(list1));
        System.out.println("LA POSICION ES: "+ metodos.buscarXenLinkedList(list3,30));



    }
}