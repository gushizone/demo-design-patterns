package tk.gushizone.design.principle.lsp.extend;

/**
 * 正方形
 *
 * @author gushizone
 * @date 2022/6/8 17:23
 */
public class Square implements Quadrangle {
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
}
