package lesson10.exceprions.userValidationService;

public class ValidationUserService {

    private void validateUserFirstName(User user) {
        int lengthUserFirstName = user.getFirstName().length();
        if (lengthUserFirstName < 3 || lengthUserFirstName > 15) {
            new UserValidationException().exception();
        }
    }

    private void validateUserLastName(User user) {
        int lengthUserLastName = user.getLastName().length();
        if (lengthUserLastName < 3 || lengthUserLastName > 15) {
            new UserValidationException().exception();
        }
    }

    private void validateUserAge(User user) {
        if (user.getAge() < 0 || user.getAge() > 120) {
            new UserValidationException().exception();
        }
    }

    public void validateService(User user) {
        validateUserAge(user);
        validateUserFirstName(user);
        validateUserLastName(user);
    }
}
