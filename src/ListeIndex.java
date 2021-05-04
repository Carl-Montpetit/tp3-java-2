/**
 * Tp3 INF2120
 *
 * @Groupe: 010
 * @Date 2021-04-23 / 06:00 PM
 * @nom Montpetit, Carl
 * @code_permanent MONC08069000
 * @nom Chagnon, Lysanne
 * @code_permanent CHAL65550003
 */

/**
 * Cette classe definie une liste Indexe qui est une structure de liste chaînée dont le point d'attache est le milieu de
 * la liste.
 * <p>
 * Permet de gérer une suite de liste (ListeMilieu). Elle construit une liste chaînée dont les éléments sont des listes
 *
 * @param <E> elements de la listeIndex
 */
public class ListeIndex<E extends Comparable<E>> {
	/*
	 VARIABLES & CONSTANTES
	 */
	// Élement (listeMilieu) d'une ListeIndex
	private Noeud<ListeMilieu<E>> debutIndex = null;
	private Noeud<ListeMilieu<E>> finIndex = null;
	/*
	 CONSTRUCTEUR(S)
	 */

	/**
	 * Construit une ListeIndex initialement vide (par défaut).
	 */
	public ListeIndex() {
	}
	/*
	 GETTER(S) & SETTER(S)
	 */

	public Noeud<ListeMilieu<E>> getDebutIndex() {
		return debutIndex;
	}

	public void setDebutIndex( Noeud<ListeMilieu<E>> debutIndex ) {
		this.debutIndex = debutIndex;
	}

	public Noeud<ListeMilieu<E>> getFinIndex() {
		return finIndex;
	}

	public void setFinIndex( Noeud<ListeMilieu<E>> finIndex ) {
		this.finIndex = finIndex;
	}

	/*
	 LES SERVICES
	 */

	/**
	 * Vérifie si une des ListeMilieu contient la valeur en argument.
	 *
	 * @param valeur La valeur à chercher dans la liste index
	 * @return true si une des ListeMilieu contient la valeur en argument, faux sinon
	 */
	public boolean contient( E valeur ) {
		boolean estDedans = false;
		boolean trouveIndice = false;
		int compteur = 0;
		int indice = 0;
		E chose = null;
		Noeud<ListeMilieu<E>> noeudListe = debutIndex;
		ListeMilieu<E> liste = null;

		if ( nbrListe() != 0 && finIndex.getValeur().maxima().compareTo( valeur ) >= 0
				&& debutIndex.getValeur().minima().compareTo( valeur ) <= 0 ) {
			while ( compteur < nbrListe() ) {
				if ( valeur.compareTo( noeudListe.getValeur().maxima() ) <= 0 && !trouveIndice ) {
					indice = compteur;
					trouveIndice = true;
				}
				compteur++;
				noeudListe = noeudListe.getSuivant();
			}
			liste = get( indice );
			estDedans = liste.estPresent( valeur );
		}
		return estDedans;
	}

	/**
	 * Retourne la somme de toutes les tailles des ListeMilieu(s) contenue dans l'index.
	 *
	 * @return taille La somme des tailles des ListeMilieu(s) dans l'index.
	 */
	public int taille() {
		Noeud<ListeMilieu<E>> courant = debutIndex;
		int compteur = 0;

		// Traverse à travers la liste index
		while ( courant != null ) {
			compteur = compteur + courant.getValeur().taille();
			// Va au prochain noeud
			courant = courant.getSuivant();
		}
		return compteur;
	}

	/**
	 * Retourne le nombre de ListeMilieu contenue dans l'index.
	 *
	 * @return nombre Le nombre de ListeMilieu(s) dans l'index.
	 */
	public int nbrListe() {
		Noeud<ListeMilieu<E>> courant = debutIndex;
		int compteur = 0;

		// Traverse à travers la liste index
		while ( courant != null ) {
			// Incrémente de 1 le compteur pour chaque élément parcourue dans la liste
			compteur++;

			// Va au prochain noeud
			courant = courant.getSuivant();
		}
		return compteur;
	}

	/**
	 * Retourne la ListeMilieu à l'indice i de l'index. Si i est plus petit que 0 ou plus grand ou égal au nombre de
	 * listes, retourne une ListeMilieu vide.
	 *
	 * @param i La position (indice) d'un élément de l'index.
	 * @return liste La liste milieu à la position i de l'index.
	 */
	public ListeMilieu<E> get( int i ) {
		int compteur = 0;
		Noeud<ListeMilieu<E>> noeudListe = debutIndex;
		ListeMilieu<E> liste = null;

		while ( compteur < i && compteur < nbrListe() ) {
			noeudListe = noeudListe.getSuivant();
			compteur++;
		}
		if ( compteur < nbrListe() ) {
			liste = noeudListe.getValeur();
		}

		return liste;
	}

	/**
	 * <p>
	 * Trouve la ListeMilieu de l'index qui peut contenir cette valeur et ajoute la valeur dans cette liste.
	 * <p>
	 * Une ListeMilieu (m_i), qui n'est ni la première ni la dernière ListeMilieu de l'index, peut contenir une valeur
	 * lorsque cette valeur est plus grande ou égale à son minima et plus petite que le minima de la ListeMilieu
	 * suivante.
	 * <p>
	 * La première ListeMilieu (m_0) peut contenir toutes les valeurs qui sont plus petites que sont maxima.
	 * <p>
	 * La dernière ListeMilieu (m_i) peut contenir une valeur lorsque cette valeur est plus grande ou égale à son
	 * minima.
	 * <p>
	 * Si l'ajout de l'élément dans la liste brise l'invariant (1) de la ListeIndex alors il faudra faire appel à la
	 * méthode deviser de la ListeMilieu qui brise l'invariant. La nouvelle liste est ajoutée dans l'index.
	 * <p>
	 * S'il n'y a pas de ListeMilieu dans l'index, alors une nouvelle ListeMilieu est ajoutée et l'élément est placé
	 * dans cette liste.
	 *
	 * @param valeur La valeur à inserer dans la liste indexe
	 */
	public void inserer( E valeur ) {
		if ( this.nbrListe() == 0 ) {
			ListeMilieu<E> liste = new ListeMilieu<>();
			liste.inserer( valeur );
			this.ajouteListeMilieuDansIndex( liste );
		}
		if ( this.nbrListe() != 0 && this.get( 0 ).maxima().compareTo( valeur ) >= 0
				&& this.getDebutIndex().getValeur().taille() != 0 ) {
			this.get( 0 ).inserer( valeur );
		}
		if ( this.nbrListe() != 0 && this.get( this.nbrListe() - 1 ).minima().compareTo( valeur ) <= 0
				&& this.getDebutIndex().getValeur().taille() != 0 ) {
			this.get( this.nbrListe() - 1 ).inserer( valeur );
		}
		if ( this.getDebutIndex().getValeur().minima().compareTo( valeur ) < 0
				&& this.getFinIndex().getValeur().minima().compareTo( valeur ) > 0 ) {
			this.ajouteValeurEntreListesMilieu( valeur );
		}
		ajustementIndex();
	}

	/**
	 * Trouve la ListeMilieu pouvant contenir la valeur et supprime la première occurrence de la valeur dans cette
	 * liste.
	 *
	 * @param valeur La valeur à supprimer dans la liste indexe.
	 */
	public void supprimer( E valeur ) {
		Noeud<ListeMilieu<E>> noeud = debutIndex;
		ListeMilieu<E> liste = null;

		while ( noeud != null ) {
			if ( noeud.getValeur().minima().compareTo( valeur ) <= 0
					&& noeud.getValeur().maxima().compareTo( valeur ) >= 0 ) {
				liste = noeud.getValeur();
				liste.supprimer( valeur );
				noeud.setValeur( liste );
			}
			noeud = noeud.getSuivant();
		}
	}

	/**
	 * Ajoute une liste milieu dans une liste indexe et vérifie que les listes milieu sont triés selon leurs minima et
	 * maxima.
	 */
	public void ajouteListeMilieuDansIndex( ListeMilieu<E> nouvelleListe ) {
		// on crée un nouvel élément de la liste
		Noeud<ListeMilieu<E>> nouvelleFin = new Noeud<>( nouvelleListe );

		if ( debutIndex == null ) {
			// C'est le tout premier élément de la liste
			// -> La liste était initialement vide
			debutIndex = nouvelleFin;
			finIndex = nouvelleFin;
		} else {
			// La liste contenait déjà des éléments initialement
			finIndex.setSuivant( nouvelleFin );
			finIndex = nouvelleFin;
		}
	}

	/**
	 * Ajoute la valeur dans la bonne liste milieu si la valeur n'est pas plus petite que le minima de debutIndex et
	 * n'est pas plus grande que le maxima de finIndex.
	 *
	 * @param valeur : La valeur à ajouter.
	 */
	public void ajouteValeurEntreListesMilieu( E valeur ) {
		boolean place = false;
		Noeud<ListeMilieu<E>> apres = debutIndex.getSuivant();
		Noeud<ListeMilieu<E>> precedent = debutIndex;
		while ( !place ) {
			if ( valeur.compareTo( precedent.getValeur().minima() ) >= 0
					&& valeur.compareTo( apres.getValeur().minima() ) < 0 ) {
				ListeMilieu<E> bonne = precedent.getValeur();
				bonne.inserer( valeur );
				precedent.setValeur( bonne );
				place = true;
			}
			precedent = apres;
			apres = apres.getSuivant();
		}
	}

	public void ajustementIndex() {
		Noeud<ListeMilieu<E>> precedant = debutIndex;
		Noeud<ListeMilieu<E>> suivant = debutIndex.getSuivant();
		Noeud<ListeMilieu<E>> division = new Noeud<>();
		ListeMilieu<E> listeDivision = null;

		if ( finIndex.getValeur().taille() > ( 2 * this.nbrListe() ) ) {
			listeDivision = finIndex.getValeur().diviser();
			division.setValeur( listeDivision );
			finIndex.setSuivant( division );
			finIndex = division;
		} else {
			while ( suivant != null ) {
				if ( precedant.getValeur().taille() > 2 * this.nbrListe() ) {
					listeDivision = precedant.getValeur().diviser();
					division.setValeur( listeDivision );
					division.setSuivant( suivant );
					precedant.setSuivant( division );
				}
				precedant = suivant;
				suivant = suivant.getSuivant();
			}
		}
	}


	/*
	 TOSTRING
	 */

	@Override
	public String toString() {
		return "ListeIndex{" +
				"debutIndex=" + debutIndex +
				", finIndex=" + finIndex +
				'}';
	}
}
