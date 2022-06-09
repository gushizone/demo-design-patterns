package tk.gushizone.design.principle.lsp.extend;

/**
 *
 *
 * @author gushizone
 * @date 2022/6/8 17:19
 */
public class LspExtendTest {


    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(10);
        resize(rectangle);

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
