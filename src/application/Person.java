package application;

public class Person {
	static class Head {
		/* static inner class is really just a way of grouping
		 * classes.  Could be handy for something like using
		 * a runnable.
		 * Can't accessed instance variables with these.
		 */
		public void print() {
			System.out.println("head");
		}
	}
	
	static class Body {
		public void print() {
			System.out.println("body");
		}
	}
	
	public void print() {
		Head head = new Head();
		Body body = new Body();
		
		head.print();
		body.print();
	}
}
