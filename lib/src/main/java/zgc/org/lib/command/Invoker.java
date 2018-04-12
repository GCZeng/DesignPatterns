package zgc.org.lib.command;

/**
 * Author: zgc
 * Time: 2018/4/12 下午12:18
 * Description: 命令调用者：负责调用
 **/
public class Invoker {
    public void execute(Command command) {
        command.execute();
    }
}
