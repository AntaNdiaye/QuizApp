package Exception;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(Long userId) {
        super("User " + userId + " already exist in database");
    }
}
