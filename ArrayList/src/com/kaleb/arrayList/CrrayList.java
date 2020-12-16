package com.kaleb.arrayList;
public class CrrayList {
	private int[] array;
	private class Node {
		private int Value;
		private Node next;
		private Node( int value ) {
			this.Value = value;	
		}
		@Override
		public String toString() {
			return " [Value=" + Value + ", next=" + next + "]";
		}	
	}
	private Node first;
	private Node last;
	
	public void addLast(int item) {
		Node nitem = new Node(item);
		if (first == null) {
			first = nitem;
			last= nitem;
		}else {
			nitem.next =first;
			first=nitem;
//			last.next=nitem;
//			last=nitem;
		}	
	}	
//////
	@Override
	public String toString() {
		return "ArrayList [first=" + first + ", last=" + last + "]";
	}
}
