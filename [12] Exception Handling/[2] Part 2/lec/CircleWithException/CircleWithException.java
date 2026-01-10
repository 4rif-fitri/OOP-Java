public class CircleWithException {
	
	private double radius;
	private static int numberOfObject = 0;

	public CircleWithException(double newRadius) {
		setRadius(newRadius);
		numberOfObject++;
	}

	public CircleWithException() {
		this(1.0);
	}

	public void setRadius(double radius) throws IllegalArgumentException{
		if(radius >= 0){
			this.radius = radius;
		}else{
			throw new IllegalArgumentException("Radius cannot be negative");
		}
	}

	public double getRadius() {
	  return this.radius;
	}

	public static int getNumberOfObjects() {
		return numberOfObject;
	}


}
