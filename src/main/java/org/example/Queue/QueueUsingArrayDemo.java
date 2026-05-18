package org.example.Queue;

public class QueueUsingArrayDemo {
public static void main(String[] args) {
    QueueUsingArray queue = new QueueUsingArray();
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.enqueue(40);
    queue.enqueue(50);

    queue.display();
    queue.dequeue();
    queue.display();
    queue.dequeue();
    queue.dequeue();
    queue.display();
}
}
