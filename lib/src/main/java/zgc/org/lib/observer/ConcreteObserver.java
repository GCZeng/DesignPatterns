package zgc.org.lib.observer;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/3 下午10:01
 * Description:
 **/
public class ConcreteObserver implements Observer {
    private String name="";

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        LogUtil.d(name + ":" + msg);
    }
}
