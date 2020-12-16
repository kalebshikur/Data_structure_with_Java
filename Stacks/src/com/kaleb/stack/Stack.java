package com.kaleb.stack;

import java.util.Arrays;

public class Stack {
	int[] array = new int[5];
	public int count;

	public void  push(int item) {
		if(count == array.length)
			throw new StackOverflowError();
		array[count++]=item;
	}
	public int  pop() {
		if(count == 0)
			throw new IllegalStateException();
		return array[--count];
	}
	public int  peek() {
		return array[count];
	}

	


	@Override
	public String toString() {
		return "Stack [array=" + Arrays.toString(array) + ", count=" + count + "]";
	}
	

}
