package zgc.org.lib.singleton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 * Created by zgc on 2018/2/23.
 */

public class SingletonDoubleCheckedLocking {
    private volatile static SingletonDoubleCheckedLocking singleton;

    private SingletonDoubleCheckedLocking() {
    }

    public static SingletonDoubleCheckedLocking getSingleton() {
        if (singleton == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if (singleton == null) {
                    singleton = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return singleton;
    }

    public void showMessage() {
        System.out.println("双检锁/双重校验锁");
    }
}
