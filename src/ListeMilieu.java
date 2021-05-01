/**
 * Cette classe définie une listeMilieu qui est une structure (une liste chaînée accédée par le milieu) qui va gérer
 * l'accès à plusieurs listes chaînées (ListeMilieu) à l'aide d'un index.
 * <p>
 * Les éléments de cette liste sont maintenus triés.
 *
 * @param <E> elements d'une listeMilieu
 */
public class ListeMilieu<E extends Comparable<E>> {
	/*
	 VARIABLES & CONSTANTES
	 */
	private ListeSimplementChainee<E> superieur = new ListeSimplementChainee<>();
	private ListeSimplementChainee<E> inferieur = new ListeSimplementChainee<>();
	private Noeud<E> premierInf = null;
	private Noeud<E> premierSup = null;

	/*
	 GETTER(S) & SETTER(S)
	 */
	public ListeSimplementChainee<E> getSuperieur() {
		return superieur;
	}

	public void setSuperieur( ListeSimplementChainee<E> superieur ) {
		this.superieur = superieur;
	}

	public ListeSimplementChainee<E> getInferieur() {
		return inferieur;
	}

	public void setInferieur( ListeSimplementChainee<E> inferieur ) {
		this.inferieur = inferieur;
	}

	public Noeud<E> getPremierInf() {
		return premierInf;
	}

	public void setPremierInf( Noeud<E> premierInf ) {
		this.premierInf = premierInf;
	}

	public Noeud<E> getPremierSup() {
		return premierSup;
	}

	public void setPremierSup( Noeud<E> premierSup ) {
		this.premierSup = premierSup;
	}

	/*
	 LES SERVICES
	 */
	/**
	 * Constuit une liste milieu initialement vide (par défaut).
	 */
	public ListeMilieu() {
	}

	/**
	 * Construit une nouvelle ListeMilieu(L*).
	 * <p>
	 * Les éléments de la liste supérieure sont déplacés dans la nouvelle ListeMilieu.
	 * <p>
	 * Finalement, une partie des éléments de la liste inférieure sont déplacés dans la liste supérieure afin de
	 * rétabir
	 * l'invariant.
	 * <p>
	 *
	 * @return nouveau La nouvelle liste milieu.
	 */
	public ListeMilieu<E> diviser() {
		ListeMilieu<E> nouveau = new ListeMilieu<>();
		E element = null;
		if ( superieur.nombreElementDansListeChainee() != 0 ) {
			int elementPresent = superieur.nombreElementDansListeChainee();
			while ( elementPresent != 0 ) {
				try {
					element = superieur.enlever();
				} catch ( ListeVideException e ) {
					e.printStackTrace();
				}
				nouveau.inserer( element );
				elementPresent--;
			}
		}
		inferieur.ajustementListes( superieur );

		setPremiersElements( nouveau );
		return nouveau;
	}

	/**
	 * Ajoute un élément dans la ListeMilieu.
	 * <p>
	 * Si la liste inférieure est vide, alors valeur (ou v dans l'énoncé) est ajouté dans la liste inférieure.
	 * <p>
	 * D'ailleurs, si la première valeur de la liste inférieure est plus grande ou égale à v, alors v est ajouté
	 * dans la
	 * liste inférieure, sinon v est ajouté dans la liste supérieure.
	 *
	 * @param valeur La valeur ajouté à la liste.
	 */
	public void inserer( E valeur ) {
		if ( inferieur.nombreElementDansListeChainee() == 0 || valeur.compareTo( getPremierInf().getValeur() ) <= 0 ) {
			inferieur.ajouterElementDecroissant( valeur );
		} else {
			superieur.ajouterElementCroissant( valeur );
		}
		inferieur.ajustementListes( superieur );
		setPremierInf( new Noeud<E>( inferieur.premier().getValeur() ) );
		if ( superieur.nombreElementDansListeChainee() != 0 ) {
			setPremierSup( new Noeud<E>( superieur.premier().getValeur() ) );
		} else {
			setPremierSup(null);
		}
	}

	/**
	 * Retourne la première valeur de la liste inférieure.
	 * <p>
	 * Cela ne modifie pas la ListeMilieu.
	 * </p>
	 *
	 * @return milieu La valeur milieu de la liste.
	 */
	public E milieu() {
		return getPremierInf().getValeur();
	}

	/**
	 * Retourne la dernière valeur de la liste inférieure.
	 * <p>
	 * Cela ne modifie pas la ListeMilieu.
	 * </p>
	 *
	 * @return minimum La valeur minimum de la liste.
	 */
	public E minima() {
		return inferieur.dernier().getValeur();
	}

	/**
	 * Retourne la dernière valeur de la liste supérieure.
	 * <p>
	 * Cela ne modifie pas la ListeMilieu.
	 * </p>
	 *
	 * @return maximum La valeur maximum de la liste.
	 */
	public E maxima() {
		E maximum;
		if ( superieur.nombreElementDansListeChainee() == 0 ) {
			maximum = getPremierInf().getValeur();
		} else {
			maximum = superieur.dernier().getValeur();
		}
		return maximum;
	}

	/**
	 * Trouve la première occurrence de la valeur dans la liste milieu et l'enlève de la liste.
	 *
	 * @param valeur La valeur à supprimer de la liste milieu.
	 */
	public void supprimer( E valeur ) {
		if ( inferieur.nombreElementDansListeChainee() != 0 ) {
			if ( superieur.nombreElementDansListeChainee() == 0 || valeur.compareTo( getPremierInf().getValeur() ) <= 0 ) {
				inferieur.supprimerElement( valeur );
			} else {
				superieur.supprimerElement( valeur );
			}
			inferieur.ajustementListes( superieur );
			if ( inferieur.nombreElementDansListeChainee() != 0 ) {
				setPremierInf( new Noeud<E>( inferieur.premier().getValeur() ) );
			} else {
				setPremierInf(null);
			}
			if ( superieur.nombreElementDansListeChainee() != 0 ) {
				setPremierSup( new Noeud<E>( superieur.premier().getValeur() ) );
			} else {
				setPremierSup(null);
			}
		}
	}

	/**
	 * Retourne le nombre de valeurs qu'il y a dans la liste milieu.
	 * <p>
	 * Donc, le nombre de valeurs dans la liste inférieure additionné au nombre de valeur dans la liste supérieure.
	 * </p>
	 *
	 * @return nombre Le nombre de valeurs dans la liste milieu.
	 */
	public int taille() {
		return superieur.nombreElementDansListeChainee() + inferieur.nombreElementDansListeChainee();
	}

	/**
	 * Change les valeurs des Noeuds PremierInf et PremierSup pour l'ancienne et la nouvelle ListeMilieu.
	 * @param nouvelle : La nouvelle ListeMilieu.
	 */
	public void setPremiersElements( ListeMilieu<E> nouvelle ) {
		if ( inferieur.nombreElementDansListeChainee() != 0 ) {
			setPremierInf( new Noeud<E>( inferieur.premier().getValeur() ) );
		} else {
			setPremierInf(null);
		}
		if ( superieur.nombreElementDansListeChainee() != 0 ) {
			setPremierSup( new Noeud<E>( superieur.premier().getValeur() ) );
		} else {
			setPremierSup(null);
		}
		if ( nouvelle.inferieur.nombreElementDansListeChainee() != 0 ) {
			nouvelle.setPremierInf( new Noeud<E>( nouvelle.inferieur.premier().getValeur() ) );
		} else {
			nouvelle.setPremierInf(null);
		}
		if ( nouvelle.superieur.nombreElementDansListeChainee() != 0 ) {
			nouvelle.setPremierSup( new Noeud<E>( nouvelle.superieur.premier().getValeur() ) );
		} else {
			nouvelle.setPremierSup(null);
		}
	}

	/*
	 TOSTRING
	 */
	@Override
	public String toString() {
		return super.toString();
	}
}
