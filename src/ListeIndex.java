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
	/**
	 * CONSTRUCTEUR(S)
	 */
	/**
	 * Construit une liste de ListeMilieu.
	 */
	public void Index() {
	}

	/**
	 * Construit une ListeIndex initialement vide (par défaut).
	 */
	public ListeIndex() {
		super();
	}

	/*
	  INVARIANTS (consulter les formules dans l'énoncé au besoin) -> Aide mémoire pour l'instant
	 */
	// 1. Le nombre de valeurs dans chaque ListeMilieu est plus petit ou égal au double du nombre de ListeMilieu dans
	//      l'index.

	// 2. Les ListeMilieu de l'index sont triés selon leurs minima et maxima.

	/*
	  LES SERVICES
	 */
	/**
	 * Vérifie si une des ListeMilieu contient la valeur en argument.
	 *
	 * @param valeur
	 * @return true si une des ListeMilieu contient la valeur en argument, faux sinon
	 */
	public boolean contient( E valeur ) {
		return false;
	}

	/**
	 * Retourne la somme de toutes les tailles des ListeMilieu(s) contenue dans l'index.
	 *
	 * @return taille La somme des tailles des ListeMilieu(s) dans l'index.
	 */
	public int taille() {
		return 0;
	}

	/**
	 * Retourne le nombre de ListeMilieu contenue dans l'index.
	 *
	 * @return nombre Le nombre de ListeMilieu(s) dans l'index.
	 */
	public int nbrListe() {
		return 0;
	}

	/**
	 * Retourne la ListeMilieu à l'indice i de l'index.
	 *
	 * @param i La position (indice) d'un élément de l'index.
	 * @return liste La liste milieu à la position i de l'index.
	 */
	public ListeMilieu<E> get( int i ) {
		return null;
	}

	/**
	 * TODO à ajuster à la fin du tp.
	 * <p>
	 * Trouve la ListeMilieu de l'index qui peut contenir cette valeur et ajoute la valeur dans cette liste.
	 * <p>
	 * Une ListeMilieu (m_i), qui n'est ***ni la première ni la dernière*** ListeMilieu de l'index, peut contenir une
	 * valeur lorsque cette valeur est plus grande ou égale à son minima et plus petite que le minima de la ListeMilieu
	 * suivante.
	 * <p>
	 * ***La première ListeMilieu (m_0) peut contenir toutes les valeurs qui sont plus petites que sont maxima.***
	 * <p>
	 * La dernière ListeMilieu (m_i) peut contenir une valeur lorsque cette valeur est plus grande ou égale à son
	 * minima.
	 * <p>
	 * Si l'ajout de l'élément dans la liste brise l'invariant (1) de la ListeIndex alors il faudra faire appel à la
	 * méthode deviser de la ListeMilieu qui brise l'invariant. La nouvelle liste est ajoutée dans l'index.
	 * <p>
	 * ***S'il n'y a pas de ListeMilieu dans l'index, alors une nouvelle ListeMilieu est ajoutée et l'élément est placé
	 * dans cette liste.
	 *
	 * @param valeur
	 */
	public void inserer( E valeur ) {
	}

	/**
	 * Trouve la ListeMilieu pouvant contenir la valeur (voire inserer plus haut -> commentaire dans l'énoncé) et
	 * supprime la première occurrence de la valeur dans cette liste.
	 *
	 * @param valeur La valeur à supprimer dans la liste indexe.
	 */
	public void supprimer( E valeur ) {

	}

	/**
	 * TOSTRING
	 */

	@Override
	public String toString() {
		return super.toString();
	}
}
