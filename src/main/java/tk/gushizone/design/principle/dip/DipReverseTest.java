package tk.gushizone.design.principle.dip;

import org.junit.Test;
import tk.gushizone.design.principle.dip.notifier.SnsNotifier;

/**
 * 依赖倒置：上层模块不应该依赖下层模块，二者都应该依赖其抽象。
 *
 * @author gushizone@gmail.com
 * @date 2022/4/28 16:22
 */
public class DipReverseTest {

    /**
     * UserManager 依赖具体的 EmailNotifier
     * 缺点：当需要修改下层 Notifier 的实现时，必然要修改上层 UserManager 的功能
     */
    @Test
    public void testV1() {

        UserManagerV1 userManagerV1 = new UserManagerV1();
        userManagerV1.resetPassword("foo");
    }

    /**
     * 依赖倒置
     * UserManager 依赖抽象的 Notifier
     * 优点：当需要修改下层 Notifier 的实现时，不需要修改上层 UserManager 的功能，只需要修改上层构造（或选择不同的构造）
     * 缺点：上层需要管理下层依赖的生命周期
     */
    @Test
    public void testV2() {

        UserManagerV2 userManagerV2 = new UserManagerV2();
        userManagerV2.resetPassword("foo");
    }

    /**
     * 依赖倒置 + 控制反转（依赖注入）
     * UserManager 依赖抽象的 Notifier
     * 当需要修改下层 Notifier 的实现时，不需要修改上层 UserManager，只需要注入不同的依赖即可
     */
    @Test
    public void testV3() {

        UserManagerV3 userManagerV3 = new UserManagerV3();
        userManagerV3.setNotifier(new SnsNotifier());
        userManagerV3.resetPassword("foo");
    }

}
