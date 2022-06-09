package tk.gushizone.design.principle.lod.reverse;

import org.assertj.core.util.Lists;

import java.util.List;

/**
 * @author gushizone
 * @date 2022/5/29 17:25
 */
public class Boss {

    /**
     * 朋友包含 参数，返回值，成员变量，不包含方法体内的变量。
     * 如：这里 Boss 不需要直接关注 Staff，不需要依赖。
     */
    public void checkNumber(Manager manager) {
        List<Staff> staffs =  Lists.newArrayList();
        for (int i = 0; i < 20; i++) {
            staffs.add(new Staff(i));
        }
        manager.checkNumber(staffs);
    }


}
