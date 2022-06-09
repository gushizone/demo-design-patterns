package tk.gushizone.design.principle.lsp.methodin;

import java.util.Map;

/**
 * @author gushizone@gmail.com
 * @date 2022/6/9 11:50
 */
public class Child extends Base {

//
//    @Override
//    public void method(HashMap<String, String> list) {
//        super.method(list);
//    }

    public void method(Map<String, String> list) {
        System.out.println("子类HashMap入参方法被执行");
    }
}
