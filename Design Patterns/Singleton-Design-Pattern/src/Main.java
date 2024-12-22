import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /**
         * not recommended eager initialization of class instance
         * even if it is not being used anywhere
         */
        EagerInitializedSingleton singleton=EagerInitializedSingleton.getInstance();
        /**
         * solution: Lazy initialization
         * instance of class will be created only when it is will be called.
         * not when the class is loaded.
         */
        LazyInitializedSingleton singleton1=LazyInitializedSingleton.getInstance();
        /**
         * thread safe lazy initialization
         * so that if 2 threads call the getInstance() at the same time,
         * it doesn't end up creating 2 instances.
         */
        ThreadSafeSingleton singleton2=ThreadSafeSingleton.getInstance();
        /**
         * as every time getInstance() is called,
         * it puts the lock and then releases the lock
         * too much overhead
         * so, double checked locking solves this problem by only putting the lock when instance is null.
         * no need of lock when when instance is already created
         */
        DoubleLockingSingleton singleton3=DoubleLockingSingleton.getInstance();
        /**
         * still there is a problem with double checked locking.
         * let's say 2 threads call getInstance() at the same time.
         * both will find the instance null
         * so, one of them will get an access to put a lock and creates an instance.
         * but this instance will not be flushed directly to memory. it will be stored temporarily in it's L1 cache.
         * so, when second thread gets an access to put a lock , it will not see the instance in the memory
         * and it will also create an instance.
         * this problem can be solved using volatile keyword, which directly works with memory and
         * doesn't store the instance in cache.
         * but there will be overhead for accessing memory.
         * so, private static inner class solves this problem.
         */
        BillPughSingleton singleton4=BillPughSingleton.getInstance();




        SerializedSingleton singleton5=SerializedSingleton.getInstance();
        ObjectOutput out=new ObjectOutputStream(new FileOutputStream("file.ser"));
        out.writeObject(singleton5);
        out.close();

        ObjectInput in=new ObjectInputStream(new FileInputStream("file.ser"));
        SerializedSingleton singleton5_2=(SerializedSingleton) in.readObject();
        in.close();

        System.out.println("singleton5 instance 1 hashcode "+singleton5.hashCode());
        System.out.println("singleton5 instance 2 hashcode "+singleton5_2.hashCode());

    }
}