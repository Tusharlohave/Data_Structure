//Java program to implement queue using Array

import java.util.Scanner;

class Queue_using_Array {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int l;

        do{
            System.out.println("Enter 1 for Enqueue\n Enter 2 for Dequeue\n Enter 3 for Display");
           int x = sc.nextInt();

           switch(x){
            case 1:{
                q.Enqueue();
                break;
            }
            case 2:{
                q.Dequeue();
                break;
            }
            case 3:{
                q.Display();
                break;
            }
           }
           System.out.println("Enter 0 to go back choices");
           l = sc.nextInt();
        }
        while(l==0);
        
    }
    
}
 class Queue{
    int front = -1;
    int rare = -1;
    int n = 10;

    int arr[] = new int[n];

    void Enqueue(){
        System.out.println("Enter the Element: ");
        Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       if(rare == n-1){
        System.out.println("Queue is full");
       }
      else{
        if(front == -1 && rare == -1){
            front = 0;
            rare = 0;
            arr[rare] = a;
        }
        else{
            rare++;
            arr[rare] = a;
        }
      }
    }

    void Dequeue(){
        if(rare == -1 && front == -1){
            System.out.println("Queue is emplty");
        }
        else{
          front++;
        }
    }

    void Display(){
        for(int i=front;i<=rare;i++){
            System.out.println(arr[i]);
        }
    }

}
 
