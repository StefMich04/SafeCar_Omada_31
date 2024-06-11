public class Main {

	public static void main(String[] args) {
		
		//Δημιουργία Πελατών
		Pelatis pelatis1 = new Pelatis("Dimitrios Papagiannis","Mercedes-Benz AMG GLE 63 s");
		Pelatis pelatis2 = new Pelatis("Gewrgios Kwnstantinidis","Audi RSQ8");
		Pelatis pelatis3 = new Pelatis("Petros Karapostolou","Toyota Supra MK6");
		Pelatis pelatis4 = new Pelatis("Kwnstantinos Papamichail","BMW i8");
		
		//Δημιουργία Καταλόγου Πελατών
		Katalogos_Pelatwn katalogosPelatwn = new Katalogos_Pelatwn();
		
		//Προσθήκη Πελατών στον Κατάλογο Πελατών
		katalogosPelatwn.addPelatis(pelatis1);
		katalogosPelatwn.addPelatis(pelatis2);
		katalogosPelatwn.addPelatis(pelatis3);
		katalogosPelatwn.addPelatis(pelatis4);
		System.out.println();
		
		//Διαγραφή Πελάτη από τον Κατάλογο Πελατών
		katalogosPelatwn.removePelatis(pelatis3);
		System.out.println();
		
		//Δημιουργία Ασφαλειών
		Asfaleia asfaleia1 = new Asfaleia(1,"Dimitrios Papagiannis");
		Asfaleia asfaleia2 = new Asfaleia(2,"Gewrgios Kwnstantinidis");
		Asfaleia asfaleia3 = new Asfaleia(3,"Kwnstantinos Papamichail");
		
		//Δημιουργία Καταλόγου Ασφαλειών
		Katalogos_Asfaleiwn katalogosAsfaleiwn = new Katalogos_Asfaleiwn();
		
		//Προσθήκη Ασφαλειών στον Κατάλογο Ασφαλειών
		katalogosAsfaleiwn.addAsfaleias(asfaleia1);
		katalogosAsfaleiwn.addAsfaleias(asfaleia2);
		katalogosAsfaleiwn.addAsfaleias(asfaleia3);
		System.out.println();
		
		//Αφαίρεση Ασφάλειας από τον Κατάλογο Ασφαλειών
		katalogosAsfaleiwn.removeAsfaleias(asfaleia3);
		System.out.println();
		
		//Ανανέωση Ασφάλειας από τον Κατάλογο Ασφαλειών
		asfaleia1.ananewshAsfaleias(asfaleia1.getId());
		System.out.println();
		
		//Δημιουργία Δελτιών Συμβάντων
		Deltio_Simvados deltio1 = new Deltio_Simvados("Gewrgios Kwnstantinidis","Audi RSQ8","01");
		Deltio_Simvados deltio2 = new Deltio_Simvados("Kwnstantinos Papamichail","BMW i8","02");
		
		//Δημιουργία Λίστας Εγγράφων
		Lista_Eggrafwn listaEggrafwn = new Lista_Eggrafwn();
		
		//Προσθήκη Δελτίων Συμβάντων στην Λίστα Εγγράφων
		listaEggrafwn.addDeltiou(deltio1);
		listaEggrafwn.addDeltiou(deltio2);
		System.out.println();
		
		//Αφαίρεση Δελτίου Συμβάντος από την Λίστα Εγγράφων
		listaEggrafwn.removeDeltiou(deltio1);
		System.out.println();
		
		//Δημιουργία Φορμών Αναφοράς
		Forma_Anaforas formaAnaforas1 = new Forma_Anaforas("Type1","July-October");
		Forma_Anaforas formaAnaforas2 = new Forma_Anaforas("Type2","January-June");
		
		//Δημιουργία Στατιστικών Αναφορών
		Statistiki_Anafora statistikiAnafora1 = new Statistiki_Anafora("Type3","January-March",800.0);
		Statistiki_Anafora statistikiAnafora2 = new Statistiki_Anafora("Type4","June-August",250.0);
		Statistiki_Anafora statistikiAnafora3 = new Statistiki_Anafora("Type5","June-December",600.0);
		
		//Αποθήκευση Στατιστικών Αναφορών
		statistikiAnafora1.saveStatistikisAnaforas();
		statistikiAnafora2.saveStatistikisAnaforas();
		statistikiAnafora3.saveStatistikisAnaforas();
		System.out.println();
		
		//Δημιουργία Καταλόγου Αναφορών
		Katalogos_Anaforwn katalogosAnaforwn = new Katalogos_Anaforwn();
		
		//Αποθήκευση Φορμών Αναφοράς και Στατιστικών Αναφορών στον Κατάλογο Αναφορών
		katalogosAnaforwn.addAnaforas(formaAnaforas1);
		katalogosAnaforwn.addAnaforas(formaAnaforas2);
		katalogosAnaforwn.addAnaforas(statistikiAnafora1);
		katalogosAnaforwn.addAnaforas(statistikiAnafora2);
		katalogosAnaforwn.addAnaforas(statistikiAnafora3);
		
		//Δημιουργία Οικονομικής Αναφοράς
		Oikonomikes_Anafores oikonomikesAnafores = new Oikonomikes_Anafores(4500.0, 1);
		
		//Εμφάνιση Στοιχείων από τους Καταλόγους και τις Λίστες
		katalogosPelatwn.printData();
		System.out.println();
		katalogosAsfaleiwn.printData();
		System.out.println();
		listaEggrafwn.printData();
		System.out.println();
		katalogosAnaforwn.printData();
		System.out.println();
		oikonomikesAnafores.printData();
	}
}