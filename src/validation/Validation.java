package validation;

public interface Validation {
    // It only has public methods
    // No method has an implementation
    // therefore no method has a body

    public boolean isValid(Object value);
    public String errorMessage();

}
