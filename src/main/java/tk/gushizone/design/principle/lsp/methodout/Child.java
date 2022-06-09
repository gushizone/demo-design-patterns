package tk.gushizone.design.principle.lsp.methodout;

import com.google.common.collect.Maps;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author gushizone@gmail.com
 * @date 2022/6/9 11:50
 */
public class Child extends Base {

//    子类重写基类方法, 编译器不允许, 子类返回值范围大于基类返回值
//    @Override
//    public Map<String, String> method() {
//        System.out.println("子类method被执行");
//        return Maps.newHashMap();
//    }

    @Override
    public LinkedHashMap<String, String> method() {
        System.out.println("子类method被执行");
        return Maps.newLinkedHashMap();
    }
}
