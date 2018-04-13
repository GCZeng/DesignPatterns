package zgc.org.lib.proxys.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import zgc.org.lib.LogUtil;
import zgc.org.lib.proxys.IActor;

/**
 * Author: zgc
 * Time: 2018/4/13 下午4:24
 * Description:
 **/
public class ActorProxy implements InvocationHandler {
    private IActor iActor;

    public ActorProxy(IActor iActor) {
        this.iActor = iActor;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        LogUtil.d("通知演员准备演出...");
        Object object = method.invoke(iActor, objects);
        LogUtil.d("演出结束...");
        return object;
    }
}
