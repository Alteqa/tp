package seedu.address.model.appointment.exceptions;

/**
 * Signals that the operation is unable to find the specified person.
 */
public class AppointmentNotFoundException extends RuntimeException {
    public AppointmentNotFoundException() {
        super("Unable to locate appointment");
    }
}
