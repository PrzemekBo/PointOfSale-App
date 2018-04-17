package basic;

public final class Validator {

    void checkNotNull(Object object) {
        if (object == null) {
            throw new NullPointerException();
        }
    }
}
