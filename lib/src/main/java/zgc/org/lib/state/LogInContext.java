package zgc.org.lib.state;

/**
 * Author: zgc
 * Time: 2018/4/12 下午6:15
 * Description:
 **/
public class LogInContext {
    private State mState = new LogOutState();//初始化为未登录状态
    private static LogInContext mLogInContext = new LogInContext();

    private LogInContext() {
    }

    //使用单例模式提供管理类实例
    public static LogInContext getInstance() {
        return mLogInContext;
    }

    public void collect() {
        mState.collect();
    }

    public void setState(State state) {
        this.mState = state;
    }
}
