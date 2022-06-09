package tk.gushizone.design.principle.isp;

/**
 * 接口隔离原则：从客户端角度出发，尽量不必要的依赖，使用最小接口。
 * 如：这里 Dog 就不应该依赖 AnimalAction 总接口，而是仅依赖需要的接口。
 *
 * @author gushizone
 * @date 2022/5/29 16:58
 */
public class Dog implements EatAnimalAction, SwimAnimalAction {

    @Override
    public void eat() {

    }

    @Override
    public void swim() {

    }
}
