package design.pattern.singleton;

public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton() {}

    /* 1. If system need take lots of resource when creating a instance, we might consider creating it when need
     *    instead of in the compilation time.
     * 2. Add synchronized keyword for thread safe. Double-checked locking (DCL) does not work reliably, and
     *    synchronize the whole method instead.
     */
    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
