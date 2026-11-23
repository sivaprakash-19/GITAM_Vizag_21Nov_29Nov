package Day3;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static Node buildList() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter head data : ");
        int data = sc.nextInt();
        if(data == -1)
            return null;
        Node head = new Node(data);
        Node tail = head;
        while(true) {
            System.out.print("Enter node data : ");
            data = sc.nextInt();
            if(data == -1) {
                return head;
            }
            Node n1 = new Node(data);
            tail.next = n1;
            tail = n1;
        }
    }
    public static void printList(Node head) {
        if(head == null)
            return;
        System.out.print(head.data + " -> ");
        printList(head.next);
    }

    public static void main(String[] args) {
        Node head = buildList();
        printList(head);
        System.gc();

        /*
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        n1.next = n2;
        n2.next = n3;
        Node temp = n1;
        while(temp != null) {
            System.out.println(temp + " " + temp.data + " " + temp.next);
            temp = temp.next;
        }
        System.out.println(n1);
         */

        /*
        System.out.println("Before s1 -> " + Student.count);
        Student s1 = new Student("Abc", "Vizag, AP");
        System.out.println("After s1 -> " + Student.count);
        Student s2 = new Student("Def", "Vizag, AP");
        System.out.println("After s2 -> " + Student.count);
        s1.printStudent();
        s2.printStudent();
         */
    }
}
