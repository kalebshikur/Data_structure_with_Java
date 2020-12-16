package com.kalen.queue;

import java.util.Arrays;

public class Queue {
	int[] inte;
	int f,b=0;
	int size;
	
	
	
	public Queue(int size) {
		inte = new int[size];
	}
	public void enque( int qqq) {
		if(b > size && f != 0) {
			b = 0;
		}
		inte[b++]=qqq;
	}
	public int deque() {
		return inte[f++] =0;
	}
	public int peek() {
		return inte[f];
	}
	
	public boolean isEmpty() {
		if(f==b) {
			return true;
		}
		else
			return false;
	}
	public boolean isFull() {
	if(b==inte.length) {
		return true;
	}
	else
		return false;
	}
	
	
	
	@Override
	public String toString() {
		return "Queue [inte=" + Arrays.toString(inte) + "]";
	}
	public String tnoString() {
		return "The Array"+inte+ "  This is ";
	}
}
