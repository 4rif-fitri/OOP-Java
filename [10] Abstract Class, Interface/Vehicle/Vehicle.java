

public class Vehicle {
	private double distance;
	private double speed;
	private double load;

	public Vehicle(double distance, double speed){
		this.distance = distance;
		this.speed = speed;
	}

	void display(){
		System.out.printf("Distance %.2f km\n",distance);
		System.out.printf("Speed %.2f km\n",speed);
		System.out.printf("Load %.2f km\n", load);
	}

	protected abstract double calcFuelRequired();
}
