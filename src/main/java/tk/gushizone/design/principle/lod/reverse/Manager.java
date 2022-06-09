package tk.gushizone.design.principle.lod.reverse;

import java.util.List;

/**
 * @author gushizone
 * @date 2022/5/29 17:25
 */
public class Manager {

    public void checkNumber(List<Staff> staffs) {
        System.out.println("到岗员工："  + staffs.size());
    }
}
