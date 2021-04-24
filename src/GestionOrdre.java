import java.util.Comparator;

/**
 * Cette classe permet de gérer l'ordre des éléments dans la ListeSimplementChainee.
 * TODO -> ***PAS ENCORE FINIT JE SUIS ENTRAIN DE PENSER ET TESTER CA!***
 */
public class GestionOrdre implements Comparator<Integer> {
	@Override
	public int compare( Integer o1,Integer o2 ) {
		return 0;
	}

	@Override
	public Comparator<Integer> reversed() {
		return Comparator.super.reversed();
	}
}
