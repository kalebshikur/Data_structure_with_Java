package com.kaleb.array;

public class Array {
	
	private int[] items;
	public int position =0;
	public Array(int size) {
		items = new int[size];
	}
	
	public void print() {
		for(int i = 0; i < position;i++)
		System.out.println(items[i]);
	}
	
public void insert(int a) {

	if(position == items.length) {
	int[] nItems = new int[position*2];
	
	for (int i = 0; i < position; i++) {
		nItems[i]= items[i];
		
	}
	items = nItems;
	}
	items[position++]=a;
	}
}
