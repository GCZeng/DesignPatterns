package zgc.org.lib.observer;

/**
 * Author: zgc
 * Time: 2018/4/3 下午10:00
 * Description: 抽象观察者
 **/
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
