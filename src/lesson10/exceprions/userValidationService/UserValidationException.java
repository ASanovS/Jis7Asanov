package lesson10.exceprions.userValidationService;

public class UserValidationException extends RuntimeException{

    UserValidationException(String msg) {
        super(msg);
    }
}
