
public class SafeHouse extends NormalLoc {

	SafeHouse(Player player) {
		super(player, "G�venli Ev");
	}
	
	public boolean getLocation() {
		if(player.getInv().isFood() && player.getInv().isFirewood() && player.getInv().isWater()) {
			System.out.println();
			System.out.println("Tebrikler oyunu tamamlad�n�z.");
			return false;
		}
		
		player.setHealthy(player.getrHealthy());
		System.out.println("�yile�tiniz...");
		System.out.println("�uan G�venli Ev adl� yerdesiniz.");
		return true;
	}

}
