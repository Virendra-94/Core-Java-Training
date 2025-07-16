package collectionsdemo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author : Virendra.1.Kumar
 * Date   : Jul 15, 2025
 * Time   : 9:50:00 AM
 * Email  : Virendra.1.Kumar@coforge.com
 */

public class QueueDemo {

	public static void main(String[] args) {

		// Queue implementation FIFO using Linked List

		// Create and initialize a Queue using a LinkedList
		Queue<String> waitingQueue = new LinkedList<>();

		// Adding new elements to the Queue (The Enqueue operation)
		waitingQueue.add("Rajeev");
		waitingQueue.add("Chris");
		waitingQueue.add("John");
		waitingQueue.add("Mark");
		waitingQueue.add("Steven");

		System.out.println("WaitingQueue : " + waitingQueue);

		// Removing an element from the Queue using remove() (The Dequeue operation)
		// The remove() method throws NoSuchElementException if the Queue is empty
		String name = waitingQueue.remove();
		System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);

		// Removing an element from the Queue using poll()
		// The poll() method is similar to remove() except that it returns null if the Queue is empty.
		name = waitingQueue.poll();
		System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + waitingQueue);

	}

}
