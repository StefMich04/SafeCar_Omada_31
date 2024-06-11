import java.util.ArrayList;

public class Katalogos_Pelatwn {
	private int numberOfPelates;
	ArrayList<Pelatis> Pelates = new ArrayList<>();
	
	//Διαδικασία Προσθήκης Πελάτη
	public void addPelatis(Pelatis pelatis) {
		Pelates.add(pelatis);
		numberOfPelates++;
		System.out.println("The Client " + pelatis.getName() + " has been successfully saved");
	}
	
	//Διαδικασία Αφαίρεσης Πελάτη
	public void removePelatis(Pelatis pelatis) {
		Pelates.remove(pelatis);
		numberOfPelates--;
		System.out.println("The Client " + pelatis.getName() + " has been successfully removed");
	}
	
	//Εμφάνιση Συνολικών Πελατών και Στοιχείων τους
	public void printData() {
		System.out.println("Number of the total clients: " + numberOfPelates);
		System.out.println("Clients: ");
		for (Pelatis pelatis : Pelates) {
			pelatis.printData();
		}
	}
}