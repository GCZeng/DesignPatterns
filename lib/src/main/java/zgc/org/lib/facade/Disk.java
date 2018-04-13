package zgc.org.lib.facade;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/13 下午5:28
 * Description:
 **/
public class Disk implements Hardware {
    @Override
    public void start() {
        LogUtil.d("启动硬盘...");
    }

    @Override
    public void shutdown() {
        LogUtil.d("关闭硬盘...");
    }
}
