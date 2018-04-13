package zgc.org.lib.facade;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/13 下午5:33
 * Description:
 **/
public class Memory implements Hardware {
    @Override
    public void start() {
        LogUtil.d("启动内存...");
    }

    @Override
    public void shutdown() {
        LogUtil.d("关闭内存...");
    }
}
