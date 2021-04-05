package lesson10.exceprions.userValidationService;

public class UserValidationService {

    public void validate(User user) {
        int lengthUserFirstName = user.getFirstName().length();
        int lengthUserLastName = user.getLastName().length();

        if (lengthUserFirstName < 3 && lengthUserFirstName > 15) {

        } else if (lengthUserLastName < 3 && lengthUserLastName > 15) {

        } else if (user.getAge() < 0 && user.getAge() > 120) {

        }
    }
}
