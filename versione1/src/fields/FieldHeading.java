package fields;

/**Classe con il compito di contenere una descrizione corredata da informazioni relative alla sua obbligatorietà
 * @author Matteo Salvalai [715827], Lorenzo Maestrini [715780], Jacopo Mora [715149]
 *
 */
public enum FieldHeading{
	
	TITOLO("Titolo", "Il titolo dell'evento", false),
	NUMEROPARTECIPANTI("Numero di Partecipanti", "Numero di persone da coinvolgere nell'evento", true),
	TERMINEISCRIZIONE("Termine ultimo iscrizione", "Ultimo giorno utile per iscriversi all'evento", true),
	LUOGO("Luogo", "Indirizzo del luogo che ospiterà l'evento oppure, se l'evento è itinerante, il luogo di ritrovo dei partecipanti", true),
	DATA("Data", "Data in cui l'evento proposto deve svolgersi o, nel caso l'evento non termini nello stesso giorno in cui ha inizio, la data dell'inizio dell'evento", true),
	ORA("Ora", "Ora in cui i partecipanti dovranno trovarsi nel luogo \"Luogo\" in data \"Data\" per dare inizio all'evento", true),
	DURATA("Durata", "Durata in termini di numero (approssimativo) di ore e minuti, per gli eventi che si esauriscono in un sol giorno, o in termini di numero esatto di giorni, per gli eventi che occupano più giorni	consecutivi", false),
	QUOTAINDIVIDUALE("Quota individuale", "Spesa (o una stima della stessa) che ogni partecipante all'iniziativa dovrà sostenere (Può anche essere nulla)", true),
	COMPRESONELLAQUOTA("Compreso nella quota", "Tutte le voci di spesa comprese nell'ammontare indicato nella \"Quota individuale\"", false),
	DATACONCLUSIVA("Data conclusiva", "Data di conclusione dell'evento", false),
	ORACONCLUSIVA("Ora conclusiva", "Ora di conclusione dell'evento", false),
	NOTE("Note", "Informazioni aggiuntive ", false),
	
	//Campi della partita
	GENERE("Genere", "Genere (maschile o femminile) dei giocatori", true),
	FASCIADIETA("Fascia di età", "Estremo inferiore e superiore per l'età dei giocatori", true);
	
	/**
	 * Contiene il nome
	 */
	private String name;
	/**
	 * Contiene la descrizione
	 */
	private String description;
	/**
	 * Contiene informazioni sull'obbligatorietà
	 */
	private boolean binding;
	/**
	 * Formattazione per la visualizzazione testuale dell'oggetto
	 */
	private final static String TOSTRING_FORMAT = "Nome: %s%nDescrizione: %s%nObbligatorio: %s%n";
	
	/**Restituisce il nome
	 * @return Il nome
	 */
	public String getName() {
		return name;
	}
	
	/**Restituisce la descrizione
	 * @return La descrizione
	 */
	public String getDescription() {
		return description;
	}
	
	/**Controlla se è obbligatorio
	 * @return True - è obbligatorio \n False - non è obbligatorio
	 */
	public boolean isBinding() {
		return binding;
	}
	
	/**Costruttore
	 * @param name Il nome
	 * @param description La descrizione
	 * @param binding Se obbligatorio
	 */
	private FieldHeading(String name, String description, boolean binding) {
		this.name = name;
		this.description = description;
		this.binding = binding;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	public String toString() {
		return String.format(TOSTRING_FORMAT, name, description, binding);
	}
	
}