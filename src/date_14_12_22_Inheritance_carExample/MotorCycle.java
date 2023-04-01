package date_14_12_22_Inheritance_carExample;

public class MotorCycle extends Vehicle{

	private String transmission;
	private String bikeType;
	private int cyliders;
	
	public MotorCycle() {
		super();
		this.transmission = "";
		this.bikeType = "";
		this.cyliders = 0;
	}
	
	public MotorCycle(int maxSpeed, String make, String model, int year,String transmission, String bikeType, int cylinders) {
		super(maxSpeed, make, model, year);
		this.transmission = transmission;
		this.bikeType = bikeType;
		this.cyliders = cylinders;
		
	}
	
	

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getBikeType() {
		return bikeType;
	}

	public void setBikeType(String bikeType) {
		this.bikeType = bikeType;
	}

	public int getCyliders() {
		return cyliders;
	}

	public void setCyliders(int cyliders) {
		this.cyliders = cyliders;
	}

	@Override
	public String toString() {
		return "MotorCycle [ " + "\n" + super.toString() + "\n" + "transmission = " + transmission + "\n" + "bikeType = " + bikeType + "\n" + "cyliders = " + cyliders + " ]";
	}
	
	
	
}
