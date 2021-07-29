package bibhas.pract.program;

public class A {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5 };
		int total = (arr.length + 1) * (arr.length + 2) / 2;
		for (int i = 0; i < arr.length; i++) {
			total -= arr[i];

		}
		System.out.println(total);
       
		
	}
}
