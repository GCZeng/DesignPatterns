package zgc.org.lib.proxys.statics;

import zgc.org.lib.LogUtil;
import zgc.org.lib.proxys.IActor;

/**
 * Author: zgc
 * Time: 2018/4/13 下午4:20
 * Description: 演员经理人
 **/
public class ActorProxy implements IActor {
    private IActor iActor;

    public ActorProxy(IActor iActor) {
        this.iActor = iActor;
    }

    @Override
    public void show() {
        if (iActor != null) {
            LogUtil.d("通知演员准备演出...");
            iActor.show();
            LogUtil.d("演出结束...");
        }
    }
}
