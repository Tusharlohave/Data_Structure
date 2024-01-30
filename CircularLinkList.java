// Java program to implement Circular link list

import java.util.Scanner;


public class CircularLinkList {
   
    static class node {                                               // Create node type of datatype or structure
        int data;
        node next;

        node(int data) {                                            // Assigning value to variables in node
            this.data = data;
            this.next = null;
        }
    }

    node head = null;
    node tail = null;

    public void Creation() {                                    // Creation method of Link list
        int data, n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Data :");
            data = sc.nextInt();
            node new_node = new node(data);

            if (head == null) {
                head = new_node;
                tail = new_node;
            } else {
                new_node.next = head;
                tail.next = new_node;
                head = new_node;
            }

            System.out.println("Do you want to add node, if yes press : 1, if not press another number");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void Traverse() {                                // Display or Traverse method in link list
        node temp = head;

        if (head == null) {
            System.out.println("Link list does not exist");
        } else {
            while (temp != head) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public void Deletion() {                            // Deletion method in link list
        int data, n, a, p;
        Scanner sc = new Scanner(System.in);
        do {
            if (head == null) {
                System.out.println("Link list does not exist");
            } else {
                System.out.println(
                        "Enter 1 to delete item from begining\n Enter 2 to delete item from End\n Enter 3 to delete item from anywhere");
            }

            n = sc.nextInt();

            switch (n) {
                case 1:
                    node temp = head;
                    temp = temp.next;
                    head = temp;
                    tail.next = head;
                    break;

                case 2:
                    node temp1 = head;
                    node ptr = temp1.next;
                    while (ptr != null) {
                        temp1 = ptr;
                        ptr = ptr.next;
                    }
                    temp1.next = head;
                    tail = temp1;
                    break;

                case 3:
                    System.out.println("Enter position of node to be deleted");
                    a = sc.nextInt();
                    node temp2 = head;
                    node ptr1 = temp2.next;

                    for (int i = 0; i < a - 1; i++) {
                        temp2 = ptr1;
                        ptr1 = ptr1.next;
                    }
                    temp2.next = ptr1.next;
                    break;

            }

            System.out.println("Do you want to delete more if yes press 1, if not press any number");
            p = sc.nextInt();
        }

        while (p == 1);
    }

    public static void main(String args[]) {
        SinglyLinkList ll = new SinglyLinkList();
        Scanner sc = new Scanner(System.in);
        int y;
        do{
            System.out.println("Enter 1 for Creation\n Enter 2 for Deletion\n Enter 3 for Display ");    // Menu Driven
            int x = sc.nextInt();

            switch(x){
                case 1: {
                    ll.Creation();
                    break;
                }

                case 2: {
                    ll.Deletion();
                    break;
                }

                case 3: {
                    ll.Traverse();
                    break;
                }

               
            }
            System.out.println("Enter 0 to go main menu");
            y = sc.nextInt();

        }
        while(y == 0);
    }
}

