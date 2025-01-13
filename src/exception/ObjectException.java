package exception;

public class ObjectException extends Exception {
    private String name;

    public ObjectException(String name) {
        this.name = name;
    }

    public String getMessage() {
        return name + " и так прячется";
    }
}
