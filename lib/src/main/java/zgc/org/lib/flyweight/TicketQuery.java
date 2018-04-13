package zgc.org.lib.flyweight;

import java.security.AlgorithmConstraints;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/13 下午11:16
 * Description:
 **/
public class TicketQuery implements Ticket {
    private String from;
    private String to;

    public TicketQuery(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void queryPrice() {
        LogUtil.d("从" + from + "到" + to + "的车票价格为:100元\n");
    }
}
