package bibhas.pract.program;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
  public static void main(String[] args) {
	try {
		Writer w=new FileWriter("F:\\c.txt");
		String s="I Love India";
		w.write(s);
		w.close();
		System.out.println("Done");
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
