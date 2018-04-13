package zgc.org.lib.bridge;

/**
 * Author: zgc
 * Time: 2018/4/13 下午10:11
 * Description:
 **/
public class MyBridge extends Bridge {
    public void method(){
        getSource().method();
    }
}
