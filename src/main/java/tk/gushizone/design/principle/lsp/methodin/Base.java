package tk.gushizone.design.principle.lsp.methodin;

import java.util.HashMap;

/**
 * @author gushizone@gmail.com
 * @date 2022/6/9 11:50
 */
public class Base {
    public void method(HashMap<String, String> list){
        System.out.println("父类被执行");
    }
}
