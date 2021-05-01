/**
 * Cette classe permet de gérer les noeuds des listes chaînées.
 */
class Noeud<F extends Comparable<F>> {
	/**
	 * VARIABLES & CONSTANTES
	 */
	private F valeur;
	private Noeud<F> suivant;

	/*
	  CONSTRUCTEURS
	 */
	/**
	 * Construit un noeud initialement vide (par défaut).
	 */
	public Noeud() {
		valeur = null;
		suivant = null;
	}

	/**
	 * Construit un noeud initialisé à une certaine valeur (ou objet).
	 */
	public Noeud( F valeur ) {
		this.valeur = valeur;
		suivant = null;
	}

	/*
	  GETTER(S) & SETTER(S)
	 */

	/**
	 * Retourne la valeur (ou objet) stocké dans un noeud.
	 *
	 * @return valeur La valeur dans un noeud.
	 */
	public F getValeur() {
		return valeur;
	}

	/**
	 * Modifie la valeur stocké dans un noeud.
	 *
	 * @param newValeur La nouvelle valeur (ou objet) stocké dans un noeud.
	 */
	public void setValeur( F newValeur ) {
		valeur = newValeur;
	}

	/**
	 * Retourne la valeur (ou object) du noeud suivant.
	 *
	 * @return valeur La valeur du noeud suivant.
	 */
	public Noeud<F> getSuivant() {
		return suivant;
	}

	/**
	 * Modifie la valeur (ou object) du noeud suivant.
	 *
	 * @param newSuivant La nouvelle valeur du noeud suivant.
	 */
	public void setSuivant( Noeud<F> newSuivant ) {
		suivant = newSuivant;
	}

	/**
	 * TOSTRING
	 */

	@Override
	public String toString() {
		return "Noeud{" +
				"valeur=" + valeur +
				", suivant=" + suivant +
				'}';
	}
}
