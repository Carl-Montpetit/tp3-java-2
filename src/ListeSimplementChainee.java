import java.util.Objects;
import java.util.Comparator;

/**
 * Cette classe permet de gérer des liste simplement chaînées.
 * <p>
 * La liste chaînée est programmé de sorte qu'elle contient des objets. Or, si on veut travailler directement avec des
 * valeurs numériques, il va faloir stocker des objects de type Integer ou Double (qui sont aussi des objets).
 * </p>
 */
class ListeSimplementChainee<T extends Comparable<T>> {
	// TODO -> Il y a beaucoup de commentaires en surplus que je vais effacer plus tard -> aide à comprendre au début
	/**
	 * VARIABLES & CONSTANTES
	 */
	// Le noeud du commencement
	private Noeud<T> debut = null;
	// Le dernier noeud (tête)
	private Noeud<T> fin = null;
	// Le noeud actuel (courant)
	private Noeud<T> courant = null;

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
	public ListeSimplementChainee( T valeur ) {
		courant = new Noeud<T>( valeur );
		fin = courant;
		debut = courant;
	}

	/**
	 * MÉTHODES
	 */

	/**
	 * Permet d'ajouter un élément à la ListeSimplementchainee.
	 */
	public void ajouterElementFin(T valeur ) {
// on crée un nouvel élément de la liste
// contenant le double <valeur>
		Noeud<T> nouvelleFin = new Noeud<>(valeur);

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
	 * Enlève le premier de la liste et le retourne.
	 * @return sortie : le premier élément de la liste.
	 * @throws ListeVideException : l'exception s'il y a une liste vide.
	 */
	public T enlever() throws ListeVideException{
		T sortie = null;
		if(!aCourant()){
			throw new ListeVideException("Liste vide.");
		}
		if (nombreElementDansListeChainee() == 1){
			fin =null;
		}
		sortie = debut.getValeur();
		debut = debut.getSuivant();
		courant = debut;

		return sortie;
	}

	/**
	 * Ajoute la valeur dans la liste en ordre croissant (Sert à la liste supérieure de ListeMilieu).
	 * @param valeur : la valeur à insérer dans la liste croissante.
	 * @throws ListeVideException : l'exception s'il y a une liste vide.
	 */
	public void ajouterElementCroissant( T valeur )  {
		T test = null;
		boolean place = false;
		if(!aCourant() || valeur.compareTo(fin.getValeur())>0){
			ajouterElementFin(valeur);
		}else{
			int element = nombreElementDansListeChainee();
			while(element!=0){
				try {
					test = enlever();
				} catch (ListeVideException e) {
					e.printStackTrace();
				}
				if(valeur.compareTo(test)<0 && !place){
					ajouterElementFin(valeur);
					place = true;
				}
				if(valeur.compareTo(test)==0 && !place){
					place = true;
				}
				ajouterElementFin(test);
				element--;
			}
		}
	}

	/**
	 * Ajoute la valeur dans la liste en ordre décroissant (Sert à la liste inférieur de ListeMilieu).
	 * @param valeur : la valeur à insérer dans la liste décroissante.
	 * @throws ListeVideException : l'exception s'il y a une liste vide.
	 */
	public void ajouterElementDecroissant( T valeur )  {
		T test = null;
		boolean place = false;
		if(!aCourant() || valeur.compareTo(fin.getValeur())<0){
			ajouterElementFin(valeur);
		}else{
			int element = nombreElementDansListeChainee();
			while(element!=0){
				try {
					test = enlever();
				} catch (ListeVideException e) {
					e.printStackTrace();
				}
				if(valeur.compareTo(test)>0 && !place){
					ajouterElementFin(valeur);
					place = true;
				}
				if(valeur.compareTo(test)==0 && !place){
					place = true;
				}
				ajouterElementFin(test);
				element--;
			}
		}
	}

	/**
	 * Supprime la valeur de la liste chaînée si elle est présente.
	 * @param valeur : La valeur à supprimer.
	 */
	public void supprimerElement( T valeur ){
		T test = null;
		if(aCourant()){
			int element = nombreElementDansListeChainee();
			while(element != 0){
				try {
					test = enlever();
				} catch (ListeVideException e) {
					e.printStackTrace();
				}
				if(valeur.compareTo(test)!=0){
					ajouterElementFin(test);
				}
				element--;
			}
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
	public T valeur() {
		T valeur = null;
		if ( aCourant() ) {
			valeur = ( courant.getValeur() );
		}
		return valeur;
	}

	/**
	 * Permet de retourner le premier élément de la ListeSimplementChainee.
	 */
	public Noeud<T> premier() {
		courant = debut;
		Noeud<T> noeud= null;
		if ( debut != null ) {
			noeud = debut;
		}
		return noeud;
	}

	/**
	 * Permet de retourner l'élément suivant dans la ListeSimplementChainee.
	 */
	public Noeud<T> suivant() {
		Noeud<T> noeud = null;
		if ( courant != null ) {
			noeud = courant.getSuivant();
		}
		return noeud;
	}

	/**
	 * Permet de retourner le dernier élément dans la ListeSimplementChainee.
	 */
	public Noeud<T> dernier() {
		Noeud<T> noeud = null;
		if ( courant != null ) {
			noeud = fin;
		}
		return noeud;
	}

	/**
	 * Permet d'afficher/imprimer la ListeSimplementChainee à la console.
	 *<p>
	 * Prend les éléments un à la suite de l'autre et les imprime séquentiellement.
	 */
	public void imprimerListeChainee() {
		Noeud<T> courant = this.debut;

		System.out.print( "ListeSimplementChainee: " );

		// Traverse à travers la ListeSimplementChainee
		while ( courant != null ) {
			// Imprimer l'élément au noeud courant
			System.out.print( courant.getValeur() + " " );

			// Va au prochain noeud
			courant = courant.getSuivant();
		}
		System.out.print( "\n\n" );
	}

	/**
	 * Retourne le nombre d'élément dans la liste chaînée.
	 * @return compteur : le nombre d'élément dans la liste chaînée.
	 */
	public int nombreElementDansListeChainee(  ) {
		Noeud<T> courant = debut;
		int compteur = 0;

		// Traverse à travers la ListeSimplementChainee
		while ( courant != null ) {
			// Incrémente de 1 le compteur pour chaque élément parcourue dans la liste
			compteur++;

			// Va au prochain noeud
			courant = courant.getSuivant();
		}
		return compteur;
	}

	public void ajustementListes(ListeSimplementChainee<T> sup){
		T element = null;
		if(nombreElementDansListeChainee()+1 == sup.nombreElementDansListeChainee()){
			try {
				element = sup.enlever();
			} catch (ListeVideException e) {
				e.printStackTrace();
			}
			ajouterElementDecroissant(element);
		}
		if(nombreElementDansListeChainee() == sup.nombreElementDansListeChainee()+2){
			try {
				element = enlever();
			} catch (ListeVideException e) {
				e.printStackTrace();
			}
			sup.ajouterElementCroissant(element);
		}
	}

	/**
	 * TOSTRING
	 */

	@Override
	public String toString() {
		return "ListeSimplementChainee{" +
				"debut=" + debut +
				", fin=" + fin +
				", courant=" + courant +
				'}';
	}
}