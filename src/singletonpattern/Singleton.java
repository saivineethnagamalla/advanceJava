package singletonpattern;

//1. Eager Initialization
public class Singleton {
	private static final Singleton INSTANCE = new Singleton();

	// private constructor to prevent instantiation
	private Singleton() {
	}

	public static Singleton getInstance() {
		return INSTANCE;
	}
}

//2. Lazy Initialization
//public class Singleton {
//    private static Singleton instance;
//
//    // private constructor to prevent instantiation
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}
//
//3. Thread-Safe Singleton
//public class Singleton {
//    private static Singleton instance;
//
//    // private constructor to prevent instantiation
//    private Singleton() {}
//
//    public static synchronized Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//}
//
//4. Double-Checked Locking
//public class Singleton {
//    private static volatile Singleton instance;
//
//    // private constructor to prevent instantiation
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }
//}
//
//5. Bill Pugh Singleton Implementation
//public class Singleton {
//    private Singleton() {}
//
//    private static class SingletonHelper {
//        private static final Singleton INSTANCE = new Singleton();
//    }
//
//    public static Singleton getInstance() {
//        return SingletonHelper.INSTANCE;
//    }
//}

/*** Summary
Eager Initialization: Creates the instance at class loading time but may lead to resource wastage.
Lazy Initialization: Creates the instance when needed but is not thread-safe.
Thread-Safe Singleton: Uses synchronized method, which is thread-safe but has performance overhead.
Double-Checked Locking: Thread-safe and has better performance than synchronized method.
Bill Pugh Singleton: Uses static inner class, efficient and thread-safe.
Enum Singleton: Simple and effective way to create a Singleton, thread-safe, and handles serialization issues ***/