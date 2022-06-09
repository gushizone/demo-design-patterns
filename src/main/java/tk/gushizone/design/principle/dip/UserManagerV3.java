package tk.gushizone.design.principle.dip;

import tk.gushizone.design.principle.dip.notifier.Notifier;
import tk.gushizone.design.principle.dip.notifier.SnsNotifier;

/**
 * 依赖倒置 + 控制反转(依赖注入，setter 注入)
 *
 * @author gushizone@gmail.com
 * @date 2022/4/28 16:20
 */
public class UserManagerV3 {

    private Notifier notifier;

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    void resetPassword(String username) {

        this.notifier.sendNotify(username + "重置密码成功");
    }
}
