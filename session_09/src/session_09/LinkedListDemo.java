package session_09;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		l.add("Mayuri");
		l.add(30);
		l.add(null);
		l.add("Mayuri");
		System.out.println(l);
		l.set(0, "Rahul");
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.addFirst("Mayuri");
		System.out.println(l);
		 
	}
}
