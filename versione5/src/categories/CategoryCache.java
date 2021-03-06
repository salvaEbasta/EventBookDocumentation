package categories;

import java.util.ArrayList;

/**Classe che consente di implementare il Design Pattern Prototype per ottenere istanze di categorie da un set predefinito.<br>
 * Da modificare in caso di aggiunta di una nuova categoria.<br>
 * @author Matteo Salvalai [715827], Lorenzo Maestrini[715780], Jacopo Mora [715149]
 *
 */
public class CategoryCache {

	/**
	 * array contenente le istanze delle categorie da clonare
	 */
	private static ArrayList<Category> set = new ArrayList<Category>();

	/**
	 * Costruttore
	 */
	public CategoryCache() {
		loadCache();
	}
	/**
	 * Carica le istanze predefinite da clonare
	 */
	private static void loadCache() {
		set.add(new FootballMatch());
		set.add(new Concert());
	}
	
	/**Restituisce il clone di una particolare istanza di categoria
	 * @param type l'intestazione della categoria di cui si vuole l'istanza
	 * @return l'istanza della categoria di cui si è inserito il nome, null se si è inserito un tipo sbagliato
	 */
	public Category getCategory(String type) {
		if(!contains(type))
			return null;
		return ((Category) set.stream()
								.filter((c)->c.hasName(type))
								.findFirst().get().clone()
				).reset();
	}
	/**
	 * Controlla se contiene la categoria di cui si è inserito il nome
	 * @param key il nome della categoria
	 * @return True - la contiene<br>False - non la contiene
	 */
	public boolean contains(String key) {
		return set.stream()
					.anyMatch((c)->c.hasName(key));
	}
}
