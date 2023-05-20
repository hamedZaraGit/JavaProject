package collectionsPractice;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

	public static void main(String[] args) {
		
//		Queue falls under collection class of iterable class
//		It implements (FIFO) first in first out
		
//		It has two classes PriorityQueue and Dequeue
//		But functionally Dequeue is a sub class of Queue
		
//		PriorityQueue you can use add and poll method - one way 
//		Dequeue you can use add first 
		
//		Queue structure
//		Queue on the top
//		Deque that is extending the queue
//		Priority Queue that is implementing the Queue
//		LinkedList and ArrayDeque that is implementing the deque
		
		
		Queue<String> que = new PriorityQueue<>();
		
		
		que.add("value 1");
		que.add("value 2");
		que.add("value 3");
		que.add("value 4");
		que.add("value 5");
		
		System.out.println(que);
		System.out.println("peek: " + que.peek());
		System.out.println("poll: " + que.poll());
		System.out.println(que);
		
		
		Deque<String> dq = new LinkedList<String>();
		
		dq.add("1");
		dq.addFirst("2");
		dq.add("3");
		dq.addLast("4");
		dq.add("5");
		
		System.out.println(dq);
		System.out.println("poll: " + dq.poll());
		System.out.println(dq);
		System.out.println("pollFirst: " + dq.pollLast());
		System.out.println(dq);
		
		
		
		
		
		
	}

}
