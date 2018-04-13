package zgc.org.lib.adapter;

import sun.rmi.runtime.Log;
import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/13 下午6:03
 * Description:
 **/
public class Main {
    public static void main(String[] args) {
        //类适配器
        VoltAdapter voltAdapter = new VoltAdapter();
        voltAdapter.getVolt5();

        LogUtil.d("");
        //对象适配器
        Volt220 volt220 = new Volt220();
        VoltAdapter2 voltAdapter2 = new VoltAdapter2(volt220);
        voltAdapter.getVolt5();
    }
}
