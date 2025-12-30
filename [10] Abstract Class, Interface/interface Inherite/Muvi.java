// Muvi.java
public class Muvi implements Car, isMentenent {
	@Override
	public void drive() {
		System.out.println("Myvi drive");
	}

	@Override
	public boolean isMentenentt() {
		return false;
	}

	@Override
	public void lorem() {
		System.out.println("lorem");
	}
}