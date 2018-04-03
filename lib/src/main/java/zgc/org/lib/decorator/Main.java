package zgc.org.lib.decorator;

import sun.rmi.runtime.Log;
import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/3 下午9:36
 * Description:
 * <p>
 * 装饰者模式：动态地将责任附加到对象上，若要扩展对象，装饰者模式提供了比继承更弹性的替代方案
 * 要点： 装饰者与被装饰者拥有共同的超类，继承的目的是继承类型，而不是行为
 * <p>
 * 装饰者包含一个超类的对象，这样，可以在被装饰者行为前或者行为后加上新的行为，甚至取代原有的行为
 * 装饰者会使程序中出现很多小类，增加使用难度
 * <p>
 * 使用场景：对象由主体+许多可选的部件或者功能构成，使用继承或者接口会产生很多类，且很难扩展。
 * 例如，现在需要一个汉堡，主体是汉堡，可以选择添加牛肉、生菜等等许多其他的配料，
 * 这种情况下就可以使用装饰者模式。
 **/
public class Main {
    public static void main(String[] args) {
        HamburgerComponent hamburgerComponent = new HamburgerConcretComponent();
        LogUtil.d(hamburgerComponent.getName() + " " + hamburgerComponent.getPrice());
        hamburgerComponent = new BeefDecorator(hamburgerComponent);
        LogUtil.d(hamburgerComponent.getName() + " " + hamburgerComponent.getPrice());
        hamburgerComponent = new LettuceDecorator(hamburgerComponent);
        LogUtil.d(hamburgerComponent.getName() + " " + hamburgerComponent.getPrice());
    }
}
