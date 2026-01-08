
public class Person{
	protected String name;
	protected String matric;

	protected void displayInfo(String name,int age){
		System.out.println("Name : " + name);
		System.out.println("Matric : " + age);
	}	

	protected void displayInfo(String name){
		System.out.println("Name : " + name);
	}

	protected void displayInfo() {
		System.out.println("Name : unknow");
	}
}