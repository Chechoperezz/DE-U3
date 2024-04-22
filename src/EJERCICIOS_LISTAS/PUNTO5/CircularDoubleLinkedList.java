package EJERCICIOS_LISTAS.PUNTO5;

public class CircularDoubleLinkedList {
    private Node head; //PRIMER NODO DE LA LISTA ENLAZADA
    private Node tail; // ULTIMO NODO DE LA LISTA ENLAZADA

    public CircularDoubleLinkedList() {

        //INICIALMENTE LA LISTA ESTA VACIA , ES DECIR, LOS NODOS NO APUNTAN A NADA
        this.head = null;
        this.tail = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) { // SI LA LISTA NO TIENE HEAD/PRIMER NODO
            head = newNode;  // SE LE ASIGNA HEAD/PRIMER NODO , CON EL NODO CREADO
            tail = newNode; // SE LE ASIGNA TAIL/COLA EL MISMO NODO

            // HEAD/PRIMER NODO APUNTA A SI MISMO
            head.next = head;
            head.prev = head;
        } else { // SI YA TIENE TAIL/COLA
            tail.next = newNode; // SE CREA UN NUEVO NODO CON . NEXT
            newNode.prev = tail; // EL NUEVO NODO APUNTA A LA ANTERIOR COLA
            newNode.next = head; // EL NUEVO NODO APUNTA AL PRIMER NODO
            head.prev = newNode; // EL PRIMER ELEMENTO APUNTA A LA NUEVA COLA
            tail = newNode; // POR EXTENSION EL ULTIMO NODO INSERTADO SE CONVIERTE EN LA COLA
        }
    }



    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
}
