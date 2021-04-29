import java.util.Objects;
import java.util.Comparator;

/**
 * Cette classe permet de gérer les noeuds des listes chaînées.
 */
class Noeud <F extends Comparable<F>>{
	/**
	 * VARIABLES & CONSTANTES
	 */
	// La valeur stocké.
	private F valeur;

	// La référence à l'élément suivant de la liste.
	private Noeud<F> suivant;

	/**
	 * CONSTRUCTEURS
	 */

	/**
	 * Permet de construire un Noeud vide.
	 */
	public Noeud() {
		valeur = null;
		suivant = null;
	}

	/**
	 * Permet de construire un Noeud initialisé à une certaine valeur (ou objet).
	 */
	public Noeud( F valeur ) {
		this.valeur = valeur;
		suivant = null;
	}

	/**
	 * GETTER(S) & SETTER(S)
	 */

	/**
	 * Permet de retourner la valeur (ou objet) stocké dans un noeud.
	 *
	 * @return valeur (ou objet)
	 */
	public F getValeur() {
		return valeur;
	}

	/**
	 * Permet de modifier la valeur stocké par une autre dans le noeud
	 *
	 * @param newValeur -> nouvelle valeur (ou objet) stocké dans le noeud
	 */
	public void setValeur( F newValeur ) {
		valeur = newValeur;
	}

	/**
	 * Permet de retourner la valeur (ou object) du noeud suivant.
	 *
	 * @return valeur (ou objet) du noeud suivant
	 */
	public Noeud<F> getSuivant() {
		return suivant;
	}

	/**
	 * Permet de modifier la valeur (ou object) du noeud suivant.
	 *
	 * @param newSuivant La nouvelle valeur du suivant
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