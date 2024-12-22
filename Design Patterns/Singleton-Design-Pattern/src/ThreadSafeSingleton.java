public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance==null){
            //noinspection InstantiationOfUtilityClass
            instance=new ThreadSafeSingleton();
        }
        return instance;
    }
}
