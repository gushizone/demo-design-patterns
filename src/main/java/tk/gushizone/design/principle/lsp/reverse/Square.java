package tk.gushizone.design.principle.lsp.reverse;

/**
 * 正方形
 *
 * @author gushizone
 * @date 2022/6/8 17:23
 */
public class Square extends Rectangle {
    private long sideLength;

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public long getWidth() {
        return sideLength;
    }

    @Override
    public long getLength() {
        return sideLength;
    }

    @Override
    public void setLength(long length) {
        this.sideLength = length;
    }

    @Override
    public void setWidth(long width) {
        this.sideLength = width;
    }
}
