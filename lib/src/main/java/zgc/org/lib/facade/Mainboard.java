package zgc.org.lib.facade;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/13 下午5:29
 * Description:
 **/
public class Mainboard implements Hardware {
    @Override
    public void start() {
        LogUtil.d("启动主板...");
    }

    @Override
    public void shutdown() {
        LogUtil.d("关闭主板...");
    }
}
