import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
public static void main(String[] args) {
	List<String>s= new ArrayList<>();
	s.add("101");
	s.add("2");
	s.add("111");
	s.add("1");
	
	/*
	 * List<Integer> i=new ArrayList<>(); for(String s1:s) {
	 * i.add(Integer.parseInt(s1));
	 * 
	 * } Collections.sort(i,Collections.reverseOrder()); System.out.println(i);
	 */
	Collections.sort(s,Collections.reverseOrder());
	System.out.print(s);
}
}
