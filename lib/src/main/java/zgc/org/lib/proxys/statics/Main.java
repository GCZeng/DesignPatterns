package zgc.org.lib.proxys.statics;

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
        IActor actorProxy = new ActorProxy(actor);
        actorProxy.show();
    }
}
