package bibhas.pract.program;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Test3 {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("A", 1);
		m.put("B", 3);
		m.put("C", 2);
		m.put("D", 5);
		m.put("E", 4);
		m.put("F", 8);

		Set<Integer> tr = new TreeSet<Integer>(m.values());
		Set keys = m.keySet();
		Collections.addAll(keys, tr);
	}
}
