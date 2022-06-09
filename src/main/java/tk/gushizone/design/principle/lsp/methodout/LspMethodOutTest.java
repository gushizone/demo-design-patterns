package tk.gushizone.design.principle.lsp.methodout;

/**
 * 历史替换原则 4: 实现基类抽象方法时, 子类返回值的范围要比基类返回值严格
 *
 * @author gushizone@gmail.com
 * @date 2022/6/9 11:50
 */
public class LspMethodOutTest {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.method());
    }
}
