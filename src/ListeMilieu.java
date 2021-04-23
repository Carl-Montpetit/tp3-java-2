import java.util.Comparator;

/**
 * Cette classe définie une listeMilieu qui est une structure (une liste chaînée accédée par le milieu) qui va gérer
 * l'accès à plusieurs listes chaînées (ListeMilieu) à l'aide d'un index.
 * <p>
 * Les éléments de cette liste sont maintenus triés.
 *
 * @param <E> elements de la listeMilieu
 */
public class ListeMilieu< E extends Comparable< E > > {
	/**
	 * CONTIENT
	 */
	// Une liste de valeurs de type E -> Construite avec une liste simplement chaînée
	public void inferieur() {}

	// Une liste de valeurs de type E -> Construite avec une liste simplement chaînée
	public void superieur() {}

	/**
	 * INVARIANTS (consulter les formules dans l'énoncé au besoin) -> Aide mémoire pour l'instant
	 */
	// 1. Toutes les valeurs V_i de la liste inférieure sont plus petites ou égales aux valeurs de la liste supérieure.

	// 2. Les valeurs de la liste supérieure sont triées en ordre croissant.

	// 3. Les valeurs de la liste inférieure sont triées en ordre décroissant.

	// 4. La taille de la liste inférieure est égale à la taille de la liste supérieure ou contient une valeur de plus.

	/*
	 * LES SERVICES (consulter les formules mathématiques dans l'énoncé au besoin)
 	 */

	/**
	 * Permet de constuire une liste vide (par défaut) du Type ListeMilieu
	 */
	public ListeMilieu() {
	}

	/**
	 * Permet de construire une nouvelle ListeMilieu(L*).
	 * <p>
	 * Les éléments de la liste supérieure sont déplacés dans la novuelle ListeMilieu.
	 * <p>
	 * Finalement, une partie des éléments de la liste inférieure sont déplacés dans la liste supérieure afin de
	 * rétabir l'invariant.
	 * <p>
	 *
 	 * @return
	 */
	public ListeMilieu<E> diviser() {
		return null;
	}

	/**
	 * Permet d'ajouter un élément dans la ListeMilieu.
	 * <p>
	 * Si la liste inférieure est vide, alors valeur (ou v dans l'énoncé) est ajouté dans la liste inférieure.
	 * <p>
	 * Si la première valeur de la liste inférieure est plus grande ou égale à v, alors v est ajouté dans la liste
	 * inférieure, sinon v est ajouté dans la liste supérieure.
	 *
	 * @param valeur
	 */
	public void inserer( E valeur ) {
	}

	/**
	 * Retourne la première valeur de la liste inférieure.
	 * <p>
	 * Cela ne modifie pas la ListeMilieu.
	 * </p>
	 *
	 * @return
	 */
	public E milieu() {
		return null;
	}

	/**
	 * Retourne la dernière valeur de la liste inférieure.
	 * <p>
	 * Cela ne modifie pas la ListeMilieu.
	 * </p>
	 *
	 * @return
	 */
	public E minima() {
		return null;
	}

	/**
	 * Retourne la dernière valeur de la liste supérieure.
	 * <p>
	 * Cela ne modifie pas la ListeMilieu.
	 * </p>
	 *
	 * @return
	 */
	public E maxima() {
		return null;
	}

	/**
	 * Trouve la première occurrence de la valeur dans la ListeMilieu et l'enlève de la liste.
	 *
	 * @param valeur
	 */
	public void supprimer( E valeur ) {
	}

	/**
	 * Retourne le nombre de valeurs qu'il y a dans la ListeMilieu.
	 * <p>
	 * Donc, le nombre de valeurs dans la liste inférieure additionné au nombre de valeur dans la liste supérieure.
	 * </p>
	 *
	 * @return
	 */
	public int taille() {
		return 0;
	}

	/**
	 * METHODES DU GENERATE
 	 */
	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals( Object obj ) {
		return super.equals( obj );
	}

	@Override
	public String toString() {
		return super.toString();
	}
}