package zgc.org.lib.decorator;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/3 下午9:32
 * Description:
 **/
public class BeefDecorator implements HamburgerComponent {

    private HamburgerComponent hamburgerComponent;

    public BeefDecorator(HamburgerComponent hamburgerComponent) {
        this.hamburgerComponent = hamburgerComponent;

    }

    @Override
    public String getName() {
        return hamburgerComponent.getName() + " 牛肉";
    }

    @Override
    public double getPrice() {
        return hamburgerComponent.getPrice() + 10.00;
    }
}
