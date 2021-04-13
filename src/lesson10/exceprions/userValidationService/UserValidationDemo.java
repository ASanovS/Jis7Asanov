package lesson10.exceprions.userValidationService;

public class UserValidationDemo {
    public static void main(String[] args) {
        ValidationUserService validationUserService = new ValidationUserService();

        User tom = new User("Tom", "Black", 30);
        User tom1 = new User("Tom1", "Black", 130);

        validationUserService.validateService(tom);
        validationUserService.validateService(tom1);
    }
}

