package zgc.org.lib.strategy;

/**
 * Author: zgc
 * Time: 2018/4/4 下午11:01
 * Description: 环境
 **/
public class Price {
    //持有一个具体策略的对象
    private MemberStrategy strategy;

    public Price(MemberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 策略方法
     */
    public double quote(double price) {
        return strategy.calcPrice(price);
    }
}
