package zgc.org.lib.strategy;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/4 下午11:02
 * Description: 具体策略C
 **/
public class AdvancedMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double price) {
        LogUtil.d("高级会员打8折");
        return price * 0.8;
    }
}
