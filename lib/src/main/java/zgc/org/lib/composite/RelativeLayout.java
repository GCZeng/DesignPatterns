package zgc.org.lib.composite;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/13 下午10:25
 * Description:
 **/
public class RelativeLayout extends ViewGroup {
    public RelativeLayout(String id) {
        super(id);
    }

    @Override
    public void show() {
        LogUtil.d("相对布局容器：" + id + " 显示");
        for (AbstractView mChild : mChilds) {
            mChild.show();
        }
    }
}
