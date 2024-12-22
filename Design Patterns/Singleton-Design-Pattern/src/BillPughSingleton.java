/**
 * private inner static class that contains the instance of singletone class.
 * when singleton class is loaded, SingletonHelper class is not loaded into memory
 * and only when someone calls the getInstance() method,
 * this class gets loaded and creates the singleton class instance.
 */

public class BillPughSingleton {
    private BillPughSingleton(){}

    private static class SingletonHelper{
        @SuppressWarnings("InstantiationOfUtilityClass")
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
