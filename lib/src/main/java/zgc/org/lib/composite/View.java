package zgc.org.lib.composite;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/13 下午10:24
 * Description:
 **/
public abstract class View implements AbstractView {

    String id;

    public View(String id) {
        this.id = id;
    }

    @Override
    public void addView(AbstractView view) {
        LogUtil.d("该控件不支持此方法");
    }

    @Override
    public void removeView(AbstractView view) {
        LogUtil.d("该控件不支持此方法");
    }
}
