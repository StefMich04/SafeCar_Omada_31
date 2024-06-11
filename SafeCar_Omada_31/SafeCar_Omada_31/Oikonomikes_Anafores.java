public class Oikonomikes_Anafores extends Statistika_Stoixeia{
	private int id;
	
	public Oikonomikes_Anafores(double stoixeia, int id) {
		super(stoixeia);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//Εμφάνιση Στοιχείων Οικονομικής Αναφοράς
	public void printData() {
		System.out.println("Economic Report: Id: " + this.id + ", Statistics: " + this.getStoixeia());
	}
}