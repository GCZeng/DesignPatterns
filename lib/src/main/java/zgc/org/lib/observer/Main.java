package zgc.org.lib.observer;

/**
 * Author: zgc
 * Time: 2018/4/3 下午10:10
 * Description:
 * 1. 抽象目标角色（Subject）：目标角色知道它的观察者，可以有任意多个观察者观察同一个目标。并且提供注册和删除观察者对象的接口。目标角色往往由抽象类或者接口来实现。
 * <p>
 * 2. 抽象观察者角色（Observer）：为那些在目标发生改变时需要获得通知的对象定义一个更新接口。抽象观察者角色主要由抽象类或者接口来实现。
 * <p>
 * 3. 具体目标角色（Concrete Subject）：将有关状态存入各个Concrete Observer对象。当它的状态发生改变时, 向它的各个观察者发出通知。
 * <p>
 * 4. 具体观察者角色（Concrete Observer）：存储有关状态，这些状态应与目标的状态保持一致。实现Observer的更新接口以使自身状态与目标的状态保持一致。在本角色内也可以维护一个指向Concrete Subject对象的引用。
 **/
public class Main {
    public static void main(String args[]) {
        ConcreteSubject server = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("observer1");
        Observer observer2 = new ConcreteObserver("observer2");
        Observer observer3 = new ConcreteObserver("observer3");

        //注册观察者
        server.registerObserver(observer1);
        server.registerObserver(observer2);
        server.registerObserver(observer3);

        //发消息
        server.updateMsg("这里发出第一条消息!");

        System.out.println("----------------------------------------------");
        //删除观察者
        server.removeObserver(observer2);

        server.updateMsg("这里发出第二条消息!");
    }
}
