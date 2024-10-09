package org.example;


public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Конструктор
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Проверка, пуста ли очередь
    public boolean isEmpty() {
        return size == 0;
    }

    // Проверка, полна ли очередь
    public boolean isFull() {
        return size == capacity;
    }

    // Добавление элемента в очередь
    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }

    // Удаление элемента из очереди
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Получение размера очереди
    public int getSize() {
        return size;
    }

    // Получение первого элемента очереди без удаления
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        // Добавляем элементы в очередь
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        // Очередь заполнена, следующий вызов enqueue вызовет исключение
        // System.out.println("Queue is full");

        // Удаляем элемент из очереди
        System.out.println("Dequeued item: " + queue.dequeue());

        // Теперь есть место для нового элемента
        queue.enqueue(6);

        // Проверяем передний элемент и размер очереди
        System.out.println("Front item: " + queue.peek());
        System.out.println("Queue size: " + queue.getSize());
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());

        // Удаляем все элементы из очереди
        while (!queue.isEmpty()) {
            System.out.println("Dequeued item: " + queue.dequeue());
        }
    }
}



