package validation;

public class NumberInRange implements Validation {
    private final int min;
    private final int max;

    public NumberInRange(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isValid(Object value) {
        if (!(value instanceof Integer)) {
            return false;
        }
        return min < (int) value && (int) value < max;
    }

    @Override
    public String errorMessage() {
        return "Number must be between " + min + " and " + max;
    }
}
