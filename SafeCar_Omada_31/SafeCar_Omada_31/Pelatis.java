public class Pelatis {
	private String name;
	private String vehicle_info;
	
	public Pelatis(String name, String vehicle_info) {
		this.name = name;
		this.vehicle_info = vehicle_info;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVehicle_info() {
		return vehicle_info;
	}

	public void setVehicle_info(String vehicle_info) {
		this.vehicle_info = vehicle_info;
	}
	
	//Εμφάνιση Στοιχείων Πελάτη
	public void printData() {
		System.out.println("Name: " + name + ", Vehicle Info: " + vehicle_info);
	}
	
}