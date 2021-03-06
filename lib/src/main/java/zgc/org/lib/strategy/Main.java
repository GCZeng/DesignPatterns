package zgc.org.lib.strategy;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/4 下午11:10
 * Description:
 * 策略模式是对算法的包装，是把使用算法的责任和算法本身分割开来，委派给不同的对象管理。策略模式通常把一个系列的算法包装到一系列的策略类里面，作为一个抽象策略类的子类。用一句话来说，就是：“准备一组算法，并将每一个算法封装起来，使得它们可以互换”。下面就以一个示意性的实现讲解策略模式实例的结构。
 * 这个模式涉及到三个角色：
 * ●　　环境(Context)角色：持有一个Strategy的引用。
 * ●　　抽象策略(Strategy)角色：这是一个抽象角色，通常由一个接口或抽象类实现。此角色给出所有的具体策略类所需的接口。
 * ●　　具体策略(ConcreteStrategy)角色：包装了相关的算法或行为。
 **/
public class Main {
    private static double productPrice = 300;

    public static void main(String[] args) {
        showPrice("商品价格:%.2f元\n", productPrice);

        //初级会员
        //选择并创建需要使用的策略对象
        MemberStrategy strategy = new PrimaryMemberStrategy();
        //创建环境
        Price price = new Price(strategy);
        //计算价格
        showPrice("初级会员买此商品的价格:%.2f元\n", price.quote(productPrice));

        //中级会员
        //选择并创建需要使用的策略对象
        strategy = new IntermediateMemberStrategy();
        //创建环境
        price = new Price(strategy);
        //计算价格
        showPrice("中级会员买此商品的价格:%.2f元\n", price.quote(productPrice));

        //高级会员
        //选择并创建需要使用的策略对象
        strategy = new AdvancedMemberStrategy();
        //创建环境
        price = new Price(strategy);
        //计算价格
        showPrice("高级会员买此商品的价格:%.2f元\n", price.quote(productPrice));

    }

    public static void showPrice(String msg, double price) {
        LogUtil.d(String.format(msg, price));
    }
}
