/**
 * Cette classe permet de lancer/tester le logiciel.
 */
public class Principale {
	public static void main( String[] args ) {
		// Code pour lancer/tester le logiciel...
		/**
		 * VARIABLES, OBJECTS ET CONSTANTES
		 */
		ListeSimplementChainee<Integer> liste = new ListeSimplementChainee<Integer>();
		int nbrElements = 0;
		/**
		 * DRIVE CODE
		 */
		// Création d'une liste de 8 éléments pour mimic l'exemple du tp dans l'énoncé.
		liste.ajouterElement( -8 );
		liste.ajouterElement( -5 );
		liste.ajouterElement( 1 );
		liste.ajouterElement( 4 );
		liste.ajouterElement( 9 );
		liste.ajouterElement( 11 );
		liste.ajouterElement( 16 );
		liste.ajouterElement( 20 );
		// TODO -> Ici il nous faudrait une gestion de l'ordre des éléments dans la liste dans l'exemple l'ordre est
		//  bon mais faut gérer pour les cas désordonnés -> Implémenté par l'interface comparator. J'ai créé une
		//  classe GestionOrdre pour ca.

		// À suivre...

		System.out.println( liste.toString() + "\n" );
		// OUTPUT:
		// ListeSimplementChainee{debut=Noeud{valeur=-8, suivant=Noeud{valeur=-5, suivant=Noeud{valeur=1,
		// suivant=Noeud{valeur=4, suivant=Noeud{valeur=9, suivant=Noeud{valeur=11, suivant=Noeud{valeur=16,
		// suivant=Noeud{valeur=20, suivant=null}}}}}}}}, fin=Noeud{valeur=20, suivant=null},
		// courant=Noeud{valeur=-8, suivant=Noeud{valeur=-5, suivant=Noeud{valeur=1, suivant=Noeud{valeur=4,
		// suivant=Noeud{valeur=9, suivant=Noeud{valeur=11, suivant=Noeud{valeur=16,
		// suivant=Noeud{valeur=20, suivant=null}}}}}}}}}
		liste.imprimerListeChainee( liste );
		// OUTPUT:
		// ListeSimplementChainee: -8 -5 1 4 9 11 16 20
		nbrElements = liste.nombreElementDansListeChainee();
		System.out.println( "Nombre d'éléments = taille de la liste: " + nbrElements + "\n" );
		try {
			Integer test = liste.enlever();
		} catch (ListeVide listeVide) {
			listeVide.printStackTrace();
		}
		liste.imprimerListeChainee( liste );
		// OUTPUT:
		// Nombre d'éléments = taille de la liste: 8
		// TODO -> Maintenant faut diviser la liste en deux -> Liste sup et inf -> Utiliser la classe ListeMilieu ->
		//  Faire pointer un pointeur sur le milieu (premier élément de la liste inf) -> Va peut-être faloir prendre
		//  en compte si la taille de la liste est un nombre pair ou impair pour ce pointeur.

		// À suivre...
	}
}
