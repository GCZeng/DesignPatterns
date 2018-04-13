package zgc.org.lib.prototype.deep;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: zgc
 * Time: 2018/4/13 下午5:01
 * Description:
 **/
public class Sheep implements Cloneable ,Serializable{
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private String sname;
    private Date birthday;

    public Sheep(String sname, Date birthday) {
        this.sname = sname;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //直接调用Object对象的clone方法
        Object obj = super.clone();
        //深克隆：把对象下的所有属性也克隆出来
        Sheep s = (Sheep) obj;
        s.birthday = (Date) this.birthday.clone();
        return s;
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
