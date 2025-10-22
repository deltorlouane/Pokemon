package Pokemon;

import java.util.Random;

public class Pokemon0 {
	private String nom;
	private int niveau;
	private int hp;
	private int atk;
	
	public Pokemon0(Pokemon0 p) {
		this.nom = p.nom;
		Random r = new Random();
		this.niveau = r.nextInt(1, 10);
		this.hp = 2 * niveau;
		this.atk = (niveau / 2) + 1;
	}
	
	public String getNom() {
		
	}
	

}
