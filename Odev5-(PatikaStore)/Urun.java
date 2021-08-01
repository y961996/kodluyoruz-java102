
public abstract class Urun {

	private int id;
	private double birimFiyati;
	private double indirimOrani;
	private int stokMiktari;
	private String urunAdý;
	private Marka marka;
	
	public Urun(int id, double birimFiyati, double indirimOrani, int stokMiktari, String urunAdi, Marka marka) {
		this.id = id;
		this.birimFiyati = birimFiyati;
		this.indirimOrani = indirimOrani;
		this.stokMiktari = stokMiktari;
		this.urunAdý = urunAdi;
		this.marka = marka;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBirimFiyati() {
		return birimFiyati;
	}

	public void setBirimFiyati(double birimFiyati) {
		this.birimFiyati = birimFiyati;
	}

	public double getIndirimOrani() {
		return indirimOrani;
	}

	public void setIndirimOrani(double indirimOrani) {
		this.indirimOrani = indirimOrani;
	}

	public int getStokMiktari() {
		return stokMiktari;
	}

	public void setStokMiktari(int stokMiktari) {
		this.stokMiktari = stokMiktari;
	}

	public String getUrunAdý() {
		return urunAdý;
	}

	public void setUrunAdý(String urunAdý) {
		this.urunAdý = urunAdý;
	}

	public Marka getMarka() {
		return marka;
	}

	public void setMarka(Marka marka) {
		this.marka = marka;
	}
	
	
}
