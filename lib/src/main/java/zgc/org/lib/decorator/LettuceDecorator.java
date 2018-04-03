package zgc.org.lib.decorator;

/**
 * Author: zgc
 * Time: 2018/4/3 下午9:52
 * Description:
 **/
public class LettuceDecorator implements HamburgerComponent {
    private HamburgerComponent hamburgerComponent;

    public LettuceDecorator(HamburgerComponent hamburgerComponent) {
        this.hamburgerComponent = hamburgerComponent;

    }

    @Override
    public String getName() {
        return hamburgerComponent.getName() + " 生菜";
    }

    @Override
    public double getPrice() {
        return hamburgerComponent.getPrice() + 5.00;
    }
}
