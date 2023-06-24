
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    // Метод разворота списка
    void reverse() {
        Node current = head;
        Node previous = null;
        Node next = null;

        while (current != null) {
            next = current.next; // Сохраняем ссылку на следующий элемент
            current.next = previous; // Переставляем ссылку на предыдущий элемент
            previous = current; // Обновляем предыдущий элемент
            current = next; // Переходим к следующему элементу
        }

        head = previous; // Обновляем голову списка
    }

    // Метод для добавления элемента в начало списка
    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Метод для отображения списка
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(3);
        linkedList.push(7);
        linkedList.push(1);
        linkedList.push(9);

        System.out.println("Исходный список:");
        linkedList.display();

        linkedList.reverse();

        System.out.println("Развернутый список:");
        linkedList.display();
    }
}
