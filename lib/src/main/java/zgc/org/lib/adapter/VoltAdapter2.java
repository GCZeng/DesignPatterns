package zgc.org.lib.adapter;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/13 下午6:02
 * Description:
 **/
public class VoltAdapter2 implements IVolt5 {
    private Volt220 volt220;

    public VoltAdapter2(Volt220 volt220) {
        this.volt220 = volt220;
    }

    @Override
    public int getVolt5() {
        int volt = volt220.getVolt220();
        LogUtil.d("原电压:" + volt + "伏");
        volt = volt / 44;
        LogUtil.d("处理后电压:" + volt + "伏");
        return volt;
    }
}
