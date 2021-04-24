import java.util.Objects;

/**
 * Cette classe permet de gérer des liste simplement chaînées.
 */
class ListeSimplementChainee {
	// TODO -> Il y a beaucoup de commentaires en surplus que je vais effacer plus tard -> aide à comprendre au début
	/**
	 * VARIABLES & CONSTANTES
	 */
	// Le noeud du commencement
	private Noeud debut = null;
	// Le dernier noeud
	private Noeud fin = null;
	// Le noeud actuel (courant)
	private Noeud courant = null;

	/**
	 * CONSTRUCTEURS
	 */
	/**
	 * Permet de construire une ListeSimplementChainee vide (par défaut).
	 */
	public ListeSimplementChainee() {
	}

	/**
	 * Permet de construire une ListeSimplementChainee initialisée avec une valeur (ou object).
	 */
	public ListeSimplementChainee( Object valeur ) {
		courant = new Noeud( valeur );
		fin = courant;
		debut = courant;
	}

	/**
	 * MÉTHODES
	 */
	/**
	 * Permet d'ajouter un élément à la ListeSimplementchainee.
	 */
	public void ajouterElement( Object valeur ) {
// on crée un nouvel élément de la liste
// contenant le double <valeur>
		Noeud nouvelleFin = new Noeud( valeur );

		if ( debut == null ) {
//      C'est le tout premier élément de la liste
//      -> La liste était initialement vide
			debut = nouvelleFin;
			fin = nouvelleFin;
			courant = nouvelleFin;
		} else {
//      La liste contenait déjà des éléments initialement
			fin.setSuivant( nouvelleFin );
			fin = nouvelleFin;
		}
	}

	/**
	 * Permet de tester si l'élément courant n'est pas null.
	 */
	public boolean aCourant() {
		return ( courant != null );
	}

	/**
	 * Permet de retourner la valeur de l'élément courant de la liste.
	 *
	 * @return valeur de l'objet
	 */
	public Object valeur() {
		if ( aCourant() ) {
			return ( courant.getValeur() );
		} else {
			return null;
		}
	}

	/**
	 * Permet de retourner le premier élément de la ListeSimplementChainee.
	 */
	public Noeud premier() {
		courant = debut;
		if ( debut == null ) {
			return null;
		} else {
			return debut;
		}
	}

	/**
	 * Permet de retourner l'élément suivant dans la ListeSimplementChainee.
	 */
	public Noeud suivant() {
		if ( courant != null ) {
			courant = courant.getSuivant();
		}

		if ( courant == null ) {
			return null;
		} else {
			return courant;
		}
	}

	/**
	 * EQUALS & HASHCODE + TOSTRING
	 */
	@Override
	public boolean equals( Object o ) {
		if ( this == o ) return true;
		if ( !( o instanceof ListeSimplementChainee ) ) return false;
		ListeSimplementChainee that = ( ListeSimplementChainee ) o;
		return Objects.equals( debut,that.debut ) && Objects.equals( fin,that.fin ) && Objects.equals( courant,
				that.courant );
	}

	@Override
	public int hashCode() {
		return Objects.hash( debut,fin,courant );
	}

	@Override
	public String toString() {
		return "ListeSimplementChainee{" +
				"debut=" + debut +
				", fin=" + fin +
				", courant=" + courant +
				'}';
	}
}