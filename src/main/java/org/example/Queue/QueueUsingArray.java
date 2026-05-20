package org.example.Queue;

public class QueueUsingArray {
// Queue Using Array
    int rear=-1;
    int front=0;
    int size=5;
    int[] arr=new int[size];
    public void enqueue(int value){
        if(rear==size-1){
            System.out.println("Queue is full");
            return ;
        }
        arr[++rear]=value;
        System.out.println("Enqueued:"+value);
    }
    public void dequeue(){
        if(rear==-1){
            System.out.println("Queue is empty");
        }
        int value=arr[front++];
        System.out.println("Dequeued:"+value);
    }
    public void display(){
        if(rear==-1){
            System.out.println("Queue is empty");
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
