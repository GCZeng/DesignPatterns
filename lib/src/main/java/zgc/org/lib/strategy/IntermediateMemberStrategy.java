package zgc.org.lib.strategy;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/4 下午11:02
 * Description: 中级会员
 **/
public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double price) {
        LogUtil.d("中级会员打9折");
        return price * 0.9;
    }
}
