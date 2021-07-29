package bibhas.pract.program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Demo5 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("A");
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		System.out.println(l);
		System.out.println("=========================");
		Set<String> s = new HashSet<>(l);
		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
