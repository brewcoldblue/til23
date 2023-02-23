package test01;

public class Test1 {

  public static int n=5;
  public static int[] arr = new int[n];
  public static int front = 0, rear = 0;

  public static void main(String[] args) {
    enQueue(1);
    enQueue(2);
    enQueue(3);
    enQueue(4);
    enQueue(5);

  }
  public static boolean isEmpty() {
    return front == rear;
  }
  public static boolean isFull() {
    return (rear+1) % n == front;
  }

  public static void enQueue(int item) {
    if(isFull()) System.out.println("큐다참");
    else {
      rear = (rear+1)%n;
      arr[rear] = item;
    }
  }

  public static int deQueue() {
    if(isEmpty()) {
      System.out.println("큐빔");
      return -1;
    }
    else {
      front = (front+1)%n;
      return arr[front];
    }
  }
}