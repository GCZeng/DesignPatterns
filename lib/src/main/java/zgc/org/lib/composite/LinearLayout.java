package zgc.org.lib.composite;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/13 下午10:25
 * Description:
 **/
public class LinearLayout extends ViewGroup {
    public LinearLayout(String id) {
        super(id);
    }

    @Override
    public void show() {
        LogUtil.d("线性布局容器：" + id + " 显示");
        for (AbstractView mChild : mChilds) {
            mChild.show();
        }
    }
}
