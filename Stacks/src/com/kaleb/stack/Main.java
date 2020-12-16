package com.kaleb.stack;

import java.util.Arrays;

public class Main {


	public static void main(String[] args) {
		Stack stk = new Stack();
		
		stk.push(1);
		stk.push(10);
		stk.push(15);
		stk.pop();
		stk.push(20);
		stk.push(25);
//		stk.push(55);
//		stk.push(65);
		System.out.println(stk);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String str = "( anc";
//		str.toCharArray();
//		System.out.println(str);
//		Stack<String> stack = new Stack<>();
//		Stack<String> stack2 = new Stack<>();
//		System.out.println(str.substring(0, 1));
//		System.out.println(str.length());
//		for (int i= 0; i<str.length(); i++) {
//			stack.push(str.substring(i,i+1));
//		}
//		for (int i= 0; i<str.length(); i++) {
//			stack2.push(stack.pop());
//			
//		}
//		
//System.out.println(stack2);	
//		char[] open= {'(','[','{','<'};
//		char[] close = {')',']','}','>'};
//		int x = 0;
//		Stack<Character> stack = new Stack<>();
//		for (char ch:str.toCharArray()) {
//			if(Arrays.asList('(','[','{','<').contains(ch)) {
//				x = Arrays.asList(')',']','}','>').indexOf(ch);
//				stack.push(ch);
//			}
//			if(Arrays.asList(close).contains(close[x]) && ch == stack.peek()) {
//				stack.pop();
//			}
//		}
//		if(stack.isEmpty()) {
//			System.out.println("It is good to go !!!");
//		}
//		else {
//			System.out.println("it is not");
//		}
	}
}
