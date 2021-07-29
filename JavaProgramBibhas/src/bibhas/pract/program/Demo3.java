package bibhas.pract.program;

import java.io.BufferedReader;
import java.io.FileReader;

public class Demo3 {
public static void main(String[] args)throws Exception {
	BufferedReader r=new BufferedReader(new FileReader("F:\\c.txt"));
	int line =0;
	while(r.readLine()!=null)
		line++;
	System.out.println(line);
	r.close();
}
}
