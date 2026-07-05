public class Queue {
    int arr[];
    int front, rear, size;

    Queue(int capacity) {
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int val) {
        if (size == arr.length) {
            System.out.println("Queue is full");
            return;
        }

        rear = (rear + 1) % arr.length; // circular
        arr[rear] = val;

        size++;
    }

    int dequeue() {
        if (size == 0) {
            System.out.println("Nothing to dequeue");
            return -1;
        }

        int val = arr[front];

        front = (front + 1) % arr.length;
        size--;
        return val;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int peek() {
        return arr[front];
    }
}