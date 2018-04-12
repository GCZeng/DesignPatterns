package zgc.org.lib.command;

/**
 * Author: zgc
 * Time: 2018/4/12 下午12:16
 * Description: 具体命令->开灯
 **/
public class LightOnCommand implements Command {
    private Receiver receiver;

    public LightOnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnON();
    }
}
