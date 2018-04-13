package zgc.org.lib.proxys;

import zgc.org.lib.LogUtil;
import zgc.org.lib.proxys.IActor;

/**
 * Author: zgc
 * Time: 2018/4/13 下午4:19
 * Description: 演员
 **/
public class Actor implements IActor {
    @Override
    public void show() {
        LogUtil.d("演员开始演出...");
    }
}
