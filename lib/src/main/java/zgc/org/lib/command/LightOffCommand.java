package zgc.org.lib.command;

/**
 * Author: zgc
 * Time: 2018/4/12 下午12:16
 * Description: 具体命令->关灯
 **/
public class LightOffCommand implements Command {
    private Receiver receiver;

    public LightOffCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.turnOFF();
    }
}
