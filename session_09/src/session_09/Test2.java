package session_09;

import java.util.TreeSet;

public class Test2 {
	
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new MyComparator());
		
		t.add("Virat");
		t.add("Rohit");
		t.add("Rahul");
		t.add("Pant");
		
		System.out.println(t);
		
	}

}
