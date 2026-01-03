abstract class Animal {
	protected String type;
	protected int leg;

    public Animal(String type,int leg) {
		this.type = type;
		this.leg = leg;
	}

	public void move(){
		System.out.println("This animal moves with " + getLeg() + " legs.");
	}

	public abstract void sound();

	public abstract void showAnimal();














    public String getType() {
      return this.type;
    }
    public void setType(String value) {
      this.type = value;
    }

    public int getLeg() {
      return this.leg;
    }
    public void setLeg(int value) {
      this.leg = value;
    }
}
