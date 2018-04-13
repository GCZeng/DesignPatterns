package zgc.org.lib.composite;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/13 下午10:26
 * Description:
 **/
public class TextView extends View {
    public TextView(String id) {
        super(id);
    }

    @Override
    public void show() {
        LogUtil.d("文字控件：" + id + " 显示");
    }
}
