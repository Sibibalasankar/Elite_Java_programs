package app;

public class DepartmentInvalidException extends Exception {
    public DepartmentInvalidException(String message) {
        super("Invalid Department: " + message);
    }
}
