package lesson10.exceprions.userValidationService;

public class UserValidationDemo {
    public static void main(String[] args) {
        UserValidationService service = new UserValidationService();

        User tom = new User("Tom", "Black", 30);
        User tom1 = new User("Tom1", "Black", 130);

        service.validate(tom);
        //service.validate(tom1); => this return runtime exception
    }
}

