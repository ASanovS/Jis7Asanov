package lesson10.exceprions.userValidationService;

public class UserValidationException{

    public void exception() {
        throw new RuntimeException("Exception: data validation error, please enter correct data.");
    }
}
