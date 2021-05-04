/**
 * Cette classe permet de gérer des liste simplement chaînées.
 * <p>
 * La liste chaînée est programmé de sorte qu'elle contient des objets. Or, si on veut travailler directement avec des
 * valeurs numériques, il va faloir stocker des objects de type Integer ou Double (qui sont aussi des objets).
 * </p>
 */
class ListeSimplementChainee<T extends Comparable<T>> {
	/*
	 VARIABLES & CONSTANTES
	 */
	private Noeud<T> debut = null;
	private Noeud<T> fin = null;
	private Noeud<T> courant = null;

	/*
	 CONSTRUCTEURS
	 */

	/**
	 * Construit une liste simplement chaînée initialement vide (par défaut).
	 */
	public ListeSimplementChainee() {
	}


	/*
     SETTER(S)
     */
	public void setDebut( Noeud<T> debut ) {
		this.debut = debut;
	}

	public void setFin( Noeud<T> fin ) {
		this.fin = fin;
	}

	public void setCourant( Noeud<T> courant ) {
		this.courant = courant;
	}

	/*
	 MÉTHODES
	 */

	/**
	 * Ajoute un élément à une liste simplement chaînée.
	 *
	 * @param valeur L'élément ajouté à la listeIndex.
	 */
	public void ajouterElementFin( T valeur ) {
		Noeud<T> nouvelleFin = new Noeud<>( valeur );

		if ( debut == null ) {
			debut = nouvelleFin;
			fin = nouvelleFin;
			courant = nouvelleFin;
		} else {
			this.fin.setSuivant( nouvelleFin );
			fin = nouvelleFin;
		}
	}

	/**
	 * Enlève le premier de la liste simplement chaînée et le retourne.
	 *
	 * @return sortie : le premier élément de la liste simplement chaînée.
	 * @throws ListeVideException L'exception s'il y a une liste vide.
	 */
	public T enlever() throws ListeVideException {
		T sortie = null;

		if ( !aCourant() ) {
			throw new ListeVideException( "Liste vide." );
		}
		if ( this.nombreElementDansListeChainee() == 1 ) {
			fin = null;
		}
		sortie = this.debut.getValeur();
		debut = this.debut.getSuivant();
		courant = debut;

		return sortie;
	}

	/**
	 * Ajoute la valeur dans la liste simplement chaînée en ordre croissant (Sert à la liste supérieure de
	 * ListeMilieu).
	 *
	 * @param valeur : la valeur à insérer dans la liste simplement chaînée croissante.
	 */
	public void ajouterElementCroissant( T valeur ) {
		boolean place = false;
		Noeud<T> apres = debut;
		Noeud<T> precedent = null;
		Noeud<T> ajout = new Noeud<>( valeur );

		if ( !aCourant() || valeur.compareTo( this.fin.getValeur() ) > 0 ) {
			this.ajouterElementFin( valeur );
		} else if ( valeur.compareTo( this.debut.getValeur() ) < 0 ) {
			ajout.setSuivant( apres );
			this.setDebut( ajout );
		} else {
			while ( !place ) {
				if ( valeur.compareTo( apres.getValeur() ) < 0 ) {
					ajout.setSuivant( apres );
					assert precedent != null;
					precedent.setSuivant( ajout );
					place = true;
				}
				if ( valeur.compareTo( apres.getValeur() ) == 0 ) {
					place = true;
				}
				precedent = apres;
				apres = apres.getSuivant();
			}
		}
	}

	/**
	 * Ajoute la valeur dans la liste simplement chaînée en ordre décroissant (Sert à la liste inférieur de
	 * ListeMilieu).
	 *
	 * @param valeur : la valeur à insérer dans la liste simplement chaînée décroissante.
	 */
	public void ajouterElementDecroissant( T valeur ) {
		boolean place = false;
		Noeud<T> apres = debut;
		Noeud<T> precedent = null;
		Noeud<T> ajout = new Noeud<>( valeur );

		if ( !aCourant() || valeur.compareTo( fin.getValeur() ) < 0 ) {
			ajouterElementFin( valeur );
		} else if ( valeur.compareTo( debut.getValeur() ) > 0 ) {
			ajout.setSuivant( apres );
			setDebut( ajout );
		} else {
			while ( !place ) {
				if ( valeur.compareTo( apres.getValeur() ) == 0 ) {
					place = true;
				}
				if ( valeur.compareTo( apres.getValeur() ) > 0 ) {
					ajout.setSuivant( apres );
					assert precedent != null;
					precedent.setSuivant( ajout );
					place = true;
				}
				precedent = apres;
				apres = apres.getSuivant();
			}
		}
	}

	/**
	 * Supprime la valeur de la liste simplement chaînée si elle est présente.
	 *
	 * @param valeur La valeur à supprimer dans une liste simplement chaînée.
	 */
	public void supprimerElement( T valeur ) {
		T test = null;

		if ( aCourant() ) {
			int element = nombreElementDansListeChainee();
			while ( element != 0 ) {
				try {
					test = this.enlever();
				} catch ( ListeVideException e ) {
					e.printStackTrace();
				}
				if ( valeur.compareTo( test ) != 0 ) {
					this.ajouterElementFin( test );
				}
				element--;
			}
		}
	}

	/**
	 * Teste si l'élément courant n'est pas null dans une liste simplement chaînée.
	 *
	 * @return true si l'élément courant n'est pas null, false sinon.
	 */
	public boolean aCourant() {
		return ( courant != null );
	}

	/**
	 * Retourne la valeur de l'élément courant d'une liste simplement chaînée.
	 *
	 * @return valeur La valeur de l'élément courant dans une liste simplement chaînée.
	 */
	public T valeur() {
		T valeur = null;
		if ( this.aCourant() ) {
			valeur = ( courant.getValeur() );
		}
		return valeur;
	}

	/**
	 * Retourne le premier élément d'une liste simplement chaînée.
	 *
	 * @return noeud Le premier élément d'une liste simplement chaînée.
	 */
	public Noeud<T> premier() {
		courant = debut;
		Noeud<T> noeud = null;

		if ( debut != null ) {
			noeud = debut;
		}
		return noeud;
	}

	/**
	 * Retourne l'élément suivant dans une liste simplement chaînée.
	 *
	 * @return noeud L'élément suivant dans une liste simplement chaînée.
	 */
	public Noeud<T> suivant() {
		Noeud<T> noeud = null;

		if ( courant != null ) {
			noeud = courant.getSuivant();
		}
		return noeud;
	}

	/**
	 * Retourne le dernier élément dans une liste simplement chaînée.
	 *
	 * @return noeud Le dernier élément dans une liste simplement chaînée.
	 */
	public Noeud<T> dernier() {
		Noeud<T> noeud = null;

		if ( courant != null ) {
			noeud = fin;
		}
		return noeud;
	}

	/**
	 * Affiche/imprime une liste simplement chaînée à la console.
	 * <p>
	 * Prend les éléments un à la suite de l'autre dans une liste simplement chaînée et les imprime séquentiellement.
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
	 * Retourne le nombre d'élément dans une liste simplement chaînée.
	 *
	 * @return compteur Le nombre d'élément dans la liste simplement chaînée.
	 */
	public int nombreElementDansListeChainee() {
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

	/**
	 * Ajuste une liste simplement chaînée. TODO -> Peut-être ajouter des détails en description
	 *
	 * @param sup Une liste simplement chaînée.
	 */
	public void ajustementListes( ListeSimplementChainee<T> sup ) {
		T element = null;
		while ( this.nombreElementDansListeChainee() != sup.nombreElementDansListeChainee() + 1 &&
				this.nombreElementDansListeChainee() != sup.nombreElementDansListeChainee() ) {
			if ( this.nombreElementDansListeChainee() + 1 <= sup.nombreElementDansListeChainee() ) {
				try {
					element = sup.enlever();
				} catch ( ListeVideException e ) {
					e.printStackTrace();
				}
				this.ajouterElementDecroissant( element );
			}
			if ( this.nombreElementDansListeChainee() >= sup.nombreElementDansListeChainee() + 2 ) {
				try {
					element = enlever();
				} catch ( ListeVideException e ) {
					e.printStackTrace();
				}
				sup.ajouterElementCroissant( element );
			}
		}
	}

	/*
	 TOSTRING
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
