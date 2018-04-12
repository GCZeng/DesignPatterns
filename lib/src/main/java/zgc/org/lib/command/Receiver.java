package zgc.org.lib.command;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/12 下午12:17
 * Description: 命令接收者：执行命令
 **/
public class Receiver {
    public void turnON() {
        LogUtil.d("开灯。。。");
    }

    public void turnOFF() {
        LogUtil.d("关灯。。。");
    }
}
