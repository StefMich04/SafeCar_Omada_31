public class Forma_Anaforas {
	protected String type;
	protected String period;
	
	public Forma_Anaforas(String type, String period) {
		this.type = type;
		this.period = period;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}
		
	//Εμφάνιση Στοιχείων Φόρμας Αναφοράς
	public void printData() {
		System.out.println("Type: " + type + ", Period: " + period);
	}
}