package tk.gushizone.design.principle.srp.interfaces;

/**
 * @author gushizone@gmail.com
 * @date 2022/5/15 17:29
 */
public interface WaterVehicle {

    default void runWater(String bird) {
        System.out.println(bird + "在水上运行~~~");
    }

}
