package date_14_12_22_Inheritance_carExample;

public class Car extends Vehicle {

	private int numbeOfDoors;
	private int numbeOfTires;
	private String bodyType;
	private boolean backupCamera;

	public Car() {
		super();
		this.numbeOfDoors = 0;
		this.numbeOfTires = 0;
		this.bodyType = "";
		this.backupCamera = false;
	}

	public Car(String make) {
		this();
		super.setMake(make);
	}

	public Car(int maxSpeed, String make, String model, int year, int numbeOfDoors, int numbeOfTires, String bodyType, boolean backupCamera) {
		super(maxSpeed, make, model, year);
		this.numbeOfDoors = numbeOfDoors;
		this.numbeOfTires = numbeOfTires;
		this.bodyType = bodyType;
		this.backupCamera = backupCamera;
	}

	public int getNumbeOfDoors() {
		return numbeOfDoors;
	}

	public void setNumbeOfDoors(int numbeOfDoors) {
		this.numbeOfDoors = numbeOfDoors;
	}

	public int getNumbeOfTires() {
		return numbeOfTires;
	}

	public void setNumbeOfTires(int numbeOfTires) {
		this.numbeOfTires = numbeOfTires;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public boolean isBackupCamera() {
		return backupCamera;
	}

	public void setBackupCamera(boolean backupCamera) {
		this.backupCamera = backupCamera;
	}

	@Override
	public String toString() {
		return "Car [" + "\n" + super.toString() + "\n" + "numbe Of Doors = " + numbeOfDoors + "\n" + "number Of Tires = " + numbeOfTires
				+ "\n" + "body Type = " + bodyType + "\n" + "backup Camera = " + backupCamera + "]";
	}
}
