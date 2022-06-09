package tk.gushizone.design.principle.lod;

import org.assertj.core.util.Lists;

import java.util.List;

/**
 * @author gushizone
 * @date 2022/5/29 17:25
 */
public class Manager {

    public void checkNumber() {
        List<Staff> staffs =  Lists.newArrayList();
        for (int i = 0; i < 20; i++) {
            staffs.add(new Staff(i));
        }
        System.out.println("到岗员工："  + staffs.size());
    }
}
