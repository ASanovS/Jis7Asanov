package lesson10.exceprions.userValidationService;

public class UserValidationDemo {
    public static void main(String[] args) {
        UserValidator validationUserService = new UserValidator();

        User tom = new User("Tom", "Black", 130);
        User tom1 = new User(null, "Black", 120);

        validationUserService.validateUser(tom);
        validationUserService.validateUser(tom1);
    }
}

