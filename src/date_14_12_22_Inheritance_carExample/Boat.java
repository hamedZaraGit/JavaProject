package date_14_12_22_Inheritance_carExample;

public class Boat extends Vehicle{

	private int numberOfLifeJackets;
	private int numberOfSeats;
	
	
	
	
	public Boat() {
		super();
		this.numberOfLifeJackets = 0;
		this.numberOfSeats = 0;
	}

	public Boat(int numberOfLifeJackets, int numberOfSeats) {
		super();
		this.numberOfLifeJackets = numberOfLifeJackets;
		this.numberOfSeats = numberOfSeats;
	}
	
	public Boat(int maxSpeed, String make, String model, int year ,int numberOfLifeJackets, int numberOfSeats) {
		super(maxSpeed, make, model, year);
		this.numberOfLifeJackets = numberOfLifeJackets;
		this.numberOfSeats = numberOfSeats;
	}
	
	
	

	public int getNumberOfLifeJackets() {
		return numberOfLifeJackets;
	}

	public void setNumberOfLifeJackets(int numberOfLifeJackets) {
		this.numberOfLifeJackets = numberOfLifeJackets;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	
	

	@Override
	public String toString() {
		return "Boat [" + "\n" + super.toString() + "\n" + "numberOfLifeJackets = " + numberOfLifeJackets + "\n" + "numberOfSeats = " + numberOfSeats + "]";
	}
	
	
	
	
	
	
	
}
