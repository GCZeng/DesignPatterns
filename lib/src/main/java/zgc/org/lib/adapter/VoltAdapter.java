package zgc.org.lib.adapter;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/13 下午6:00
 * Description:
 **/
public class VoltAdapter extends Volt220 implements IVolt5 {

    @Override
    public int getVolt5() {
        int volt = getVolt220();
        LogUtil.d("原电压:" + volt + "伏");
        volt = volt / 44;
        LogUtil.d("处理后电压:" + volt + "伏");
        return volt;
    }
}
