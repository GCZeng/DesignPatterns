package zgc.org.lib.facade;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/13 下午5:27
 * Description:
 **/
public class CPU implements Hardware {

    @Override
    public void start() {
        LogUtil.d("启动CPU...");
    }

    @Override
    public void shutdown() {
        LogUtil.d("关闭CPU...");
    }
}
