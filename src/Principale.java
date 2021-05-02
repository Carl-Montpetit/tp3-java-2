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
		System.out.println( "INF : " );
		test.getInferieur().imprimerListeChainee();
		System.out.println( "=================================================" );
		test.inserer( -5 );
		System.out.println( "SUP : " );
		test.getSuperieur().imprimerListeChainee();
		System.out.println( "INF : " );
		test.getInferieur().imprimerListeChainee();
		System.out.println( "=================================================" );
		test.inserer( 1 );
		System.out.println( "SUP : " );
		test.getSuperieur().imprimerListeChainee();
		System.out.println( "INF : " );
		test.getInferieur().imprimerListeChainee();
		System.out.println( "=================================================" );
		test.inserer( 4 );
		System.out.println( "SUP : " );
		test.getSuperieur().imprimerListeChainee();
		System.out.println( "INF : " );
		test.getInferieur().imprimerListeChainee();
		System.out.println( "=================================================" );
		test.inserer( 9 );
		System.out.println( "SUP : " );
		test.getSuperieur().imprimerListeChainee();
		System.out.println( "INF : " );
		test.getInferieur().imprimerListeChainee();
		System.out.println( "=================================================" );
		test.inserer( 11 );
		System.out.println( "SUP : " );
		test.getSuperieur().imprimerListeChainee();
		System.out.println( "INF : " );
		test.getInferieur().imprimerListeChainee();
		System.out.println( "=================================================" );
		test.inserer( 16 );
		System.out.println( "SUP : " );
		test.getSuperieur().imprimerListeChainee();
		System.out.println( "INF : " );
		test.getInferieur().imprimerListeChainee();
		System.out.println( "=================================================" );
		test.inserer( 20 );
		System.out.println( "SUP : " );
		test.getSuperieur().imprimerListeChainee();
		System.out.println( "INF : " );
		test.getInferieur().imprimerListeChainee();
		System.out.println( "=================================================" );
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

		ListeMilieu<Integer> testDiviser = test.diviser();
		System.out.println( "ORIGINALE -> SUP : " );
		test.getSuperieur().imprimerListeChainee();
		System.out.println( "ORIGINALE -> INF : " );
		test.getInferieur().imprimerListeChainee();
		System.out.println( "=================================================" );
		System.out.println( "RESULTAT -> SUP : " );
		testDiviser.getSuperieur().imprimerListeChainee();
		System.out.println( "RESULTAT -> INF : " );
		testDiviser.getInferieur().imprimerListeChainee();
		System.out.println( "=================================================" );

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
		ListeIndex<Integer> test2 = new ListeIndex<>();
		test2.ajouteListeMilieuDansIndex( test );
		System.out.println( test2.toString() );
		System.out.println( "=================================================" );
		/*
		OUTPUT :
		=================================================
		ListeIndex{debutIndex=Noeud{valeur=ListeMilieu{superieur=ListeSimplementChainee{debut=
		Noeud{valeur=1, suivant=Noeud{valeur=4, suivant=null}}, fin=Noeud{valeur=4, suivant=null}, courant=
		Noeud{valeur=1, suivant=Noeud{valeur=4, suivant=null}}}, inferieur=ListeSimplementChainee{debut=
		Noeud{valeur=-5, suivant=Noeud{valeur=-8, suivant=null}}, fin=Noeud{valeur=-8, suivant=null}, courant=
		Noeud{valeur=-5, suivant=Noeud{valeur=-8, suivant=null}}}, premierInf=Noeud{valeur=-5, suivant=null}, premierSup=
		Noeud{valeur=1, suivant=null}}, suivant=null}, finIndex=Noeud{valeur=
		ListeMilieu{superieur=ListeSimplementChainee{debut=Noeud{valeur=1, suivant=
		Noeud{valeur=4, suivant=null}}, fin=Noeud{valeur=4, suivant=null}, courant=Noeud{valeur=1, suivant=
		Noeud{valeur=4, suivant=null}}}, inferieur=ListeSimplementChainee{debut=Noeud{valeur=-5, suivant=
		Noeud{valeur=-8, suivant=null}}, fin=Noeud{valeur=-8, suivant=null}, courant=Noeud{valeur=-5, suivant=
		Noeud{valeur=-8, suivant=null}}}, premierInf=Noeud{valeur=-5, suivant=null}, premierSup=
		Noeud{valeur=1, suivant=null}}, suivant=null}}
		=================================================
		 */
		System.out.println( test.estPresent( 4 ));

		ListeSimplementChainee<Integer> allo = new ListeSimplementChainee<>();
		allo.ajouterElementCroissant(3);
		allo.ajouterElementCroissant(5);
		allo.ajouterElementCroissant(0);
		allo.ajouterElementCroissant(4);
		allo.imprimerListeChainee();

		ListeSimplementChainee<Integer> allo2 = new ListeSimplementChainee<>();
		allo2.ajouterElementDecroissant(3);
		System.out.println("inserer 3");
		allo2.ajouterElementDecroissant(5);
		System.out.println("inserer 5");
		allo2.ajouterElementDecroissant(-4);
		System.out.println("inserer -4");
		allo2.ajouterElementDecroissant(4);
		System.out.println("inserer 4");
		allo2.ajouterElementDecroissant(4);
		System.out.println("inserer 2e 4");
		allo2.imprimerListeChainee();

		/*
		OUTPUT :
		ListeSimplementChainee: 0 3 4 5

		ListeSimplementChainee: 5 4 3 -4

		 */
	}
}
