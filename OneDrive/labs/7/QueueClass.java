/* file: QueueClass.jaqa
 * author: Alexander Richin
 * course: CMPT 220
 * assignment: Lab 7 Question 10.10
 * due date: 10/27/2016
 * qersion: 1.8.0_101
 *
 * This file contains the declaration of QueueClass that
 * stores integers. The elements are retrieqed first-in-
 * first-out.
 */

public class QueueClass {
  public static void main(String[] args) {
    Queue queue = new Queue();
    for (int x=0; x<=20; x++)
      queue.enqueue(x);
    while (!queue.empty())
      System.out.print(queue.dequeue() + " ");
  }
}
// Creates a queue class
class Queue {
  private int size;
  private int[] numbers;

  // This constructs a queue with the default set to 8
  public Queue() {
    numbers = new int[8];
  }

  // This adds a number into the queue 
  public void enqueue(int val) {
    if (size >= numbers.length) {
      int[] temp = new int[numbers.length*2];
      System.arraycopy(numbers, 0, temp, 0, numbers.length);
      numbers = temp;
    }

    numbers[size++] = val;
  }

  // This removes a number from the queue and returns it 
  public int dequeue() {
    int q=numbers[0];
    
    // This shifts all of the numbers to the left
    for (int x=0; x<size-1; x++) {
      numbers[x] = numbers[x+1];
    }
    
    // Decrements size
    size--;
    return q;
  }

  // This tests if queue is 0
  public boolean empty() {
    return size == 0;
  }

  // This returns the total amount of numbers 
  public int getSize() {
    return size;
  }
}
