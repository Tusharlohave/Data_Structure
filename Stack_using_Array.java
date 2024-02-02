


import java.util.Scanner;

public class Stack_using_Array {
    
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
        Stack1 s = new Stack1();
        int l;

        do{
            System.out.println("Enter 1 for push\n Enter 2 for pop\n Enter 3 for Display");
           int x = sc.nextInt();

           switch(x){
            case 1:{
                s.Push();
                break;
            }
            case 2:{
                s.Pop();
                break;
            }
            case 3:{
                s.Display();
                break;
            }
           }
           System.out.println("Enter 0 to go back choices");
           l = sc.nextInt();
        }
        while(l==0);
        
    }
    
}
 class Stack1{
    
    int top = -1;
    int n = 10;

    int arr[] = new int[n];

    void Push(){
        if(top == (n-1)){
            System.out.println("Stack is full");
        }
        else{
            System.out.println("Enter the element:");
            Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        top++;
        arr[top] = p;
        }
    }

    void Pop(){
        if(top == -1){
            System.out.println("Satck is emplty");
        }
        else{
            top--;
        }
    }

    void Display(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

}
 


