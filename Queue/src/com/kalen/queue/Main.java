package com.kalen.queue;

import java.util.ArrayDeque;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		
		QueStack qstk = new QueStack();
		
		qstk.enque(5);
		qstk.enque(10);
		System.out.println(qstk.deque());
		qstk.enque(20);
		qstk.enque(40);
		System.out.println(qstk.deque());
		System.out.println(qstk.deque());
		
		
//		Queue<Integer> qqq = new ArrayDeque();
//		Queue x = new Queue(4);
//		
//		x.enque(10);
//		x.enque(20);
//		x.enque(30);
//		x.enque(40);
//		System.out.println(x);
//		System.out.println(x.peek());
//		x.deque();
//		x.enque(50);
//		x.enque(60);
//		x.deque();
//		System.out.println(x.isFull());
//		System.out.println(x.peek());
//		System.out.println(x);
//		
//		
		
		
		
//		System.out.println(qqq);
//		Main.reverse(qqq);
		
	}

	
	
//	public static void reverse(Queue<Integer> queue) {
//		int i = 0;
//		List<Integer> test = new ArrayList<>();
//		while(!queue.isEmpty()) {
//		test.add(queue.remove());
//		i++;
//		}
//		for(int x=1; x <= i ; x++) {
//			queue.add(test.get(i-x));	
//		}
//		System.out.println(queue);
//	}


}




