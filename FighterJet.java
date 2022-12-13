/**
 * Author: David Bowles
 * File: Fighterjet.java
 * Description: Fighterjet.java class implements AirVehicle and SoundBarrier interfaces.
 * 
 */

public class FighterJet implements AirVehicle, SoundBarrier{
	private int numOfEngines;
	private int numOfCrewMembers;
	private String nameOfPlane;
	private String nameOfManufacturer;
	
	public FighterJet()
	{
		
	}
	
	public FighterJet(int numOfEngines, int numOfCrewMembers, String nameOfPlane, String nameOfManufacturer) {
		this.numOfEngines = numOfEngines;
		this.numOfCrewMembers = numOfCrewMembers;
		this.nameOfPlane = nameOfPlane;
		this.nameOfManufacturer = nameOfManufacturer;
	}

	// Getters
	public int getNumOfEngines() {
		return numOfEngines;
	}

	public int getNumOfCrewMembers() {
		return numOfCrewMembers;
	}

	public String getNameOfPlane() {
		return nameOfPlane;
	}

	public String getNameOfManufacturer() {
		return nameOfManufacturer;
	}

	// Setters
	public void setNumOfEngines(int numOfEngines) {
		this.numOfEngines = numOfEngines;
	}

	public void setNumOfCrewMembers(int numOfCrewMembers) {
		this.numOfCrewMembers = numOfCrewMembers;
	}

	public void setNameOfPlane(String nameOfPlane) {
		this.nameOfPlane = nameOfPlane;
	}

	public void setNameOfManufacturer(String nameOfManufacturer) {
		this.nameOfManufacturer = nameOfManufacturer;
	}

	@Override
	public String toString() {
		return    "###################" + "\n"
				+ "# FighterJet Info #" + "\n"
				+ "FighterJet [numOfEngines= " + numOfEngines + " , "
				+ "numOfCrewMembers= " + numOfCrewMembers + " , "
				+ "nameOfPlane= " + nameOfPlane + " , "
				+ "nameOfManufacturer= " + nameOfManufacturer + "]";
	}

	@Override
	public void avTakeoff() {
		// TODO Auto-generated method stub
		
		try {
			System.out.print(nameOfPlane + " has started the takeoff roll...");
			Thread.sleep(1000);
			System.out.print("...");
			Thread.sleep(1000);
			System.out.print("..." + "\n");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void avFly() {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(nameOfPlane + " has taken off and is now flying.");
			System.out.print("Flying...");
			Thread.sleep(1000);
			System.out.print("...");
			Thread.sleep(1000);
			System.out.print("...");
			Thread.sleep(1000);
			System.out.print("...");
			Thread.sleep(1000);
			System.out.print("..." + "\n");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void avLand() {
		// TODO Auto-generated method stub
		
		System.out.println(nameOfPlane + " has successfully landed.");
	}

	@Override
	public void breakSoundBarrier() {
		// TODO Auto-generated method stub
		
		System.out.println(nameOfPlane + " has broken the sound barrier!");
	}
	
	
	
	
	
}
