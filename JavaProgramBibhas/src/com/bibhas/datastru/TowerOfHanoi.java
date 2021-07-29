package com.bibhas.datastru;

public class TowerOfHanoi {
	static void TowerOfHanoi(int n, char source, char disti, char temp) {
		if (n == 1) {
			System.out.println("Move disk 1 from " + source + "disti" + disti);
			return;
		}
		TowerOfHanoi(n - 1, source, disti, temp);
		System.out.println("Move Disk " + n + "from" + source + "to" + disti);
		TowerOfHanoi(n - 1, temp, source, disti);
	}

	public static void main(String[] args) {

		int n = 4;
		TowerOfHanoi(n, 'A', 'C', 'B');
	}
}
