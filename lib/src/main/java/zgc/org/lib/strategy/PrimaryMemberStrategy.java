package zgc.org.lib.strategy;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/4 下午11:02
 * Description: 初级会员
 **/
public class PrimaryMemberStrategy implements MemberStrategy {

    @Override
    public double calcPrice(double price) {
        LogUtil.d("初级会员没有优惠");
        return price;
    }
}
