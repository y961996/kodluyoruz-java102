
public class Main {

	public static void main(String[] args) {
		String[] yeniTakimlar = new String[] {
				"Galatasaray",
				"Bursaspor",
				"Fenerbah�e",
				"Be�ikta�",
				"Ba�ak�ehir",
				"Trabzonspor"
		};
		Fikstur f = new Fikstur(yeniTakimlar);
		f.fiskturuGoster();
		
		System.out.println("\n===========================================================\n");
		
		
		String[] yeniTakimlar2 = new String[] {
				"Galatasaray",
				"Bursaspor",
				"Fenerbah�e",
				"Be�ikta�",
				"Ba�ak�ehir",
				"Trabzonspor",
				"Boluspor"
		};
		Fikstur f2 = new Fikstur(yeniTakimlar2);
		f2.fiskturuGoster();
	}
}
