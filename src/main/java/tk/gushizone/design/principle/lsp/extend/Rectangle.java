package tk.gushizone.design.principle.lsp.extend;

/**
 * 长方形
 *
 * @author gushizone
 * @date 2022/6/8 17:23
 */
public class Rectangle implements Quadrangle {
    private long length;
    private long width;

    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
