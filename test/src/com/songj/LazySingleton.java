/**
 * 单例模式5种形式
 */

 //1.懒汉式
public class LazySingleton{]
    private static LazySingleton lazySingleton;
    private LazySingleton(){};    public static LazySingleton getLazySingleton(){
                lazySingleton = new LazySingleton();{
        }
    
                 return lazySingleton;
} 
   }
}
//2.饿汉式
public class Singleton1{
    private static Singleton1 singleton = new Singleton1;
    private Singleton1(){};
    public static Singleton1 getSingleton1(){
        return singleton1;
    }
}


/**
 * 多线程下线程安全的懒汉式单例（饿汉式本身是线程安全的）
 */

// 线程安全的懒汉式单例
public class Singleton2 {
 
    private static Singleton2 singleton2;
 
    private Singleton2(){}
 
    // 使用 synchronized 修饰，临界资源的同步互斥访问
    public static synchronized Singleton2 getSingleton2(){
        if (singleton2 == null) {
            singleton2 = new Singleton2();
        }
        return singleton2;
    }

//同步延迟加载 — synchronized块

// 线程安全的懒汉式单例
public class Singleton2 {
 
    private static Singleton2 singleton2;
 
    private Singleton2(){}
 
 
    public static Singleton2 getSingleton2(){
        synchronized(Singleton2.class){  // 使用 synchronized 块，临界资源的同步互斥访问
            if (singleton2 == null) { 
                singleton2 = new Singleton2();
            }
        }
        return singleton2;
    }

  
//同步延迟加载 — 使用内部类实现延迟加载
// 线程安全的懒汉式单例
public class Singleton5 {
 
    // 私有内部类，按需加载，用时加载，也就是延迟加载
    private static class Holder {
        private static Singleton5 singleton5 = new Singleton5();
    }
 
    private Singleton5() {
 
    }
 
    public static Singleton5 getSingleton5() {
        return Holder.singleton5;


  //双重检测  
// 线程安全的懒汉式单例
public class Singleton3 {
 
    //使用volatile关键字防止重排序，因为 new Instance()是一个非原子操作，可能创建一个不完整的实例
    private static volatile Singleton3 singleton3;
 
    private Singleton3() {
    }
 
    public static Singleton3 getSingleton3() {
        // Double-Check idiom
        if (singleton3 == null) {
            synchronized (Singleton3.class) {       // 1
                // 只需在第一次创建实例时才同步
                if (singleton3 == null) {       // 2
                    singleton3 = new Singleton3();      // 3
                }
            }
        }
        return singleton3;
    }


    //ThreadLocal
    
public class Singleton {
 
    // ThreadLocal 线程局部变量，将单例instance线程私有化
    private static ThreadLocal<Singleton> threadlocal = new ThreadLocal<Singleton>();
    private static Singleton instance;
 
    private Singleton() {
 
    }
 
    public static Singleton getInstance() {
 
        // 第一次检查：若线程第一次访问，则进入if语句块；否则，若线程已经访问过，则直接返回ThreadLocal中的值
        if (threadlocal.get() == null) {
            synchronized (Singleton.class) {
                if (instance == null) {  // 第二次检查：该单例是否被创建
                    instance = new Singleton();
                }
            }
            threadlocal.set(instance); // 将单例放入ThreadLocal中
        }
        return threadlocal.get();
    }
