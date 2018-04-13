package zgc.org.lib.composite;

/**
 * Author: zgc
 * Time: 2018/4/13 下午10:23
 * Description:
 **/
public interface AbstractView {
    void addView(AbstractView view);

    void removeView(AbstractView view);

    void show();

}
