package bibhas.pract.program;

import java.io.StringReader;

public class StringReaderExample {
public static void main(String[] args)throws Exception {
	String st="Hi i am Bibhas";
	StringReader r=new StringReader(st);
	int k=0;
	while((k=r.read())!=-1) {
		System.out.print((char)k);
	}
}
}
