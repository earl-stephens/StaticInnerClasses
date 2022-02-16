package application;

public class App {

	public static void main(String[] args) {
		Person person = new Person();
		person.print();

		/*Have to use this syntax since Head is an inner class
		 * inside Person
		 */
		Person.Head head = new Person.Head();
		head.print();
	}

}
