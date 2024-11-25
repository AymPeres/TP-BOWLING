package bowling;

public class Lancer {
	private int nbQuille;

	public Lancer(int nbQuille) {
		if (nbQuille > 10 || nbQuille < -1) {
			throw new IllegalArgumentException("nb de quilles non correct");
		}
		this.nbQuille = nbQuille;
	}

	

	

	
}