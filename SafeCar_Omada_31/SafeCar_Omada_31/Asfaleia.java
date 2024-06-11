public class Asfaleia {
	private int id;
	private String DriverName;

	public Asfaleia(int id, String DriverName) {
		this.id = id;
		this.DriverName = DriverName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getDriverName() {
		return DriverName;
	}

	public void setDriverName(String driverName) {
		DriverName = driverName;
	}

	//Διαδικασία Ανανέωσης Ασφάλειας
	public void ananewshAsfaleias(int id) {
		System.out.println("The insurance " + id + " has been successfully updated");
				
	}
	
	//Εμφάνιση Στοιχείων Ασφάλειας
	public void printData() {
		System.out.println("Insurance id: " + id + ", Drivers Name: " + DriverName);
	}
}