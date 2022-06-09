package tk.gushizone.design.principle.lsp.methodin;

import com.google.common.collect.Maps;

/**
 * 里氏替换原则 3: 实现父类方法时, 子类的方法输入要比父类的方法输入更宽松(只能重载, 不能重写)
 *
 * @author gushizone
 * @date 2022/6/9 11:41
 */
public class LspMethodInTest {

    public static void main(String[] args) {
        Base child = new Child();
        child.method(Maps.newHashMap());
    }
}
