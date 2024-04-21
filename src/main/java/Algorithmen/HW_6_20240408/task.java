package Algorithmen.HW_6_20240408;
//
// 1 уровень сложности: 1) Создать MyLinkedList объект.
// Создать искусственно петлю в связном списке.
// Написать метод detectLoop, который проверяет, есть ли петля в MyLinkedList.

public class task {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        // Add some nodes to the list
        list.addToHead(10);
        list.addToHead(20);
        list.addToHead(30);

        list.createLoop();

        // Check for the loop
        boolean isLoopPresent = list.detectLoop();
        if (isLoopPresent) {
            System.out.println("Loop found in the linked list!");
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }

}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;

    public void addToHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void createLoop() {
        Node third = head;
        for (int i = 0; i < 2; i++) {
            third = third.next;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = third;
    }

    public boolean detectLoop() {
        // Using Floyd method, for detected loop.
        Node slow = head;
        Node fast = head.next;

        while (slow != null && fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // Loop detected
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return false; // No loop detected
    }
}



