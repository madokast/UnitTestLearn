package sice.learn.zrx.unit.entity;

/**
 * @Description TODO
 * @Date 2021/7/28 16:29
 * @Created by ZhaoRX
 */
public class Info {
    public String data;

    public Info() {
    }

    public Info(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Info{" +
                "data='" + data + '\'' +
                '}';
    }
}
