import java.util.ArrayList;

public class Katalogos_Anaforwn {
	private int numberOfAnafores;
	ArrayList<Forma_Anaforas> Anafores = new ArrayList<>();
		
	//Διαδικασία Δημιουργίας Αναφοράς
	public void addAnaforas(Forma_Anaforas forma) {
		Anafores.add(forma);
		numberOfAnafores++;
	}
	
	//Διαδικασία Διαγραφής Αναφοράς
	public void removeAnaforas(Forma_Anaforas forma) {
		Anafores.remove(forma);
		numberOfAnafores--;
	}
	
	//Εμφάνιση Συνολικών Αναφορών και Στοιχείων τους
	public void printData() {
		System.out.println("Number of the total reports: " + numberOfAnafores);
		System.out.println("Reports: ");
		for (Forma_Anaforas anafores : Anafores) {
			anafores.printData();
		}
	}
}