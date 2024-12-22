public class DoubleLockingSingleton {
    private static DoubleLockingSingleton instance;
    private DoubleLockingSingleton(){}

    public static DoubleLockingSingleton getInstance(){
        if (instance==null){
            synchronized (ThreadSafeSingleton.class){
                if (instance==null){
                    instance=new DoubleLockingSingleton();
                }
            }
        }
        return instance;
    }
}
