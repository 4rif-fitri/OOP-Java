class Main {
	public static void main(String[] args) {
		Student Lord = new Student();
		Lord.age = 200;
		Lord.getHai("Lynax" ,0321456);
	}
}

class Student extends Person{
	protected String matrik_munber;
	protected String name_uni;

	// public void getHai(String nama, String name_uni){
	// 	System.out.println("Hai nama saya " + nama + " dan Uni : " + name_uni);
	// }

}

class Person {
	protected int age = 100;
	protected int ic_number;
	protected String nama;

	public void getHai(String nama, int ic_number){
		System.out.println("Hai nama saya " + nama + " dan umur : " + age + " dan ic : " + ic_number);
	}
	
}