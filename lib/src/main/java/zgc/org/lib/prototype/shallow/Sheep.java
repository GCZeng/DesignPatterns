package zgc.org.lib.prototype.shallow;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: zgc
 * Time: 2018/4/13 下午5:01
 * Description:
 **/
public class Sheep implements Cloneable {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private String sname;
    private Date birthday;

    public Sheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getBirthdayStr() {
        return sdf.format(birthday);
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
