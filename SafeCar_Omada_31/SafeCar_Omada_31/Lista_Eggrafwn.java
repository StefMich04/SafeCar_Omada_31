import java.util.ArrayList;

public class Lista_Eggrafwn {
	private ArrayList<String> Pistopoihtika_Asfaleias = new ArrayList<>();
	private ArrayList<String> Simvolaia_Asfaleias = new ArrayList<>();
	private ArrayList<String> Anafores_Asfalishs = new ArrayList<>();
	private ArrayList<String> Aitimata_Apozhmiwshs = new ArrayList<>();
	ArrayList<Deltio_Simvados> deltia = new ArrayList<>();
	
	//Διαδικασία Δημιουργίας Δελτίου
	public void addDeltiou(Deltio_Simvados deltio) {
		deltia.add(deltio);
		System.out.println("The Accident Report " + deltio.getId() + " has been successfully saved");
	}
	
	//Διαδικασία Αφαίρεσης Δελτίου
	public void removeDeltiou(Deltio_Simvados deltio) {
		deltia.remove(deltio);
		System.out.println("The Accident Report " + deltio.getId() + " has been successfully removed");
	}
	
	//Εμφάνιση Δελτίων και Στοιχείων τους
	public void printData() {
		System.out.println("Number of the total accident reports: " + deltia.size());
		System.out.println("Accident Reports: ");
		for (Deltio_Simvados deltio : deltia) {
			deltio.printData();
		}
	}
	
}