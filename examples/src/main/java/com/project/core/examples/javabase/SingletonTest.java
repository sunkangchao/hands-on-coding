package com.project.core.examples.javabase;

/**
 * SingletonTest
 *
 * @author sunkangchao
 * @version 1.0
 * @since <pre>11月 27, 2024</pre>
 */
public class SingletonTest {


//    // 1. 饿汉式
//    private static SingletonTest instance = new SingletonTest();
//
//      // todo: one: 私有构造方法，防止外部通过反射创建实例
//        private SingletonTest() {
//            if (instance != null) {
//                throw new IllegalStateException("Instance already created!");
//            }
//        }
//
//    public static SingletonTest getInstance() {
//        return instance;
//    }
//
//    // todo: two: readResolve 方法确保反序列化时返回同一个实例
//    private Object readResolve() {
//        return instance;
//    }
//    // todo: three: 禁止克隆
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        throw new CloneNotSupportedException("Singleton instance cannot be cloned!");
//    }


//    // 2. 延时加载（同步锁）
//    private static SingletonTest instance = null;
//
//    private SingletonTest() {}
//
//    public synchronized static SingletonTest getInstance() {
//        if (instance == null) {
//            instance = new SingletonTest();
//        }
//        return instance;
//    }

//    // 3. 延时加载（双检锁） volatile 关键字可以防止指令重排优化 避免其它线程获取到未初始化的对象
//    private static volatile SingletonTest instance = null;
//
//    private SingletonTest() {}
//
//    public static SingletonTest getInstance() {
//        if (instance == null) {
//            synchronized (SingletonTest.class) {
//                if (instance == null) {
//                    instance = new SingletonTest();
//                }
//            }
//        }
//        return instance;
//    }

//    // 4. 延时加载（静态内部类）
//    private SingletonTest() {}
//
//
//    private static class SingletonHolder {
//        private static final SingletonTest INSTANCE = new SingletonTest();
//    }
//
//    // 只有调用该方法时才会加载 SingletonHolder 类，从而实例化 INSTANCE
//    public static SingletonTest getInstance() {
//        return SingletonHolder.INSTANCE;
//    }

//    // 5. 延时加载（枚举） 推荐使用 -- 需要把原始类型转化成enum枚举类型 可以防止反序列化破坏单例
//    public enum SingletonEnum {
//        INSTANCE;
//
//        public void doSomething() {
//            System.out.println("do something");
//        }
//
//    }


//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }


//    public static void main(String[] args) throws CloneNotSupportedException {
//        SingletonTest instance1 = SingletonTest.getInstance();
//        System.out.println("instance1:" + instance1);
//        Object cloned = instance1.clone();
//        System.out.println("cloned object" + cloned);
//    }
}
