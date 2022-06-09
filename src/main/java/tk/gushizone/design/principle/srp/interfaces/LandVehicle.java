package tk.gushizone.design.principle.srp.interfaces;

/**
 * @author gushizone@gmail.com
 * @date 2022/5/15 17:29
 */
public interface LandVehicle {

    default void runLand(String bird) {
        System.out.println(bird + "在陆地运行~~~");
    }

}
