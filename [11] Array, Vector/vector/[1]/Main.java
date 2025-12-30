
import java.util.Enumeration;
import java.util.Vector;



class Main {
	// public static void main(String[] args) {
	// Vector names = new Vector(5);

	// names.add("lorem");
	// names.add("lorem");
	// names.add("lorem");
	// names.add("lorem");
	// names.add("lorem");
	// names.add("lorem");
	// names.add("lorem");

	// names.setElementAt("ipsum", 0);
	// names.setElementAt("ipsum", 4);

	// for (int idx = 0; idx < names.size(); idx++) {
	// System.out.println(names.elementAt(idx));

	// }

	// }

	// ==============

	// public static void main(String[] args) {
	// Vector names = new Vector(5);

	// names.addElement("lorem");
	// names.addElement("3.1");
	// names.addElement("50");
	// names.addElement('v');

	// names.insertElementAt("Ipdum", 2);
	// names.remove(1);

	// for (int idx = 0; idx < names.size(); idx++) {
	// System.out.println(idx + ": " + names.elementAt(idx));
	// }

	// }

	// ==============

	// public static void main(String[] args) {
	// 	Vector names = new Vector(4, 2);
	// 	names.addElement("lorem");
	// 	names.addElement("lorem");
	// 	names.addElement("lorem");
	// 	names.addElement("lorem");

	// 	System.out.println("capacity of vector : " + names.capacity());
	// 	names.addElement("lorem");
	// 	System.out.println("capacity of vector : " + names.capacity());

	// }

	// ==============

	public static void main(String[] args) {
		 Vector<String> vec =new Vector<String>(2);

		vec.addElement("apple");
		vec.addElement("orage");
		vec.addElement("pie");
		vec.addElement("apple");

		System.out.println("Size is : " + vec.size());
		System.out.println("defoult capacity incriment is : " + vec.capacity());
	
		vec.addElement("pie");
		vec.addElement("apple");

		System.out.println("Size is : " + vec.size());
		System.out.println("defoult capacity incriment is : " + vec.capacity());

		Enumeration en = vec.elements();
		System.out.println("elemet are: ");
		while (en.hasMoreElements()) {
			 System.out.println(en.nextElement() + " ");
			 
		}
	}
}