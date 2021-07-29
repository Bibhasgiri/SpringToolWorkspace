package bibhas.pract.program;

public class Test {

	String obj;

	public Test(String obj) {
		this.obj = obj;
	}

	static void show() {
		Test t1 = new Test("t1");
		display();
	}

	static void display() {
		Test t2 = new Test("t2");
	}

	public static void main(String[] args) {
		show();
		System.gc();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.obj + " successfully garbage collected");
	}

}
