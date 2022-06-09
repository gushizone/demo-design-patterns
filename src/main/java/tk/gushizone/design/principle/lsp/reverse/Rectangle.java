package tk.gushizone.design.principle.lsp.reverse;

/**
 * 长方形
 *
 * @author gushizone
 * @date 2022/6/8 17:23
 */
public class Rectangle {
    private long length;
    private long width;

    public long getWidth() {
        return width;
    }

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
