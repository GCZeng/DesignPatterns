package zgc.org.lib.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import zgc.org.lib.LogUtil;

/**
 * Author: zgc
 * Time: 2018/4/13 下午11:19
 * Description:
 **/
public class TicketFactory {
    static Map<String, Ticket> map = new ConcurrentHashMap<String, Ticket>();

    public static Ticket getTicket(String from, String to) {
        String key = from + to;
        if (map.containsKey(key)) {
            LogUtil.d("使用缓存查询" + key);
            return map.get(key);
        } else {
            LogUtil.d("创建对象查询" + key);
            Ticket ticket = new TicketQuery(from, to);
            map.put(key, ticket);
            return ticket;
        }
    }
}
