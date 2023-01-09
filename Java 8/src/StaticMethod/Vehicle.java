package src.StaticMethod;

public interface Vehicle {
    default void print() {
        if (isValid())
            System.out.println("Vehicle printed");
    }

    static boolean isValid() {
        System.out.println("Vehicle is valid");
        return true;
    }

    void showLog();
}
