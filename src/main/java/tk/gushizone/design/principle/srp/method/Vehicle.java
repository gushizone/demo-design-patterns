package tk.gushizone.design.principle.srp.method;

/**
 * @author gushizone@gmail.com
 * @date 2022/5/15 17:29
 */
public class Vehicle {

    public void runLand(String bird) {
        System.out.println(bird + "在陆地运行~~~");
    }

    public void runAir(String bird) {
        System.out.println(bird + "在天上运行~~~");
    }

    public void runWater(String bird) {
        System.out.println(bird + "在水上运行~~~");
    }

}
