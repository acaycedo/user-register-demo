package exceptions;

public class UserAlreadyExistException extends RuntimeException {

    public UserAlreadyExistException(){
        super("El usuario ya existe en el sistema");
    }
    
}
