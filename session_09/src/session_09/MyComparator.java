package session_09;

import java.util.Comparator;

public class MyComparator implements Comparator<String>{

	@Override
	public int compare(String i1, String i2) {
		if(i1.compareTo(i2)<1) {
			return +1;
		}else if(i1.compareTo(i2)>1) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
