package duke.exception;

/**
 * This class handles user-defined exception message.
 */
public class DukeException extends Exception {
    public DukeException(String message) {
        super(message);
    }
}