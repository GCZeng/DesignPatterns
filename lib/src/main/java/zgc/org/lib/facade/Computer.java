package zgc.org.lib.facade;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/13 下午5:29
 * Description:
 **/
public class Computer {
    private Hardware cpu;
    private Hardware disk;
    private Hardware mainboard;
    private Hardware momery;

    public Computer() {
        cpu = new CPU();
        disk = new Disk();
        mainboard = new Mainboard();
        momery = new Memory();
    }

    /**
     * 启动电脑
     */
    public void start() {
        LogUtil.d("开始启动电脑");
        mainboard.start();
        momery.start();
        cpu.start();
        disk.start();
        LogUtil.d("成功启动电脑");
    }

    public void shutdown() {
        LogUtil.d("开始关闭电脑");
        disk.shutdown();
        momery.shutdown();
        cpu.shutdown();
        mainboard.shutdown();
        LogUtil.d("成功关闭电脑");
    }

}
