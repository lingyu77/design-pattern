package design.pattern.singleton;

public class EagerSingleton {

    /*
     * 1. The static variable should be loaded in JVM during the compilation time automatically.
     * 2. Thread-safe
     */
    private static final EagerSingleton eagerSingleton = new EagerSingleton();

    /* The constructor must be private to make sure no other can create a instance. */
    private EagerSingleton() {}

    /* A public static method to access instance */
    public static EagerSingleton getInstance() {
        return eagerSingleton;
    }
}
