
public class CepTelefonu extends Urun {

	private int hafiza;
	private double ekranBoyutu;
	private int kamera;
	private double pilGucu;
	private int ram;
	private String renk;
	
	public CepTelefonu(int id, double birimFiyati, double indirimOrani, int stokMiktari, String urunAdi,
					   Marka marka, int hafiza, double ekranBoyutu, int kamera, double pilGucu, int ram, String renk) {
		super(id, birimFiyati, indirimOrani, stokMiktari, urunAdi, marka);
		this.hafiza = hafiza;
		this.ekranBoyutu = ekranBoyutu;
		this.kamera = kamera;
		this.pilGucu = pilGucu;
		this.ram = ram;
		this.renk = renk;
	}

	public int getHafiza() {
		return hafiza;
	}

	public void setHafiza(int hafiza) {
		this.hafiza = hafiza;
	}

	public double getEkranBoyutu() {
		return ekranBoyutu;
	}

	public void setEkranBoyutu(double ekranBoyutu) {
		this.ekranBoyutu = ekranBoyutu;
	}

	public double getPilGucu() {
		return pilGucu;
	}

	public void setPilGucu(int pilGucu) {
		this.pilGucu = pilGucu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getKamera() {
		return kamera;
	}

	public void setKamera(int kamera) {
		this.kamera = kamera;
	}

	public void setPilGucu(double pilGucu) {
		this.pilGucu = pilGucu;
	}

}
