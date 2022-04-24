package racingcar.view;

public class ErrorMessage {

    public static final String ERROR_PREFIX = "[ERROR] ";

    public static void checkError(boolean b, String s) {
        if (b) {
            throw new IllegalArgumentException(ERROR_PREFIX + s);
        }
    }
}
