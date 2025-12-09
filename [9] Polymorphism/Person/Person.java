



public class Person{
	protected String name = "LOREM IPSUM";
	protected String matric = "D032410001";

	protected void display(){
		System.out.println("Name : " + this.name);
		System.out.println("Matric : " + this.matric);
	}	

	protected void printName(String name){
		System.out.println("Name : " + name);
	}

	protected void printName(String name, int age) {
		System.out.println("Age : " + age);
	}
}