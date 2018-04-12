package zgc.org.lib.state;


/**
 * Author: zgc
 * Time: 2018/4/12 下午6:08
 * Description:
 * 1. Context类，定义客户端所感兴趣的接口，并且内部维护一个具体状态类的实例，从而维护了对象的现有状态。
 * 2. State：抽象状态类或状态接口，用以抽象封装行为。
 * 3. ConcreteState类：具体状态类，实现了State中的抽象方法。
 **/
public class Main {
    public static void main(String[] args) {
        //用户在MainActivity点击收藏按钮
        LogInContext.getInstance().collect();//注销账户
        LogInContext.getInstance().setState(new LogOutState());

        LogInContext.getInstance().collect();
        LogInContext.getInstance().setState(new LogInState());

        LogInContext.getInstance().collect();
    }
}
