package lesson10.exceprions.userValidationService;

public class UserValidator {

    private void assertUserNotNull(User user) {
        if (user.getFirstName() == null
                || user.getLastName() == null
                || user == null) {
            throw new UserValidationException("The value cannot be null");
        }
    }

    private void validateUserFirstName(User user) {
        assertUserNotNull(user);
        int lengthUserFirstName = user.getFirstName().length();
        if (lengthUserFirstName < 3 || lengthUserFirstName > 15) {
            throw new UserValidationException("First name exception: enter a name of at least 3 and maximum 15 characters");
        }
    }

    private void validateUserLastName(User user) {
        assertUserNotNull(user);
        int lengthUserLastName = user.getLastName().length();
        if (lengthUserLastName < 3 || lengthUserLastName > 15) {
            throw new UserValidationException("Last name exception: enter a name of at least 3 and maximum 15 characters");
        }
    }

    private void validateUserAge(User user) {
        assertUserNotNull(user);
        if (user.getAge() < 0 || user.getAge() > 120) {
            throw new UserValidationException("Age exception: please specify a value between 0 and 120");
        }
    }

    public void validateUser(User user) {
        validateUserAge(user);
        validateUserFirstName(user);
        validateUserLastName(user);
    }
}
