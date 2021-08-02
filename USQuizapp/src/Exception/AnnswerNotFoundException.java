package Exception;

public class AnnswerNotFoundException extends Exception {
    public AnnswerNotFoundException(Long anserId) {
        super("Answer" + anserId + " not found");
    }
}

