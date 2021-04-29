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
		liste.ajouterElementFin( -8 );
		liste.ajouterElementFin( -5 );
		liste.ajouterElementFin( 1 );
		liste.ajouterElementFin( 4 );
		liste.ajouterElementFin( 9 );
		liste.ajouterElementFin( 11 );
		liste.ajouterElementFin( 16 );
		liste.ajouterElementFin( 20 );
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
		liste.imprimerListeChainee();
		// OUTPUT:
		// ListeSimplementChainee: -8 -5 1 4 9 11 16 20
		nbrElements = liste.nombreElementDansListeChainee();
		System.out.println( "Nombre d'éléments = taille de la liste: " + nbrElements + "\n" );
		// OUTPUT:
		// Nombre d'éléments = taille de la liste: 8
		// TODO -> Maintenant faut diviser la liste en deux -> Liste sup et inf -> Utiliser la classe ListeMilieu ->
		//  Faire pointer un pointeur sur le milieu (premier élément de la liste inf) -> Va peut-être faloir prendre
		//  en compte si la taille de la liste est un nombre pair ou impair pour ce pointeur.
		try {
			Integer test = liste.enlever();
		} catch (ListeVideException listeVide) {
			listeVide.printStackTrace();
		}
		liste.imprimerListeChainee();
		nbrElements = liste.nombreElementDansListeChainee();
		System.out.println( "Nombre d'éléments = taille de la liste: " + nbrElements + "\n" );

		try {
			Integer test = liste.enlever();
		} catch (ListeVideException listeVide) {
			listeVide.printStackTrace();
		}
		liste.imprimerListeChainee();
		nbrElements = liste.nombreElementDansListeChainee();
		System.out.println( "Nombre d'éléments = taille de la liste: " + nbrElements + "\n" );




		ListeSimplementChainee<Integer> liste1 = new ListeSimplementChainee<Integer>();

			liste1.ajouterElementCroissant(3);
			liste1.imprimerListeChainee();
			liste1.ajouterElementCroissant(2);
			liste1.imprimerListeChainee();
			liste1.ajouterElementCroissant(5);
			liste1.imprimerListeChainee();
			liste1.ajouterElementCroissant(4);
			liste1.imprimerListeChainee();
			liste1.ajouterElementCroissant(4);
			liste1.imprimerListeChainee();


		// OUTPUT
		// ListeSimplementChainee: 3
		//
		//ListeSimplementChainee: 2 3
		//
		//ListeSimplementChainee: 2 3 5
		//
		//ListeSimplementChainee: 2 3 4 5
		//
		//ListeSimplementChainee: 2 3 4 5

		ListeSimplementChainee<Integer> liste2 = new ListeSimplementChainee<Integer>();

			liste2.ajouterElementDecroissant(3);
			liste2.imprimerListeChainee();
			liste2.ajouterElementDecroissant(2);
			liste2.imprimerListeChainee();
			liste2.ajouterElementDecroissant(5);
			liste2.imprimerListeChainee();
			liste2.ajouterElementDecroissant(4);
			liste2.imprimerListeChainee();
			liste2.ajouterElementDecroissant(4);
			liste2.imprimerListeChainee();
			liste2.supprimerElement(3);
			liste2.imprimerListeChainee();


		// OUTPUT
		// ListeSimplementChainee: 3
		//
		//ListeSimplementChainee: 3 2
		//
		//ListeSimplementChainee: 5 3 2
		//
		//ListeSimplementChainee: 5 4 3 2
		//
		//ListeSimplementChainee: 5 4 3 2
		//
		//ListeSimplementChainee: 5 4 2

		ListeMilieu<Integer> test = new ListeMilieu<>();
		test.inserer(3);
		test.getInferieur().imprimerListeChainee();
		test.inserer(5);
		test.getSuperieur().imprimerListeChainee();
		test.getInferieur().imprimerListeChainee();
		test.inserer(-1);
		test.getSuperieur().imprimerListeChainee();
		test.getInferieur().imprimerListeChainee();
		test.inserer(-2);
		test.getSuperieur().imprimerListeChainee();
		test.getInferieur().imprimerListeChainee();

		//OUTPUT
		//1)
		//ListeSimplementChainee: 3 -> inf
		//
		//2)
		//ListeSimplementChainee: 5 -> sup
		//
		//ListeSimplementChainee: 3 -> inf
		//
		//3)
		//ListeSimplementChainee: 5
		//
		//ListeSimplementChainee: 3 -1
		//
		//4)
		//ListeSimplementChainee: 3 5
		//
		//ListeSimplementChainee: -1 -2

//		System.out.println(test.getPremierSup().getValeur());
//		System.out.println(test.getPremierInf().getValeur());
//
//		System.out.println(test.maxima());
//		System.out.println(test.milieu());
//		System.out.println(test.minima());

		test.supprimer(0);
		test.getSuperieur().imprimerListeChainee();
		test.getInferieur().imprimerListeChainee();
		test.supprimer(-2);
		test.getSuperieur().imprimerListeChainee();
		test.getInferieur().imprimerListeChainee();
		test.supprimer(5);
		test.getSuperieur().imprimerListeChainee();
		test.getInferieur().imprimerListeChainee();

		// À suivre...
	}
}
