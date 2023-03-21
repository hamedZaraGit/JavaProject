package date_14_12_22_Inheritance_carExample;

public class Vehicle {

	private int maxSpeed;
	private String make;
	private String model;
	private int year;

	public Vehicle() {
		super();
		this.maxSpeed = 0;
		this.make = "";
		this.model = "";
		this.year = 0;
	}

	public Vehicle(int maxSpeed, String make, String model, int year) {
		super();
		this.maxSpeed = maxSpeed;
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}

//	@Override - to reassure that we have the right mehod defination
	// and showing that this is a method that we have inherited and now
	// changing its implementation
	
	@Override
	public String toString() {
		return "maxSpeed=" + maxSpeed 
				+ ", \nmake=" + make 
				+ ", \nmodel=" + model 
				+ ", \nyear=" + year;
	}


}
