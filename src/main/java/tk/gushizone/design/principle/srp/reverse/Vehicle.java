package tk.gushizone.design.principle.srp.reverse;

/**
 * @author gushizone@gmail.com
 * @date 2022/5/15 17:29
 */
public class Vehicle {

    public void run(String bird) {
        if ("汽车".equals(bird)) {
            System.out.println(bird + "在陆地运行~~~");
        } else if ("飞机".equals(bird)) {
            System.out.println(bird + "在天上运行~~~");
        } else if ("船".equals(bird)) {
            System.out.println(bird + "在水上运行~~~");
        }
    }

}
