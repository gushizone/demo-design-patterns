package tk.gushizone.design.principle.dip;

import tk.gushizone.design.principle.dip.notifier.Notifier;
import tk.gushizone.design.principle.dip.notifier.SnsNotifier;

/**
 * 依赖倒置
 *
 * @author gushizone@gmail.com
 * @date 2022/4/28 16:20
 */
public class UserManagerV2 {

    private Notifier notifier;

    public UserManagerV2() {
//        this.notifier = new EmailNotifier();
        this.notifier = new SnsNotifier();
    }

    void resetPassword(String username) {

        this.notifier.sendNotify(username + "重置密码成功");
    }
}
