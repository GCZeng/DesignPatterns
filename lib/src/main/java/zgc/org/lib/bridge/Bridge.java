package zgc.org.lib.bridge;

/**
 * Author: zgc
 * Time: 2018/4/13 下午10:11
 * Description:
 **/
public abstract class Bridge {
    private Sourceable source;

    public void method() {
        source.method();
    }

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }
}
