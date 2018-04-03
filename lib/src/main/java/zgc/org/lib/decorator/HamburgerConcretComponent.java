package zgc.org.lib.decorator;

/**
 * Author: zgc
 * Time: 2018/4/3 下午9:29
 * Description:
 **/
public class HamburgerConcretComponent implements HamburgerComponent {
    private String name = "汉堡";
    private double price = 5.00;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
