package zgc.org.lib.state;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/12 下午6:14
 * Description:
 **/
public class LogInState implements State {
    @Override
    public void collect() {
        LogUtil.d("收藏成功");
    }
}
