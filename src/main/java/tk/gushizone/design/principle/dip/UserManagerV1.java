package tk.gushizone.design.principle.dip;

import tk.gushizone.design.principle.dip.notifier.EmailNotifier;
import tk.gushizone.design.principle.dip.notifier.SnsNotifier;

/**
 * @author gushizone@gmail.com
 * @date 2022/4/28 16:20
 */
public class UserManagerV1 {

//    EmailNotifier emailNotifier;

    SnsNotifier snsNotifier;

    public UserManagerV1() {
//        this.emailNotifier = new EmailNotifier();
        this.snsNotifier = new SnsNotifier();
    }

    void resetPassword(String username){

        // ...

//        this.emailNotifier.sendNotify(username + "重置密码成功");
        this.snsNotifier.sendNotify(username + "重置密码成功");
    }

}
