import java.util.ArrayList;

public class Lista_Paketwn extends Statistika_Stoixeia{
	private int numberOfPaketa;
	private ArrayList<String> paketa = new ArrayList<>();
	
	public Lista_Paketwn(double stoixeia, int numberOfPaketa) {
		super(stoixeia);
		this.numberOfPaketa = numberOfPaketa;
	}

	public int getPaketa() {
		return numberOfPaketa;
	}

	public void setPaketa(int paketa) {
		this.numberOfPaketa = numberOfPaketa;
	}
	
}