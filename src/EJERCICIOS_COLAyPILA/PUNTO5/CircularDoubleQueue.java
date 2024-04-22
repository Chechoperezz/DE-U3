package EJERCICIOS_COLAyPILA.PUNTO5;

import java.util.NoSuchElementException;

public class CircularDoubleQueue {
    Node rear;

    public CircularDoubleQueue() {
        this.rear = null;
    }

    public void insertFront(int Data){
        Node node = new Node(Data);
        if (rear==null){
            rear = node;
            rear.next=rear;
            rear.prev=rear;
        }else {
            Node front = rear.next;
            node.next = front;
            node.prev = rear;
            front.prev = node;
            rear.next = node;
        }
    }

    public void insertBack(int Data){
        Node node = new Node(Data);
        if (rear==null){
            rear=node;
            rear.next=node;
            rear.prev=node;
        }else {
            Node front = rear.next;
            node.next = front;
            node.prev = rear;
            front.prev = node;
            rear.next = node;
            rear = node;
        }
    }

    public int deleteBack() {
        if (rear == null) {
            throw new NoSuchElementException("Queue is empty");
        }

        Node front = rear.next;
        int data = rear.data;
        if (front == rear) {
            rear = null;
        } else {
            Node newRear = rear.prev;
            newRear.next = front;
            front.prev = newRear;
            rear = newRear;
        }

        return data;
    }

    public int deleteFront() {
        if (rear == null) {
            throw new NoSuchElementException("Queue is empty");
        }

        Node front = rear.next;
        int data = front.data;
        if (front == rear) {
            rear = null;
        } else {
            rear.next = front.next;
            front.next.prev = rear;
        }

        return data;
    }

    public void display() {
        if (rear == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node current = rear.next;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != rear.next);
        System.out.println();
    }
}

