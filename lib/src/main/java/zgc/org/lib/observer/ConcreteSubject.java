package zgc.org.lib.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: zgc
 * Time: 2018/4/3 下午10:12
 * Description:
 **/
public class ConcreteSubject implements Subject {
    //注意到这个List集合的泛型参数为Observer接口，设计原则：面向接口编程而不是面向实现编程
    private List<Observer> list;
    private String message;

    public ConcreteSubject() {
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (!list.isEmpty())
            list.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < list.size(); i++) {
            Observer oserver = list.get(i);
            oserver.update(message);
        }
    }

    public void updateMsg(String msg) {
        this.message = msg;
        System.out.println("更新消息： " + msg);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
