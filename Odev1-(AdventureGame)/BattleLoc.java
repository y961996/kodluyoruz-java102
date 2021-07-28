import java.util.Random;

public abstract class BattleLoc extends Location {
	protected Obstacle obstacle;
	protected String award;
	
	private static Random random = new Random();

	BattleLoc(Player player, String name, Obstacle obstacle, String award) {
		super(player);
		this.obstacle = obstacle;
		this.name = name;
		this.award = award;
	}

	public boolean getLocation() {
		int obsCount = obstacle.count();
		System.out.println("�uan buradas�n�z : " + this.getName());
		System.out.println("Dikkatli ol! Burada " + obsCount + " tane " + obstacle.getName() + " ya��yor !");
		System.out.print("<S>ava� veya <K>a� :");
		String selCase = scan.nextLine();
		selCase = selCase.toUpperCase();
		if (selCase.equals("S")) {
			if (combat(obsCount)) {
				System.out.println(this.getName() + " b�lgesindeki t�m d��manlar� temizlediniz !");
				if (this.award.equals("Food") && player.getInv().isFood() == false) {
					System.out.println(this.award + " Kazand�n�z! ");
					player.getInv().setFood(true);
				} else if (this.award.equals("Water") && player.getInv().isWater() == false) {
					System.out.println(this.award + " Kazand�n�z! ");
					player.getInv().setWater(true);
				} else if (this.award.equals("Firewood") && player.getInv().isFirewood() == false) {
					System.out.println(this.award + " Kazand�n�z! ");
					player.getInv().setFirewood(true);
				}
				return true;
			}
			
			if(player.getHealthy() <= 0) {
				System.out.println("�ld�n�z !");
				return false;
			}
		
		}
		return true;
	}

	public boolean combat(int obsCount) {
		for (int i = 0; i < obsCount; i++) {
			int defObsHealth = obstacle.getHealth();
			playerStats();
			enemyStats();
			while (player.getHealthy() > 0 && obstacle.getHealth() > 0) {
				System.out.print("<V>ur veya <K>a� :");
				String selCase = scan.nextLine();
				selCase = selCase.toUpperCase();
				if (selCase.equals("V")) {
					int randomS�ra = random.nextInt(10) + 1;
					if(randomS�ra > 5) {
						System.out.println("Siz vurdunuz !");
						obstacle.setHealth(obstacle.getHealth() - player.getTotalDamage());
						afterHit();
						if (obstacle.getHealth() > 0) {
							System.out.println();
							System.out.println("Canavar size vurdu !");
							player.setHealthy(player.getHealthy() - (obstacle.getDamage() - player.getInv().getArmor()));
							afterHit();
						}						
					} else {
						System.out.println("Canavar size vurdu !");
						player.setHealthy(player.getHealthy() - (obstacle.getDamage() - player.getInv().getArmor()));
						afterHit();
						if(player.getHealthy() > 0) {
							System.out.println();
							System.out.println("Siz vurdunuz !");
							obstacle.setHealth(obstacle.getHealth() - player.getTotalDamage());
							afterHit();
						}
					}
				} else {
					return false;
				}
			}

			if (obstacle.getHealth() < player.getHealthy()) {
				System.out.println("D��man� yendiniz !");
				if(!obstacle.getName().equals("Y�lan"))
					player.setMoney(player.getMoney() + obstacle.getAward());
				else {
					// Random silah, z�rh veya para
					// Silah	  15%  => T�fek -> 20%, K�l�� -> 30%, Tabanca -> 50%
					// Z�rh 	  15%  => A��r -> 20%, Orta -> 30%, Hafif -> 50%
					// Para  	  25%  => 10 Para -> 20%, 5 Para -> 30%, 1 Para 50%
					// Hi� bir�ey 45%
					int randomNum = random.nextInt(100) + 1;
					if(randomNum <= 15) {
						// Silah
						int randomSilah = random.nextInt(100) + 1;
						if(randomSilah <= 20) {
							// T�fek
							System.out.println("Tebrikler T�fek kazand�n�z.");
							player.getInv().setDamage(7);
							player.getInv().setwName("T�fek");
						}else if(randomSilah <= 50) {
							// K�l��
							System.out.println("Tebrikler K�l�� kazand�n�z.");
							player.getInv().setDamage(3);
							player.getInv().setwName("K�l��");
						}else {
							// Tabanca
							System.out.println("Tebrikler Tabanca kazand�n�z.");
							player.getInv().setDamage(2);
							player.getInv().setwName("Tabanca");
						}
						
					}else if(randomNum <= 30) {
						// Z�rh
						int randomZ�rh = random.nextInt(100) + 1;
						if(randomZ�rh <= 20) {
							// A��r
							System.out.println("Tebrikler A��r Z�rh kazand�n�z.");
							player.getInv().setArmor(5);
							player.getInv().setaName("A��r Z�rh");
						}else if(randomZ�rh <= 50) {
							// Orta
							System.out.println("Tebrikler Orta Z�rh kazand�n�z.");
							player.getInv().setArmor(3);
							player.getInv().setaName("Orta Z�rh");
						}else {
							// Hafif
							System.out.println("Tebrikler Hafif Z�rh kazand�n�z.");
							player.getInv().setArmor(1);
							player.getInv().setaName("Hafif Z�rh");
						}
					
					}else if(randomNum <= 55) {
						// Para
						int randomPara = random.nextInt(100) + 1;
						if(randomPara <= 20) {
							// 10 Para
							System.out.println("Tebrikler 10 Para kazand�n�z.");
							player.setMoney(player.getMoney() + 10);
						}else if(randomPara <= 50) {
							// 5 Para
							System.out.println("Tebrikler 5 Para kazand�n�z.");
							player.setMoney(player.getMoney() + 5);
						}else {
							// 1 Para
							System.out.println("Tebrikler 1 Para kazand�n�z.");
							player.setMoney(player.getMoney() + 1);
						}
					
					}else {
						// Hi�bir�ey
						System.out.println("Maalesef hi�bir �d�l kazanamad�n�z!");
					}
				}
				System.out.println("G�ncel Paran�z : " + player.getMoney());
				obstacle.setHealth(defObsHealth);
			} else {
				return false;
			}
			System.out.println("-------------------");
		}
		return true;
	}

	public void playerStats() {
		System.out.println("Oyuncu De�erleri\n--------------");
		System.out.println("Can:" + player.getHealthy());
		System.out.println("Hasar:" + player.getTotalDamage());
		System.out.println("Para:" + player.getMoney());
		if (player.getInv().getDamage() > 0) {
			System.out.println("Silah:" + player.getInv().getwName());
		}
		if (player.getInv().getArmor() > 0) {
			System.out.println("Z�rh:" + player.getInv().getaName());
		}
	}

	public void enemyStats() {
		System.out.println("\n" + obstacle.getName() + " De�erleri\n--------------");
		System.out.println("Can:" + obstacle.getHealth());
		System.out.println("Hasar:" + obstacle.getDamage());
		if(!obstacle.getName().equals("Y�lan"))
			System.out.println("�d�l:" + obstacle.getAward());
		else
			System.out.println("�d�l: Para, Silah veya Z�rh");
	}

	public void afterHit() {
		System.out.println("Oyuncu Can�:" + player.getHealthy());
		System.out.println(obstacle.getName() + " Can�:" + obstacle.getHealth());
		System.out.println();
	}

}
