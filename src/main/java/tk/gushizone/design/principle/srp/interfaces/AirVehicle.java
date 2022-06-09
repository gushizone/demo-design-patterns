package tk.gushizone.design.principle.srp.interfaces;

/**
 * @author gushizone@gmail.com
 * @date 2022/5/15 17:29
 */
public interface AirVehicle {

    default void runAir(String bird) {
        System.out.println(bird + "在天上运行~~~");
    }

}
