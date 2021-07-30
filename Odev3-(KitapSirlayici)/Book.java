
public class Book implements Comparable<Book> {

	private String kitapIsmi;
	private int sayfaSayisi;
	private String yazarinIsmi;
	private String yayinTarihi;
	
	public Book(String kitapIsmi, int sayfaSayisi, String yazarinIsmi, String yayinTarihi) {
		this.kitapIsmi = kitapIsmi;
		this.sayfaSayisi = sayfaSayisi;
		this.yazarinIsmi = yazarinIsmi;
		this.yayinTarihi = yayinTarihi;
	}
	
	@Override
	public int compareTo(Book b) {
		return this.getKitapIsmi().compareTo(b.getKitapIsmi());
	}
	
	@Override
	public String toString() {
		String ret = "";
		ret += "Kitap Ýsmi: " + this.kitapIsmi + "\n";
		ret += "Sayfa Sayýsý: " + this.sayfaSayisi + "\n";
		ret += "Yazarýn Ýsmi: " + this.yazarinIsmi + "\n";
		ret += "Yayýn Tarihi: " + this.yayinTarihi + "\n";
		return ret;
	}
	
	public String getKitapIsmi() {
		return kitapIsmi;
	}

	public void setKitapIsmi(String kitapIsmi) {
		this.kitapIsmi = kitapIsmi;
	}

	public int getSayfaSayisi() {
		return sayfaSayisi;
	}

	public void setSayfaSayisi(int sayfaSayisi) {
		this.sayfaSayisi = sayfaSayisi;
	}

	public String getYazarinIsmi() {
		return yazarinIsmi;
	}

	public void setYazarinIsmi(String yazarinIsmi) {
		this.yazarinIsmi = yazarinIsmi;
	}

	public String getYayinTarihi() {
		return yayinTarihi;
	}

	public void setYayinTarihi(String yayinTarihi) {
		this.yayinTarihi = yayinTarihi;
	}

	
}
