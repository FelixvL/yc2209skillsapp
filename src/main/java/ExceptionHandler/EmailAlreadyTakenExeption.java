package ExceptionHandler;

public class EmailAlreadyTakenExeption extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmailAlreadyTakenExeption(String email) {
        super("email adres is al in gebruik ");
    }
	
   
}



