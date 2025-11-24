package labtest1.soalan1;

import java.util.Scanner;

public class Courier {
	
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char c;
		
		do {
			double weight = 0, distance = 0, kos = 0,rate =0,untng = 0;
			
			do {
				try {

					System.out.print("Please enter the weight of a package (Kg) : ");
					weight = input.nextDouble();

						if(weight < 0){
							System.out.println("Sorry weight must be positive");
						}else if(weight > 12){
							System.out.println("Sorry maxsimum weight is 12 ");
						}

				} catch (Exception e) {
					System.out.println("Sorry wight must be number ");
					input.nextLine();
					weight = -10;
				}
				
			} while (weight < 0 || weight > 12);

			do {
				try {
					
					System.out.print("Please enter the distance of a package (Km) : ");
					distance = input.nextDouble();
					if(distance < 0){
						System.out.println("Sorry distance must be positive");
					}
				} catch (Exception e) {
					System.out.println("Sorry distance must be number ");
					input.next();
					distance = -10;
				}
			} while (distance < 0);


			if(weight > 10) 	  rate = 20;
			else if(weight > 6) rate = 15;
			else if(weight > 2) rate = 10;
			else if(weight > 0) rate = 5;



			// do {
			// 	if(distance > 0 ){
			// 		// System.out.println(distance + " " + kos);
			// 		distance -= 50;
			// 		kos += rate;
			// 	}
			// } while (distance > 0);
			// //untung kerana ade lebihan
			// untng = (distance * -1) / rate;

			// kos = ((Math.ceil(distance / 50))) * rate;
			// untng = (Math.ceil(distance / 50)) - kos;

			double origDistance = distance;
			double blocks = Math.ceil(origDistance / 50);
			kos = blocks * rate;
			untng = (blocks * 50 - origDistance) * (rate / 50.0);

			System.out.println("untung " + untng);
			System.out.println("The cost is " + kos);

			System.out.println("Do you want to continue? (y/n): ");
			c = input.next().charAt(0);

		} while (c == 'Y' || c == 'y');
	}	
}
