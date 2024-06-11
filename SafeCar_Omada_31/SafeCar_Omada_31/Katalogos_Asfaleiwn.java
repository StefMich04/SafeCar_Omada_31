import java.util.ArrayList;

public class Katalogos_Asfaleiwn {
	private int numberOfAsfaleies;
	ArrayList<Asfaleia> asfaleies = new ArrayList<>();
	
	//Διαδικασία Νέας Ασφάλειας
	public void addAsfaleias(Asfaleia asfaleia) {
		asfaleies.add(asfaleia);
		numberOfAsfaleies++;
		System.out.println("The insurance " + asfaleia.getId() + " has been successfully saved");
	}
	
	//Διαδικασία Κατάργησης Ασφάλειας
	public void removeAsfaleias(Asfaleia asfaleia) {
		asfaleies.remove(asfaleia);
		numberOfAsfaleies--;
		System.out.println("The insurance " + asfaleia.getId() + " has been successufully removed");
	}
	
	//Εμφάνιση Συνολικών Ασφαλειών και Στοιχείων τους
	public void printData() {
		System.out.println("Number of car insurances : " + numberOfAsfaleies);
		System.out.println("Insurances: ");
		for (Asfaleia asfaleia : asfaleies) {
			asfaleia.printData();
		}
	}
	
}