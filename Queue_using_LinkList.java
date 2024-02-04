// Java program to implement Queue using LinkList

import java.util.*;

public class Queue_using_LinkList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k;
        Queue q = new Queue();
        do{
            System.out.println("Enter 1 for Enqueue\n Enter 2 for Dequeue\n Enter 3 for Display");
            int choice = sc.nextInt();
            switch(choice){
                case 1 : {
                    q.Enqueue();
                    break;
                }
                case 2:{
                    q.Dequeue();
                    break;
                }
                case 3: {
                    q.Display();
                    break;
                }

            }
            System.out.println("Enter 0 to go the main menu:\n Enter any key to Exit");
            k = sc.nextInt();
        }while(k==0);
    }
}

class Queue{
   static class node{
        int data;
        node next;

        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    node front = null;
    node rare = null;
    
    void Enqueue(){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Element: ");
        int ele = sc.nextInt();
        node new_node = new node(ele);
        if(front == null){
            front = new_node;
            rare = new_node;
        }
        else{
            rare.next = new_node;
            rare = new_node;
        }


    }

   void Dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
        }
        else{
            front = front.next;
        }
   }

   void Display(){
    node temp = front;
    while(temp != null){
        System.out.println(temp.data);
        temp = temp.next;
    }
   }
}


