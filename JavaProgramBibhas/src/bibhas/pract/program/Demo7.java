package bibhas.pract.program;

public class Demo7 {
public static void main(String[] args) {
	String s="abcmomabcmadam";
	char ch[]=s.toCharArray();
	for (int i = 0; i <ch.length; i++) {
		if(ch[i]==ch[ch.length-1-i]) {
			System.out.println(ch[i]);
		}
	}
	
		
}
}
