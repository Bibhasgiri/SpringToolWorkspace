package bibhas.pract.program;

import java.util.HashMap;

public class Key {
	String key;

	Key(String key) {
		this.key = key;
	}

	@Override
	public int hashCode() {
		int hash = (int) key.charAt(0);
		System.out.println("hashcode for key " + key + "=" + hash);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		return key.equals(((Key) object).key);
	}

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(new Key("vishal"), 20);
		map.put(new Key("Sachine"), 30);
		map.put(new Key("Vaibhav"), 40);

		System.out.println();
		System.out.println("Value for key sachine " + map.get(new Key("sachine")));
		
	}
}
