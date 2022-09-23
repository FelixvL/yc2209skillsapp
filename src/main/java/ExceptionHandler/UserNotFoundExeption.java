package ExceptionHandler;

public class UserNotFoundExeption extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public UserNotFoundExeption(Long id) {
        super("Geen gebruiker gevonden");
    }

}
