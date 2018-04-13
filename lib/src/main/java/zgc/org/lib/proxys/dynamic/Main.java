package zgc.org.lib.proxys.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import zgc.org.lib.proxys.Actor;
import zgc.org.lib.proxys.IActor;

/**
 * Author: zgc
 * Time: 2018/4/13 下午4:20
 * Description:
 **/
public class Main {
    public static void main(String args[]) {
        IActor actor = new Actor();
        InvocationHandler invocationHandler= new ActorProxy(actor);
        ClassLoader classLoader = actor.getClass().getClassLoader();
        Class[] clazzs = actor.getClass().getInterfaces();
        IActor iActor = (IActor) Proxy.newProxyInstance(classLoader,clazzs,invocationHandler);
        iActor.show();
    }
}
