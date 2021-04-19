package lesson10.exceprions.userValidationService;

public class UserValidationDemo {
    public static void main(String[] args) {
        UserValidator validationUserService = new UserValidator();

        User tom = new User("Tom", "Black", 30);
        User tom1 = new User("Jack", "Black", 130);

        validationUserService.validateUser(tom);
        validationUserService.validateUser(tom1);
    }
}

