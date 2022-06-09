package tk.gushizone.design.principle.lsp.reverse;

/**
 * 一般可以任务正方形是特殊的长方形, 但在这个示例(resize)中不成立.
 * 这里适用基类的方法并不适用子类, 所以不符合里氏替换原则, 即继承关系成立.
 * 解决方案
 * - 改变继承关系, 新增一个类, 作为基类
 * - 改继承为组合
 *
 * @author gushizone
 * @date 2022/6/8 17:19
 */
public class LspReverseTest {


    public static void main(String[] args) {

//        Rectangle rectangle = new Rectangle();
//        rectangle.setLength(10);
//        rectangle.setWidth(10);
//        resize(rectangle);

        Square square = new Square();
        square.setLength(10);
        resize(square);

    }

    /**
     * 调整长和宽: 让 with > length
     */
    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:"+rectangle.getWidth() + " length:"+rectangle.getLength());
        }
        System.out.println("resize方法结束 width:"+rectangle.getWidth() + " length:"+rectangle.getLength());
    }
}
