package zgc.org.lib.singleton;

/**
 * 一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。
 * 只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。
 * 如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。
 * 如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。
 * Created by zgc on 2018/2/23.
 */

public class Main {
    public static void main(String[] args) {
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        //获取唯一可用的对象
        SingleObject object = SingleObject.getInstance();
        //显示消息
        object.showMessage();

        //懒汉式，线程不安全
        SingletonLazyThreadUnsafe singletonLazyThreadUnsafe = SingletonLazyThreadUnsafe.getInstance();
        singletonLazyThreadUnsafe.showMessage();

        //懒汉式，线程不安全
        SingletonLazyThreadSafety singletonLazyThreadSafety = SingletonLazyThreadSafety.getInstance();
        singletonLazyThreadSafety.showMessage();

        //饿汉式，线程安全
        SingletonUnLazy singletonUnLazy = SingletonUnLazy.getInstance();
        singletonUnLazy.showMessage();

        //双检锁/双重校验锁
        SingletonDoubleCheckedLocking singletonDoubleCheckedLocking = SingletonDoubleCheckedLocking.getSingleton();
        singletonDoubleCheckedLocking.showMessage();

        //登记式/静态内部类
        SingletonStaticState singletonStaticState = SingletonStaticState.getInstance();
        singletonStaticState.showMessage();

        //枚举
        SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
        singletonEnum.whateverMethod();
    }
}
