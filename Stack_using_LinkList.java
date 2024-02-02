// Java program to implement Stack using LinkList
import java.util.*;


public class Stack_using_LinkList {
    public static void main(String args[]) {
        int a;
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter 1 for push\n Enter 2 for pop\n Enter 3 for Display");
            int i = sc.nextInt();
            switch(i){
                case 1 : {
                        s.Push();
                        break;
                }
                case 2 : {
                    s.Pop();
                    break;
                }
                case 3 : {
                    s.Display();
                    break;
                }
            }
            System.out.println("Do you want to continue is yes press 0");
             a = sc.nextInt();
           
        }
        while(a==0);
        
       
    }
}

class Stack {
    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    node top = null;

    void Push() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data: ");
        int data = sc.nextInt();
        node new_node = new node(data);
        if (top == null) {
            top = new_node;
        } else {
            new_node.next = top;
            top = new_node;
        }
    }

    void Pop() {
        if (top == null) {
            System.out.println("Stack is empty");

        } else {
            top = top.next;
        }
    }

    void Display(){
        node temp = top;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}








   
   