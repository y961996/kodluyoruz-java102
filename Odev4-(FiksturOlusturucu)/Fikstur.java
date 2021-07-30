import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fikstur {

	private ArrayList<String> takimlar = new ArrayList<>();
	private Map<String, String[]> fikstur = new HashMap<>();
	
	public Fikstur(String[] takimlar) {
		for(int i = 0; i < takimlar.length; i++) {
			this.takimlar.add(takimlar[i]);
		}
		if(this.takimlar.size() % 2 != 0) this.takimlar.add("Bay");
		
		takimlariGoster();
		fiskturOlustur();
		
	}
	
	public ArrayList<String> getTakimlar() {
		return takimlar;
	}
	
	private void takimlariGoster() {
		System.out.println("Ligdeki takimlar:");
		for(String t : takimlar) {
			if(t.equals("Bay")) continue;
			System.out.println("\t" + t);
		}
		System.out.println();
	}
	
	private void fiskturOlustur() {
		int toplamMacSayisi = (this.takimlar.size() - 1) * 2;
		List<String> takimlar1 = this.takimlar.subList(0, this.takimlar.size() / 2);
		List<String> takimlar2 = this.takimlar.subList(this.takimlar.size() / 2, this.takimlar.size());
		
		for(int i = 0; i < toplamMacSayisi; i++) {
			if(i == (toplamMacSayisi / 2)) {
				List<String> temp = new ArrayList<String>(takimlar1);
				takimlar1 = new ArrayList<String>(takimlar2);
				takimlar2 = new ArrayList<String>(temp);
			}
			
			String[] maclar = new String[this.takimlar.size() / 2];
			for(int j = 0; j < maclar.length; j++) {
				maclar[j] = takimlar1.get(j) + " vs " + takimlar2.get(j);
			}
			
			fikstur.put("Round" + (i + 1), maclar);
			
			List<String>[] res = rotate(takimlar1, takimlar2);
			takimlar1 = res[0];
			takimlar2 = res[1];
		}
	}
	
	private List<String>[] rotate(List<String> l1, List<String> l2) {
		String temp = l1.get(l1.size()-1);
		for(int i = l1.size()-1; i > 1; i--) {
			l1.set(i, l1.get(i-1));
		}
		l1.set(1, l2.get(0));
		
		for(int i = 0; i < l2.size() - 1; i++) {
			l2.set(i, l2.get(i+1));
		}
		l2.set(l2.size()-1, temp);
		
		@SuppressWarnings("unchecked")
		List<String>[] ret = new List[2];
		ret[0] = l1;
		ret[1] = l2;
		
		return ret;
	}
	
	public void fiskturuGoster() {
		System.out.println("Fikstur\n#######################################################");
		
		int roundStr = 1;
		for(String[] sr : this.fikstur.values()) {
			System.out.println("Round " + roundStr);
			for(String s : sr) {
				System.out.println(s);
			}
			System.out.println();
			roundStr++;
		}
	}
}
