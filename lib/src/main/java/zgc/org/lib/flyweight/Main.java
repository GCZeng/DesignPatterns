package zgc.org.lib.flyweight;

/**
 * Author: zgc
 * Time: 2018/4/13 下午11:20
 * Description:
 **/
public class Main {
    public static void main(String[] args) {
        TicketFactory.getTicket("A", "B").queryPrice();
        TicketFactory.getTicket("A", "C").queryPrice();
        TicketFactory.getTicket("A", "B").queryPrice();
        TicketFactory.getTicket("B", "C").queryPrice();
        TicketFactory.getTicket("A", "B").queryPrice();
    }
}
