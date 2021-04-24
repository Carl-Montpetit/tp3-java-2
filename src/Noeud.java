import java.util.Objects;
import java.util.Comparator;

/**
 * Cette classe permet de gérer les noeuds des listes chaînées.
 */
class Noeud {
	/**
	 * VARIABLES & CONSTANTES
	 */
	// La valeur stocké.
	private Object valeur;

	// La référence à l'élément suivant de la liste.
	private Noeud suivant;

	/**
	 * CONSTRUCTEURS
	 */
	/**
	 * Permet de construire un Noeud initialisé à une certaine valeur (ou objet).
	 */
	public Noeud( Object valeur ) {
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
	public Object getValeur() {
		return valeur;
	}

	/**
	 * Permet de modifier la valeur stocké par une autre dans le noeud
	 *
	 * @param newValeur -> nouvelle valeur (ou objet) stocké dans le noeud
	 */
	public void setValeur( Object newValeur ) {
		valeur = newValeur;
	}

	/**
	 * Permet de retourner la valeur (ou object) du noeud suivant.
	 *
	 * @return valeur (ou objet) du noeud suivant
	 */
	public Noeud getSuivant() {
		return suivant;
	}

	/**
	 * Permet de modifier la valeur (ou object) du noeud suivant.
	 *
	 * @param newSuivant La nouvelle valeur du suivant
	 */
	public void setSuivant( Noeud newSuivant ) {
		suivant = newSuivant;
	}

	/**
	 * EQUALS & HASHCODE + TOSTRING
	 */
	@Override
	public boolean equals( Object o ) {
		if ( this == o ) return true;
		if ( !( o instanceof Noeud ) ) return false;
		Noeud noeud = ( Noeud ) o;
		return Objects.equals( getValeur(),noeud.getValeur() ) && Objects.equals( getSuivant(),noeud.getSuivant() );
	}

	@Override
	public int hashCode() {
		return Objects.hash( getValeur(),getSuivant() );
	}

	@Override
	public String toString() {
		return "Noeud{" +
				"valeur=" + valeur +
				", suivant=" + suivant +
				'}';
	}
}