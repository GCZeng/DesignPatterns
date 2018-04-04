package zgc.org.lib.strategy;

/**
 * Author: zgc
 * Time: 2018/4/4 下午11:02
 * Description: 抽象策略
 **/
public interface MemberStrategy {
    /**
     * 计算价格
     *
     * @param price 商品原价
     * @return 计算打折后的价格
     */
    double calcPrice(double price);
}
