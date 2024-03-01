package session_09;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap h = new HashMap<String, Integer>();
		h.put("Chitra", 700);
		h.put("Tejas", 800);
		h.put("Alisha", 200);
		h.put("Shreyash", 500);
		System.out.println(h);
		System.out.println(h.put("Chitra",100));
		System.out.println(h);
	}
}
