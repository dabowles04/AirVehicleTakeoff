/**
 * Author: David Bowles
 * File: AirVehicleDemo.java
 * Description: AirVehicleDemo.java to display and run Jet and Cargo Plane objects.
 * 
 */

import java.util.Scanner;

public class AirVehicleDemo {
	public static void main (String arg[]) {
		
		Scanner input = new Scanner(System.in);
		
		// Variable that holds pilot answer to takeoff
		char answer = 'n';
		
		// Create new FighterJet object and set data fields.
		FighterJet Jet1 = new FighterJet();
		
		Jet1.setNumOfEngines(2);
		Jet1.setNumOfCrewMembers(1);
		Jet1.setNameOfPlane("F-22");
		Jet1.setNameOfManufacturer("Lockheed Martin");
		
		// Display Jet information and prompt pilot for takeoff.
		System.out.println();
		System.out.print(Jet1);
		System.out.println();
		System.out.print("Ready for takeoff? (y/n): ");
		answer = input.next().charAt(0);
		
		// Loop to continue prompting pilot until "y" is entered.
		if (answer == 'y') {
			Jet1.avTakeoff();
			Jet1.avFly();
			Jet1.breakSoundBarrier();
			Jet1.avLand();
		}
		
		// Jet implements AirVehicle, SoundBarrier interface methods.
		else {
			
			do {
				
				try {
					System.out.println();
					System.out.println("Pilot will be prompted again in 5 seconds.");
					System.out.println("Please ensure takeoff preparations are complete.");
					Thread.sleep(5000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.print("Ready for takeoff? (y/n): ");
				answer = input.next().charAt(0);
				
				if (answer == 'y') {
					Jet1.avTakeoff();
					Jet1.avFly();
					Jet1.breakSoundBarrier();
					Jet1.avLand();
				}
			}
			while (!(answer == 'y'));
		}
		
		
		
		// Create new plane object and set data fields.
		CargoPlane Plane1 = new CargoPlane();
		
		Plane1.setNumOfEngines(4);
		Plane1.setNumOfCrewMembers(3);
		Plane1.setNameOfPlane("C-17");
		Plane1.setNameOfManufacturer("Boeing");
		
		// Display Cargo Plane information and prompt pilot for takeoff.
		System.out.println();
		System.out.print(Plane1);
		System.out.println();
		System.out.print("Ready for takeoff? (y/n): ");
		answer = input.next().charAt(0);
		
		// Loop to continue prompting pilot until "y" is entered.
		if (answer == 'y') {
			Plane1.avTakeoff();
			Plane1.avFly();
			Plane1.avLand();
		}
		
		// CargoPlane implements AirVehicle interface methods.
		else {
			
			do {
				
				try {
					System.out.println();
					System.out.println("Pilot will be prompted again in 5 seconds.");
					System.out.println("Please ensure takeoff preparations are complete.");
					Thread.sleep(5000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.print("Ready for takeoff? (y/n): ");
				answer = input.next().charAt(0);
				
				if (answer == 'y') {
					Plane1.avTakeoff();
					Plane1.avFly();
					Plane1.avLand();
				}
			}
			while (!(answer == 'y'));
		}
	}
}
