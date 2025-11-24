public class Main {
	public static void main(String[] args) {

		Shirt apolo = new Shirt("Apolo","A001", "Lorem Ipsum",
		'M', "Black", 10.00, 1);
		Shirt Lorem = new Shirt("Lorem", "L001", "Lorem Ipsum",
				'L', "Red", 20.00, 2);
		
		apolo.display();
		Lorem.display();
	}
}
