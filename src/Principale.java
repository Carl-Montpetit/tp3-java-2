/**
 * Cette classe permet de lancer/tester le logiciel.
 */
public class Principale {
	public static void main( String[] args ) {
		// Code pour lancer/tester le logiciel...
		/*
		 VARIABLES, OBJECTS ET CONSTANTES
		 */


		/*
		 DRIVE CODE
		 */

//		try {
//			Integer test = liste.enlever();
//		} catch ( ListeVideException listeVide ) {
//			listeVide.printStackTrace();
//		}
//		liste.imprimerListeChainee();
//		nbrElements = liste.nombreElementDansListeChainee();
//		System.out.println( "Nombre d'éléments = taille de la liste: " + nbrElements + "\n" );
//
//		try {
//			Integer test = liste.enlever();
//		} catch ( ListeVideException listeVide ) {
//			listeVide.printStackTrace();
//		}
//		liste.imprimerListeChainee();
//		nbrElements = liste.nombreElementDansListeChainee();
//		System.out.println( "Nombre d'éléments = taille de la liste: " + nbrElements + "\n" );

//		ListeSimplementChainee<Integer> liste1 = new ListeSimplementChainee<>();
//		liste1.ajouterElementCroissant( 3 );
//		liste1.imprimerListeChainee();
//		liste1.ajouterElementCroissant( 2 );
//		liste1.imprimerListeChainee();
//		liste1.ajouterElementCroissant( 5 );
//		liste1.imprimerListeChainee();
//		liste1.ajouterElementCroissant( 4 );
//		liste1.imprimerListeChainee();
//		liste1.ajouterElementCroissant( 4 );
//		liste1.imprimerListeChainee();
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

//		ListeSimplementChainee<Integer> liste2 = new ListeSimplementChainee<>();
//		liste2.ajouterElementDecroissant( 3 );
//		liste2.imprimerListeChainee();
//		liste2.ajouterElementDecroissant( 2 );
//		liste2.imprimerListeChainee();
//		liste2.ajouterElementDecroissant( 5 );
//		liste2.imprimerListeChainee();
//		liste2.ajouterElementDecroissant( 4 );
//		liste2.imprimerListeChainee();
//		liste2.ajouterElementDecroissant( 4 );
//		liste2.imprimerListeChainee();
//		liste2.supprimerElement( 3 );
//		liste2.imprimerListeChainee();
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
		test.inserer( -8 );
		System.out.println("INF : ");
		test.getInferieur().imprimerListeChainee();
		System.out.println("=================================================");
		test.inserer( -5 );
		System.out.println("SUP : ");
		test.getSuperieur().imprimerListeChainee();
		System.out.println("INF : ");
		test.getInferieur().imprimerListeChainee();
		System.out.println("=================================================");
		test.inserer( 1 );
		System.out.println("SUP : ");
		test.getSuperieur().imprimerListeChainee();
		System.out.println("INF : ");
		test.getInferieur().imprimerListeChainee();
		System.out.println("=================================================");
		test.inserer( 4 );
		System.out.println("SUP : ");
		test.getSuperieur().imprimerListeChainee();
		System.out.println("INF : ");
		test.getInferieur().imprimerListeChainee();
		System.out.println("=================================================");
		test.inserer( 9 );
		System.out.println("SUP : ");
		test.getSuperieur().imprimerListeChainee();
		System.out.println("INF : ");
		test.getInferieur().imprimerListeChainee();
		System.out.println("=================================================");
		test.inserer( 11 );
		System.out.println("SUP : ");
		test.getSuperieur().imprimerListeChainee();
		System.out.println("INF : ");
		test.getInferieur().imprimerListeChainee();
		System.out.println("=================================================");
		test.inserer( 16 );
		System.out.println("SUP : ");
		test.getSuperieur().imprimerListeChainee();
		System.out.println("INF : ");
		test.getInferieur().imprimerListeChainee();
		System.out.println("=================================================");
		test.inserer( 20 );
		System.out.println("SUP : ");
		test.getSuperieur().imprimerListeChainee();
		System.out.println("INF : ");
		test.getInferieur().imprimerListeChainee();
		System.out.println("=================================================");
		//OUTPUT
		/*
		INF :
		ListeSimplementChainee: -8

		=================================================
		SUP :
		ListeSimplementChainee: -5

		INF :
		ListeSimplementChainee: -8

		=================================================
		SUP :
		ListeSimplementChainee: 1

		INF :
		ListeSimplementChainee: -5 -8

		=================================================
		SUP :
		ListeSimplementChainee: 1 4

		INF :
		ListeSimplementChainee: -5 -8

		=================================================
		SUP :
		ListeSimplementChainee: 4 9

		INF :
		ListeSimplementChainee: 1 -5 -8

		=================================================
		SUP :
		ListeSimplementChainee: 4 9 11

		INF :
		ListeSimplementChainee: 1 -5 -8

		=================================================
		SUP :
		ListeSimplementChainee: 9 11 16

		INF :
		ListeSimplementChainee: 4 1 -5 -8

		=================================================
		SUP :
		ListeSimplementChainee: 9 11 16 20

		INF :
		ListeSimplementChainee: 4 1 -5 -8

		=================================================
		 */

//		System.out.println(test.getPremierSup().getValeur());
//		System.out.println(test.getPremierInf().getValeur());
//
//		System.out.println(test.maxima());
//		System.out.println(test.milieu());
//		System.out.println(test.minima());

//		test.supprimer(0);
//		test.getSuperieur().imprimerListeChainee();
//		test.getInferieur().imprimerListeChainee();
//		test.supprimer(-2);
//		test.getSuperieur().imprimerListeChainee();
//		test.getInferieur().imprimerListeChainee();
//		test.supprimer(5);
//		test.getSuperieur().imprimerListeChainee();
//		test.getInferieur().imprimerListeChainee();

		ListeMilieu<Integer> test2 = test.diviser();
		System.out.println("ORIGINALE -> SUP : ");
		test.getSuperieur().imprimerListeChainee();
		System.out.println("ORIGINALE -> INF : ");
		test.getInferieur().imprimerListeChainee();
		System.out.println("=================================================");
		System.out.println("RESULTAT -> SUP : ");
		test2.getSuperieur().imprimerListeChainee();
		System.out.println("RESULTAT -> INF : ");
		test2.getInferieur().imprimerListeChainee();
		System.out.println("=================================================");

		// OUTPUT
		/*
		SUP :
		ListeSimplementChainee: -5

		INF :
		ListeSimplementChainee: -8

		=================================================
		SUP :
		ListeSimplementChainee: 1

		INF :
		ListeSimplementChainee: -5 -8

		=================================================
		 */
	}
}
