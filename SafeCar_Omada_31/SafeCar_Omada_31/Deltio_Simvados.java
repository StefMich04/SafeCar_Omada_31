public class Deltio_Simvados {
	private String driverName;
	private String driverVehicle;
	private String id;
	
	public Deltio_Simvados(String driverName, String driverVehicle, String id) {
		this.driverName = driverName;
		this.driverVehicle = driverVehicle;
		this.id = id;
	}
	
	public String getId() { 
		return id;
	}
	
	public String getdriverVehicle() {
		return driverName;
	}
	
	public String getdriverName() {
		return driverName;
	}
	
	//Εμφάνιση Στοιχείων Δελτίου Συμβάντος
	public void printData() {
		System.out.println("Code: " + id + ", Name of the Driver: " + driverName + ", Vehicle of the Driver: " + driverVehicle);
	}
}