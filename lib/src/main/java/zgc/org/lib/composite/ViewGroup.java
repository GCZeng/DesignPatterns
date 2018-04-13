package zgc.org.lib.composite;

import java.util.LinkedList;

/**
 * Author: zgc
 * Time: 2018/4/13 下午10:24
 * Description:
 **/
public abstract class ViewGroup implements AbstractView {
    String id;

    public ViewGroup(String id){
        this.id = id;
    }

    protected LinkedList<AbstractView> mChilds = new LinkedList<>();

    @Override
    public void addView(AbstractView view) {
        mChilds.add(view);
    }

    @Override
    public void removeView(AbstractView view) {
        mChilds.remove(view);
    }
}
