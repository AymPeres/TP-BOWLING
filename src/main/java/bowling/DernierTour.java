package bowling;

public class DernierTour extends Tour {
	Lancer lancer3;

	public DernierTour() {
		lancer3 = new Lancer();
	}

	@Override
	public int getScoreTour(Lancer l1, Lancer l2) {

		return Math.max(0, getLancer1().getNbQuille()) + Math.max(0, getLancer2().getNbQuille()) + Math.max(0, lancer3.getNbQuille());
	}

	public void addScoreLancer(int nbQuille) {
		if (this.getNumLancer() == 3) {
			super.addScoreLancer(nbQuille, lancer3);
		} else {
			super.addScoreLancer(nbQuille);
		}
	}


	

}