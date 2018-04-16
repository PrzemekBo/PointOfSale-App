package basic;

public final class Validator {

        private Validator() {}

        public static void checkNotNull(Object object) {
            if (object == null) {
                throw new NullPointerException();
            }
        }




}
