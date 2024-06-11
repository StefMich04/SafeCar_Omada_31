public class Statistiki_Anafora extends Forma_Anaforas{
	private double statistika_stoixeia;
	
	public Statistiki_Anafora(String type, String period, double statistika_stoixeia) {
		super(type,period);
		this.statistika_stoixeia = statistika_stoixeia;
	}

	public double getStatistika_stoixeia() {
		return statistika_stoixeia;
	}

	public void setStatistika_stoixeia(double statistika_stoixeia) {
		this.statistika_stoixeia = statistika_stoixeia;
	}
	
	//Διαδικασία Αποθήκευσης Στατιστικής Αναφοράς
	public void saveStatistikisAnaforas() {
		System.out.println("The report: Type: " + type + ", Period: " + period + ", Statistics: " + statistika_stoixeia + " has been successufully saved");
	}
	
	//Εμφάνιση Στοιχείων Στατιστικής Αναφοράς
	public void printData() {
		System.out.println("Report: Type: " + type + ", Period: " + period + ", Statistics: " + statistika_stoixeia);
	}
}