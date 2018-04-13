package zgc.org.lib.facade;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/13 下午5:31
 * Description:
 **/
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        LogUtil.d("\n");
        computer.shutdown();
    }
}
