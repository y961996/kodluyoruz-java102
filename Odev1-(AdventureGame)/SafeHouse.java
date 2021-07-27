
public class SafeHouse extends NormalLoc {

	SafeHouse(Player player) {
		super(player, "Güvenli Ev");
	}
	
	public boolean getLocation() {
		if(player.getInv().isFood() && player.getInv().isFirewood() && player.getInv().isWater()) {
			System.out.println();
			System.out.println("Tebrikler oyunu tamamladýnýz.");
			return false;
		}
		
		player.setHealthy(player.getrHealthy());
		System.out.println("Ýyileþtiniz...");
		System.out.println("Þuan Güvenli Ev adlý yerdesiniz.");
		return true;
	}

}
